class Employee{
    String name;
    int empid;
    String design;
    int sal;
void get_data (String na, int id, String de, int s)
{
     name = na;
     empid = id;
    design= de ;
     sal = s;
}
void show_data ()
{
    System.out.println("EMPLOYEE NAME: "+name);
    System.out.println("EMPLOYEE ID: "+empid);
    System.out.println("DESIGNATION: "+design);   
     System.out.println("SALARY: "+sal);   

}
}
class first_emp
{
    public static void main(String a[]){
      int  id=Integer.parseInt(a[1]);
      int  sal=Integer.parseInt(a[3]);
    Employee b1 = new Employee();
    b1.get_data(a[0],id,a[2],sal);
    b1.show_data();
    
    }
}