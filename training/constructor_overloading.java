class Student{
    String name;
    int rollno;
    int regisno;
    Student()
{
    name ="SHIVAM";
    rollno=480;
    regisno=21250168;
}
Student(String na,int rn,int regno){
    name= na;
    rollno=rn;
    regisno=regno;
}
void show_data(){
System.out.println("NAME: "+name);
System.out.println("ROLL NO: "+rollno);
System.out.println("REGISTRATION NO: "+regisno);

}
}
class constructor_overloading{
    public static void main(String a[]){
        Student s1=new Student();
       s1.show_data();
       Student s2=new Student("TANISHK", 420,2125016);
       s2.show_data();

    }
}