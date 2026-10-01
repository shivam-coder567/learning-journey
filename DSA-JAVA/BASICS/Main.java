import java.util.Scanner;
public class Main
{
    public static void main(String a[])
    {
        System.out.println("Hello World");
        Scanner age =new Scanner(System.in);
        //System.out.println( "AGE : "+age.nextInt());

         Scanner name =new Scanner(System.in);
        //System.out.println( "NAME : "+name.next());

         Scanner line =new Scanner(System.in);
       //System.out.println("SENTENCE : "+line.nextLine());


        System.out.println("My name is "+name.next()+" and I am "+age.nextInt()+" year old "+" "+line.nextLine());

        age.close();
        name.close();
        line.close();
    }
}