import java.util.Scanner;
public class Inputs
{
    public static void main(String a[])
    {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the value :");
        int value = input.nextInt();
        System.out.println("Your value is :"+value);
        String name =input.next();
        System.out.println("Your Name :"+name);
        float cgpa=9.9f;
        input.close();
    }
}