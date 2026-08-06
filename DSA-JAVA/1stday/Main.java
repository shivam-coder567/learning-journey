import java.util.Scanner;
public class Main
{
    public static void main(String a[])
    {
        System.out.println("Hello World");
        Scanner age =new Scanner(System.in);
       // System.out.println(age.nextInt());

         Scanner name =new Scanner(System.in);
       // System.out.println(name.next());

         Scanner line =new Scanner(System.in);
       // System.out.println(line.nextLine());


        System.out.println("My name is "+name.next()+" and I am "+age.nextInt()+" year old "+" "+line.nextLine());

        age.close();
        name.close();
        line.close();
    }
}