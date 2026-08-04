import java.awt.*;
class student extends Frame{
    student(){
        setVisible(true);
        setSize(450,450);
        setLayout(null);
        Label l1 = new Label("Registration Form ");
        l1.setBounds(150, 60, 120, 30);
        add(l1);
        Label l2 = new Label("Name ");
l2.setBounds(50, 100, 80, 30);
        add(l2);
        TextField t2= new TextField();
t2.setBounds(150, 100, 150, 20);
                add(t2);
                 Label l3 = new Label("Password ");
l3.setBounds(50, 150, 80, 30);
        add(l3);
TextField t3= new TextField();
t3.setBounds(150, 150, 150, 20);
                add(t3);
     Label l4 = new Label("ReEnterPassword");
l4.setBounds(30, 190, 100, 30);
        add(l4);
TextField t4= new TextField();
t4.setBounds(150, 190, 150, 20);
                add(t4);
                Label l5 =new Label("Qualifications:");
                l5.setBounds(30,230,80,35);
                add(l5);

           Checkbox c1 = new Checkbox("10th");
c1.setBounds(150, 230, 70, 30);
add(c1);              
Checkbox c2 = new Checkbox("12th");
c2.setBounds(220, 230, 70, 30);
add(c2);  
Checkbox c3 = new Checkbox("UG");
c3.setBounds(300, 230, 70, 30);
add(c3);   
     Checkbox c4 = new Checkbox("G");
c4.setBounds(150, 250, 70, 30);
add(c4);    
 Checkbox c5 = new Checkbox("PG");
c5.setBounds(220, 250, 70, 30);
add(c5);
Checkbox c6 = new Checkbox("Others");
c6.setBounds(300, 250, 70, 30);
add(c6);
  Label l7 =new Label("Gender");
  l7.setBounds(50,270,50,30);
  add(l7);                
                  
    }
}
    class form{
    public static void main(String a[]){
        student s1= new student();
    }

}