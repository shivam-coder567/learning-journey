public class Shadowing {
    static int x=100;// this will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x);//100
        int x= 40;
        System.out.println(x);//40
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
