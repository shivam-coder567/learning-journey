import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER ANY THREE NUMBER: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        // int max=a;
        // if(b>max)
        // {
        //     max=b;
        // }
        // if(c>max){
        //     max=c;
        // }
        // System.out.println(max);
    //     int max=0;
    //    if(a>b){
    //     max=a;
    //    } 
    //    else{
    //     max=b;
    //    }
    //    if(a>c){
    //     max=a;
    //    }
    //    else{
    //     max=c;
    //    }
    //    System.out.println(max);
        int max =Math.max(c,Math.max(a,b));
        System.out.println(max);
       }
}
