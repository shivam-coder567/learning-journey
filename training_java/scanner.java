import java.util.Scanner;
class scanner{
    public static void main(String a[]){
    Scanner table = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num =  table.nextInt();
    for(int i=1; i<=10;i++){
       int tables= i*num;
       System.out.println(table);
    }
    }//wrong 
}