// class Person{
//     private int age;
//     private String name;
// public void get_data(String n,int a){
//     name=n;
//     age=a;
// }
// public void show_data(){
//     System.out.println(name);
//         System.out.println(age);
// }
// }
// public class Encapsulation{
//     public static void main(String a[]){
//         Person p1= new Person();
//         p1.get_data("Shivam",20);
//         p1.show_data();
//     }
// }
class Person{
    private int age;
    private String name;

public int get_Age()
{
    return age;
}
public String get_Name()
{
    return name;
}
public void set_Age(int a)
{
    age =a;
}
public void set_Name(String n)
{
    name =n;
}
}
public class Encapsulation{
    public static void main(String a[]){
        Person p1= new Person();
        p1.set_Age(30);
        p1.set_Name("Shivam");
        System.out.println(p1.get_Name()+" : "+p1.get_Age());
    }
}