public class Scooping {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        //the value that initialised outside the block it cant be initialised again in the block but it can be modified in thte block
        {
            a=70;
            System.out.println(a);
            int c=99;
            // values initialised in this block , will remain in block
        }
        // System.out.println(c);
        // CANNOT USE OUTSIDE THE BLOCK 
    }
    static void random(int marks)
    {
        int num=67;
        System.out.println(num);
        System.out.println(marks);
    }
}
