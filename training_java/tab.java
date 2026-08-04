import java.awt.event.*;
import java.awt.*;
class tab extends Frame implements ActionListener{
    Button b1,b2,b3;
    
    tab()
    {
        setVisible(true);
        setLayout(null);
        setSize(450,450);
        b1 =new Button("RED");
        b1.setBounds(30, 50, 100, 30);
        add(b1);
        b1.addActionListener(this);
        b2 =new Button("Green");
        b2.setBounds(200, 190, 100, 30);
        add(b2);
        b2.addActionListener(this);

        b3 =new Button("Blue");
        b3.setBounds(330, 350, 100, 30);
        add(b3);
        b3.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1)
        setBackground(Color.red);
        else if(e.getSource()==b2)
        setBackground(Color.green);
        else if(e.getSource()==b3)
        setBackground(Color.blue);



    }
}
class box{
    public static void main(String a[]){
        tab b1 = new tab();
    }
}