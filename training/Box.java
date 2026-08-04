class Box{
    int l;
    int w;
    int h;
void fun_init ()
{
    l=10;
    w=20;
    h=30;
}
void fun_show ()
{
    System.out.println("Lenght is "+l);
    System.out.println("width is "+w);
    System.out.println("Height is "+h);   
}
}
class Chk
{
    public static void main(String a[]){
        Box b1 = new Box();
        Box b2 = new Box();
    b1.fun_init();
    b1.fun_show();
    b2.fun_show();
    }
}