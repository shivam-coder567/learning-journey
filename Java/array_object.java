class Student{
    String name;
    int rollno;
    double cgpa;
}
class array_object{
    public static void main(String a[]){
        Student s1 = new Student();
        s1.name="Shivam";
        s1.rollno=7;
        s1.cgpa=8.0;
        Student s2 = new Student();
        s2.name="Suryansh";
        s2.rollno=8;
        s2.cgpa=8.0;
        Student s3 = new Student();
        s3.name="Vishwas";
        s3.rollno=9;
        s3.cgpa=8.0;
        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        // for(int i=0; i<students.length;i++){
        //     System.out.println("Name: "+students[i].name);
        //      System.out.println("RollNO: "+students[i].rollno);
        //     System.out.println("Cgpa: "+students[i].cgpa);

        // }
        for(Student n: students){
             System.out.println("Name: "+n.name);
            System.out.println("RollNO: "+n.rollno);
            System.out.println("Cgpa: "+n.cgpa);


        }
    }
}