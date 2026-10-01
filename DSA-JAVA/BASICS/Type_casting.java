// import java.util.Scanner;
class Type_casting
{
    public static void main(String[] args)
    {
        // Scanner sc = new Scanner(System.in);
        // float decimal = sc.nextFloat();
        // int data = (int)decimal;
        // System.out.println("value: "+ data);
        // float num1 = 143.999999999f;
        // int decimal1= (int)(num1);
        // System.out.println("value: "+ decimal1);
        // // automatic type promotion in expression 
        // // int a=257;
        // // byte b = (int)a;//257%256=1
        // // System.out.println(b);
        // byte a =40;
        // byte b=50;
        // byte c =100;
        // int d =a*b/c;
        // System.out.println(d);
        // // byte b=50;
        // // b=b*2; cant do this
        // int number='A';
        // System.out.println(number);
        byte b=50;
        char c='a';
        short s=1024;
        int i=10000;
        float f=5.5f;
        double d=0.1234;
        double result =(f*b)+(i/c)-(d*s);
        // float +int-double= double
        System.out.println((f*b)+" "+(i/c)+" "+(d*s));
        System.out.println(result);

    }
} 