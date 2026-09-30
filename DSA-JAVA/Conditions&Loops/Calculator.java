import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans =0;
        // take the input till the user press 'X'or 'x'
        while(true)
        {
             System.out.print("Enter any operation :");
            char ch = in.next().trim().charAt(0);
            if(ch =='+'|| ch == '-' || ch =='*'|| ch =='/'|| ch=='%')
            {
                System.out.print("Enter Any Two Numbers: ");
                int num1 =in.nextInt();
                int num2=in.nextInt();
                System.out.println("");
                if(ch=='+')
                {
                    ans = num1+num2;
                }
                if(ch=='-')
                {
                    ans = num1-num2;
                }
                if(ch=='*')
                {
                    ans = num1*num2;
                }
                if(ch=='%')
                {
                    ans = num1%num2;
                }
                if(ch=='/')
                {
                    if(num2!=0)
                    {
                    ans = num1/num2;
                    }
                }
            }
            else if(ch=='X'|| ch=='x')
                {
                    break;
                }
                else
                {
                    System.out.println("Invalid Operator");
                }
                System.out.println(ans);
        }
        
        
    }
}
