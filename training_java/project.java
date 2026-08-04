import java.awt.*;
import java.awt.event.*;
class Window extends Frame implements ActionListener
{
    Button b1,b2;
    Window(){
    setTitle("Window");
        setSize(450,350);
        setLayout(null);
        setVisible(true);
        Label l1 = new Label("NUMBER SYSTEM CONVERTER");
l1.setBounds(110,50,230,30);
add(l1);
        b1 = new Button("OPEN CONVERTER");
    b1.setBounds(125,120,180,40);
    add(b1);
         b2 = new Button("EXIT");
    b2.setBounds(170,190,90,40);
    add(b2);
    b1.addActionListener(this);
    b2.addActionListener(this);
    }
        public void  actionPerformed(ActionEvent ae){
            if(ae.getSource()==b1){
                new NumberConverter();
            }
             else if(ae.getSource()==b2){
                System.exit(0);
            }

        }
}

 class NumberConverter extends Frame implements ActionListener
{
    Label l1,l2,l3,l4,l5,l6,l7;
    TextField t1,t2,t3,t4,t5;
    Choice c;
    Button b1,b2;

    NumberConverter()
    {
        setTitle("Number Converter");
        setSize(450,350);
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);

        l1 = new Label("Enter Number:");
        l1.setBounds(30,50,100,20);
        add(l1);

        t1 = new TextField();
        t1.setBounds(150,50,150,20);
        add(t1);

        l2 = new Label("Select Base:");
        l2.setBounds(30,90,100,20);
        add(l2);

        c = new Choice();
        c.add("Binary");
        c.add("Octal");
        c.add("Decimal");
        c.add("Hexadecimal");
        c.setBounds(150,90,150,20);
        add(c);

        l3 = new Label("Binary:");
        l3.setBounds(30,130,100,20);
        add(l3);

        t2 = new TextField();
        t2.setBounds(150,130,150,20);
        t2.setEditable(false);
        add(t2);

        l4 = new Label("Octal:");
        l4.setBounds(30,160,100,20);
        add(l4);

        t3 = new TextField();
        t3.setBounds(150,160,150,20);
        t3.setEditable(false);
        add(t3);

        l5 = new Label("Decimal:");
        l5.setBounds(30,190,100,20);
        add(l5);

        t4 = new TextField();
        t4.setBounds(150,190,150,20);
        t4.setEditable(false);
        add(t4);

        l6 = new Label("Hexadecimal:");
        l6.setBounds(30,220,100,20);
        add(l6);

        t5 = new TextField();
        t5.setBounds(150,220,150,20);
        t5.setEditable(false);
        add(t5);

        b1 = new Button("Convert");
        b1.setBounds(80,270,80,30);
        add(b1);

        b2 = new Button("Clear");
        b2.setBounds(200,270,80,30);
        add(b2);
        b1.addActionListener(this);

        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                c.select(0);
            }
        });

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        try
        {
            int decimal = 0;
            String input = t1.getText();

            if(c.getSelectedItem().equals("Binary"))
                decimal = Integer.parseInt(input,2);
            else if(c.getSelectedItem().equals("Octal"))
                decimal = Integer.parseInt(input,8);
            else if(c.getSelectedItem().equals("Decimal"))
                decimal = Integer.parseInt(input);
            else if(c.getSelectedItem().equals("Hexadecimal"))
                decimal = Integer.parseInt(input,16);

            t2.setText(Integer.toBinaryString(decimal));
            t3.setText(Integer.toOctalString(decimal));
            t4.setText(String.valueOf(decimal));
            t5.setText(Integer.toHexString(decimal).toUpperCase());
        }
        catch(Exception ex)
        {
            t2.setText("Invalid");
            t3.setText("Invalid");
            t4.setText("Invalid");
            t5.setText("Invalid");
        }
    }

    public static void main(String args[])
    {
        new Window();
    }
}