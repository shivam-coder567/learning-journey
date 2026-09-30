import java.util.Scanner;
public interface CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character:");
        char ch = sc.next().trim().charAt(0);
        if(ch>='a' && ch<='z')
        {
            System.out.println("LOWER CASE");
        }
        else{
                 System.out.println("UPPER CASE");

        }
    }
}
