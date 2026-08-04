class Maths{
    void sum(){
        System.out.println("WITHOUT GETTING A VALUE SUM IS NOT POSSIBLE.");
    }
    void sum(int x1,int y1){
        System.out.println("SUM: "+(x1+y1));
    }
     void sum(int x2,int y2,int z2){
        System.out.println("SUM: "+(x2+y2+z2));
     }
         void sum(int x3,float w3){
        System.out.println("SUM: "+(x3+w3));
    }
    void sum(float w4,int x4){
        System.out.println("SUM: "+(x4+w4));
    }
}


class check{
    public static void main(String a[]){
        Maths m1=new Maths();
        m1.sum();
        m1.sum(5,6);
        m1.sum(5,6,4);
        m1.sum(5,6.1f);
        m1.sum(6.6f,5);
        //method overloading case

    }
}