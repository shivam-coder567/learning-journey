// class Employee{
//     String name;
//     int empid;
//     String design;
//     int sal;
// void get_data (String na, int id, String de, int s)
// {
//      name = na;
//      empid = id;
//     design= de ;
//      sal = s;
// }
// void show_data ()
// {
//     System.out.println("EMPLOYEE NAME: "+name);
//     System.out.println("EMPLOYEE ID: "+empid);
//     System.out.println("DESIGNATION: "+design);   
//      System.out.println("SALARY: "+sal);   

// }
// }
// class first_emp
// {
//     public static void main(String a[]){
//     Employee b1 = new Employee();
//     b1.get_data("KIM",420,"MANAGER",100000);
//     b1.show_data();
//     Employee b2 = new Employee();
//     b1.get_data("jon",401,"CEO",1000000);
//     b1.show_data();
//     }
// }
class Employee{
    String name;
    int empid;
    String design;
    int sal;
Employee(String na, int id, String de, int s)
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
    Employee b1 = new Employee();
    b1.Employee();
    b1.show_data();
    }
}