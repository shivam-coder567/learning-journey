import java.util.Scanner;
public class Leetcode1281
{
   // Subtract the Product and Sum of Digits of an Integer

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p=1;
        int s=0;
         while(n>0)
         {
                int rem =n%10;
                s=rem+s;
                p = p*rem;
                n=n/10;
         }
        System.out.println(p-s);
    }
}