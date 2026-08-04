public class String_Buffer{
    public static void main(String a[]){
        StringBuffer name = new StringBuffer("SHIVAM");
        System.out.println(name.capacity());
        System.out.println("HELLO "+name);
       // name.append(" YASHASHVI");
        name.insert(0," YASHASHVI ");

        System.out.println(name);



    }
}