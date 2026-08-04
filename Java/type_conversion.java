class type_conversion{
    public static void main(String args[])
    {
        byte b =127;
        int a=257;
        b=(byte)a;// casting 
        // in this 257 will module with the range of byte (which is 256) ans-257%256=1
        float x=5.6f;
        int i=(int)x;

        System.out.println(b);
        System.out.println(i);

    }
} 