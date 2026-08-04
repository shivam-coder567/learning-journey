// using constructor methodd
// class Maths{
//     int x;
//     int y;

//  Maths(int x1, int y1)
// {
//     x =x1;
//     y=y1;
// }
//  void add(){
//     System.out.println("sum: "+(x+y));

// }
//  void substract(){
//         System.out.println("Substraction: "+(x-y));

// }
// }
// class Math_chk{
//     public static void main(String a[])
//     {
//         int i1 = Integer.parseInt(a[0]);
//                 int i2 = Integer.parseInt(a[1]);

//         Maths m1= new Maths(i1,i2);
//         m1.add();
//         m1.substract();

//     }
// }
// using parameterize method!!
// class Maths{
//     int x;
//     int y;

//  void get_deta(int x1, int y1)
// {
//     x =x1;
//     y=y1;
// }
//  void add(){
//     System.out.println("sum: "+(x+y));

// }
//  void substract(){
//         System.out.println("Substraction: "+(x-y));

// }
// }
// class Math_chk{
//     public static void main(String a[])
//     {
//         Maths m1= new Maths();
//         m1.get_deta(20,10);
//         m1.add();
//         m1.substract();

//     }
// }
// USES OF this PARAMETER!!
class Maths{
    int x;
    int y;

 Maths()
{
    x =10;
    y=20;
}
Maths(int x,int y){
    this.x=x;
    this.y=y;
}
 void show(){
    System.out.println("Value of x is "+x);
    System.out.println("Value of y is "+y);
}
}
class Math_chk{
    public static void main(String a[])
    {
        Maths m1= new Maths();
        m1.show();
        Maths m2= new Maths(20,30);
        m2.show();
        

    }
}