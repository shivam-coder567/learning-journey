// import java.util.Scanner;

public class ArmstrongNum {
    //print all the 3 digit Armstrong number 
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int n= in.nextInt();
        // in.close();
        // boolean ans = isArmstrong(n);
        // System.out.println(ans);
        for (int i = 100; i < 1000; i++) {
            if(isArmstrong(i)){
                System.out.print(i);
            }
        }
    }
    static Boolean isArmstrong(int n){
        int sum=0;
        int original =n;
        while(n>0)
        {
            int rem = n%10;
            sum = sum+rem*rem*rem;
             n = n/10;
        }
        if(original== sum){
            return true;
        }
        else{
            return false;
        }
    }

}
