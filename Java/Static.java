class Mobile{
    String brand;
    int price;
    static String name;
    void show_data(){
        System.out.println(brand+" : "+price+" : "+name);
    }
}
public class Static{
    public static void main(String a[]){
        Mobile obj1 = new Mobile();
        obj1.brand ="APPLE";
        obj1.price=40000;
        obj1.name="smartphone";
         Mobile obj2 = new Mobile();
        obj2.brand ="LAVA";
        obj2.price=10;
        obj2.name="smartphone";
         obj1.name ="PHONE";
        obj1.show_data();
                obj2.show_data();

    }
}