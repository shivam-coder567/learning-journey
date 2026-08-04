class logic_operator{
    public static void main(String args[])
    {
        int a =8;
        int b=5;
        int x =20;
        int y= 10;
        boolean result1 = x>y&& a>b;
        System.out.println(result1);
         boolean result2 = x>y|| a<b;
        System.out.println(result2);
         boolean result3 = x<y;
        System.out.println(!result3);


    }}