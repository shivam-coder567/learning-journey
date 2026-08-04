class data{
    String name;
    int rollno;
    String department ;
    int semester;
void get_data ()
{
     name = "SHIVAM";
     rollno = 480;
    department= "CSE" ;
     semester = 3;
}
void show_data ()
{
    System.out.println("NAME: "+name);
    System.out.println("ROLL NO: "+rollno);
    System.out.println("DEPARTMENT: "+department);   
     System.out.println("SEMESTER: "+semester);   

}
}
class Student
{
    public static void main(String a[]){
     data b1 = new data();
    b1.get_data();
    b1.show_data();
    }
}