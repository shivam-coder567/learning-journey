
import java.awt.*;
class tab extends frame{
    tab()
    {
        setVisible(true);
        setLayout(null);
        setSize(450,450);
        button b1 =new button("RED");
        b1.setBounds(130, 190, 100, 30);
        b1.add(b1);
         button b2 =new button("green");
        b2.setBounds(130, 190, 100, 30);
        b2.add(b2);
         button b3 =new button("blue");
        b3.setBounds(130, 190, 100, 30);
        b3.add(b3);
    }
}
class box{
    public static void main(String a[]){
        tab b1 = new tab();
    }
}