import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any Fruit:");
         String fruit=sc.next(); 
        switch (fruit) {
            case "Mango": 
                System.out.println("king of Fruits");
                break;
            case "Apple":
                System.out.println("A sweet red Fruit");
                 break;
            case "Orange":
                System.out.println("Round Fruit");      
                break;   
            case "Grapes":
                System.out.println("Small Fruit");      
                default:
                    System.out.println("Please Enter a valid Fruit  ");
        }
    }
}