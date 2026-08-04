class calculator{
    public int add(int n1, int n2){
    return n1 + n2;
    }
    public int add(int n1,int n2, int n3)
    {
        return n1+n2+n3;
    }    
    public double add(double d1, int n1)
    {
        return d1+n1;
    }
}
class method_overloading{
    public static void main(String a[]){
        int num1 =5;
        int num2=4;
        int num3 =6;
        double d1=8.8;
        calculator obj = new calculator();
        int r1 = obj.add( num1, num2);
        int r2 = obj.add( num1,num2, num3);
        double r3 = obj.add( d1, num2);
    System.out.println(r1);
    System.out.println(r2);
    System.out.println(r3);



    }
}