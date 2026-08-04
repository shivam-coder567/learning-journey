import java.awt.*;
import java.awt.event.*;
class Window extends Frame implements ActionListener {
    Button open, about, exit;
    
    Label title;
    Window() {
        setTitle("NUMBER SYSTEM CONVERTER");
        setSize(450,350);
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        title = new Label("NUMBER SYSTEM CONVERTER");
        title.setFont(new Font("Arial", Font.BOLD, 16));
        title.setBounds(90,50,520,35);
        add(title);
        open = new Button("OPEN CONVERTER");
        open.setBounds(120,110,180,40);
        add(open);
        about = new Button("ABOUT");
        about.setBounds(150,170,120,35);
        add(about);
        exit = new Button("EXIT");
        exit.setBounds(150,225,120,35);
        add(exit);
        open.addActionListener(this);
        about.addActionListener(this);
        exit.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==open)
        {
            new NumberConverter();
        }
        else if(e.getSource()==about)
        {
            new AboutDialog(this);
        }
        else if(e.getSource()==exit)
        {
            System.exit(0);
        }
    }
}
class AboutDialog extends Dialog implements ActionListener {
    Button ok;
    AboutDialog(Frame f) {
        super(f,"About Project",true);
        setSize(350,250);
        setLayout(null);
        setBackground(Color.white);
        Label l1=new Label("NUMBER SYSTEM CONVERTER");
        l1.setFont(new Font("Arial",Font.BOLD,16));
        l1.setBounds(55,40,250,25);
        add(l1);
        Label l2=new Label("Developed By :YUGANK,SHIVAM,SALONI");
        l2.setBounds(55,80,250,20);
        add(l2);
        Label l3=new Label("Language : Java");
        l3.setBounds(55,110,150,20);
        add(l3);
        Label l4=new Label("GUI : AWT");
        l4.setBounds(55,140,150,20);
        add(l4);
        Label l5=new Label("Version : 1.0");
        l5.setBounds(55,170,150,20);
        add(l5);
        ok=new Button("OK");
        ok.setBounds(130,200,70,30);
        add(ok);
        ok.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        dispose();
    }
}
class ErrorDialog extends Dialog implements ActionListener {
    Button ok;
    ErrorDialog(Frame f,String msg)
    {
        super(f,"Error",true);
        setSize(320,170);
        setLayout(null);
        Label l=new Label(msg);
        l.setBounds(40,50,240,20);
        add(l);
        ok=new Button("OK");
        ok.setBounds(120,95,70,30);
        add(ok);
        ok.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        dispose();
    }
}
class NumberConverter extends Frame implements ActionListener
{
    Label heading;
    Label l1,l2,l3,l4,l5,l6;
    TextField t1,t2,t3,t4,t5;
    Choice c;
    Button convert,clear,close;
    NumberConverter()
    {
        setTitle("NUMBER SYSTEM CONVERTER");
        setSize(500,420);
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        heading = new Label("NUMBER SYSTEM CONVERTER");
        heading.setFont(new Font("Arial",Font.BOLD,18));
        heading.setBounds(120,30,300,30);
        add(heading);
        l1 = new Label("Enter Number :");
        l1.setBounds(40,80,100,20);
        add(l1);
        t1 = new TextField();
        t1.setBounds(170,80,180,25);
        add(t1);
        l2 = new Label("Select Base :");
        l2.setBounds(40,120,100,20);
        add(l2);
        c = new Choice();
        c.add("Binary");
        c.add("Octal");
        c.add("Decimal");
        c.add("Hexadecimal");
        c.setBounds(170,120,180,25);
        add(c);
        l3 = new Label("Binary :");
        l3.setBounds(40,170,100,20);
        add(l3);
        t2 = new TextField();
        t2.setBounds(170,170,180,25);
        t2.setEditable(false);
        add(t2);
        l4 = new Label("Octal :");
        l4.setBounds(40,205,100,20);
        add(l4);
        t3 = new TextField();
        t3.setBounds(170,205,180,25);
        t3.setEditable(false);
        add(t3);
        l5 = new Label("Decimal :");
        l5.setBounds(40,240,100,20);
        add(l5);
        t4 = new TextField();
        t4.setBounds(170,240,180,25);
        t4.setEditable(false);
        add(t4);
        l6 = new Label("Hexadecimal :");
        l6.setBounds(40,275,100,20);
        add(l6);
        t5 = new TextField();
        t5.setBounds(170,275,180,25);
        t5.setEditable(false);
        add(t5);
        convert = new Button("Convert");
        convert.setBounds(40,330,90,35);
        add(convert);
        clear = new Button("Clear");
        clear.setBounds(180,330,90,35);
        add(clear);
        close = new Button("Close");
        close.setBounds(320,330,90,35);
        add(close);
        convert.addActionListener(this);
        clear.addActionListener(this);
        close.addActionListener(this);
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
    {        if(e.getSource()==convert)
        {
            String input = t1.getText().trim();
            if(input.equals(""))
            {
                new ErrorDialog(this,"Please enter a number.");
                return;
            }
            try
            {
                int decimal = 0;
                if(c.getSelectedItem().equals("Binary"))
                {
                    decimal = Integer.parseInt(input,2);
                }

                else if(c.getSelectedItem().equals("Octal"))
                {
                    decimal = Integer.parseInt(input,8);
                }

                else if(c.getSelectedItem().equals("Decimal"))
                {
                    decimal = Integer.parseInt(input);
                }

                else if(c.getSelectedItem().equals("Hexadecimal"))
                {
                    decimal = Integer.parseInt(input,16);
                }

                t2.setText(Integer.toBinaryString(decimal));
                t3.setText(Integer.toOctalString(decimal));
                t4.setText(String.valueOf(decimal));
                t5.setText(Integer.toHexString(decimal).toUpperCase());
            }
            catch(Exception ex)
            {
                String msg="Invalid Number!";
                if(c.getSelectedItem().equals("Binary"))
                    msg="Invalid Binary Number!";
                else if(c.getSelectedItem().equals("Octal"))
                    msg="Invalid Octal Number!";
                else if(c.getSelectedItem().equals("Decimal"))
                    msg="Invalid Decimal Number!";
                else if(c.getSelectedItem().equals("Hexadecimal"))
                    msg="Invalid Hexadecimal Number!";
                new ErrorDialog(this,msg);
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
            }
        }
        else if(e.getSource()==clear)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            c.select(0);
        }
        else if(e.getSource()==close)
        {
            dispose();
        }
    }
}
 class Main
{
    public static void main(String args[])
    {
        new Window();
    }
}