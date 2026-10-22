import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        sum();
    }
     static void sum(){
        Scanner in = new Scanner(System.in);
        int num1= in.nextInt();
        int num2= in.nextInt();
        System.out.println("Sum :" +(num1+num2));

    }
}

/* 
return_type_name(arguments){
    // body
    return_statement;
}*/
