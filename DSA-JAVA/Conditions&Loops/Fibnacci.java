import java.util.Scanner;
public class Fibnacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first_term=0;
        int next_term=1;
        int count=2;
        while(count<=n)
        {   int temp=next_term;
            next_term= next_term+first_term;
            first_term=temp;
            count++;
        }
        System.out.println(next_term);
    }
}
