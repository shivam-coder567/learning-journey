import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        // BASIC JAVA PROGRAM

        // Q1)Area Of Circle Java Program.
        // Scanner sc = new Scanner(System.in);
        //  System.out.println("Enter the radius :");
        //  int r = sc.nextInt();
        //  double area = 3.14*r*r;
        //  System.out.println(area);


         //Area Of Triangle
        //   Scanner sc = new Scanner(System.in);
        //  System.out.println("Enter the Base & Height :");
        //  int b = sc.nextInt();
        //  int h = sc.nextInt();
        //  double  area = 0.5*b*h;
        //  System.out.println(area);

         // Q3) Area Of Rectangle Program
        //   Scanner sc = new Scanner(System.in);
        //  System.out.println("Enter the length & breath :");
        //  int l = sc.nextInt();
        //  int b = sc.nextInt();
        //  int area = l*b;
        //  System.out.println(area);

        //Area Of Parallelogram
        // Scanner sc = new Scanner(System.in);
        //  System.out.println("Enter the base & height :");
        //   int b = sc.nextInt();
        //   int  h= sc.nextInt();
        //  int area = b*h;
        // System.out.println(area);

        //  Area Of Rhombus
        // Scanner sc = new Scanner(System.in);
        //  System.out.println("Enter the diagonal1 & diagonal2 :");
        //   int d1 = sc.nextInt();
        //   int  d2= sc.nextInt();
        //  int area = (d1*d2)/2;
        // System.out.println(area);

       // Perimeter Of Circle
        // Scanner sc = new Scanner(System.in);
        //  System.out.println("Enter the radius :");
        //   int r = sc.nextInt();
        //    double area = 2*(3.14*r);
        // System.out.println(area);

            //Volume Of Cone Java Program

        //      Scanner sc = new Scanner(System.in);
        //  System.out.println("Enter the radius and height :");
        //   int r = sc.nextInt();
        //  int h = sc.nextInt();

        //    double volume = (1.0/3)*3.14*r*r*h;
        // System.out.println(volume);


       // Input a number and print all the factors of that number (use loops).
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number :");
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     if(n%i==0)
        //     {
        //         System.out.print(i+" ");
        //     }
        // }

       // Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        Scanner sc = new Scanner(System.in);
        while(true)
        {
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        if(n==0){
            break;
        }
        n=n+n;
        System.out.println(n);
        }





    }
    
}
