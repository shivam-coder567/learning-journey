import java.awt.*;
import java.awt.event.*;

class Win extends Frame implements ActionListener {

    Button b1, b2;

    Win() {

        setTitle("BROWSER");
        setSize(400, 250);
        setLayout(null);

        b1 = new Button("Calc");
        b1.setBounds(80, 100, 100, 40);
        add(b1);

        b2 = new Button("Close");
        b2.setBounds(220, 100, 100, 40);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
           Sum s1= new Sum();       
        }

        if (e.getSource() == b2) {
            System.exit(0);         
        }
    }
}


class Sum extends Frame implements ActionListener {

    TextField t1, t2;
    Label l1, l2, l3, l4;
    Button b1, b2,b3;

    Sum() {

        setTitle("Calculator");
        setSize(450, 350);
        setLayout(null);

        l1 = new Label("First Number");
        l1.setBounds(50, 70, 100, 25);
        add(l1);

        t1 = new TextField();
        t1.setBounds(170, 70, 150, 25);
        add(t1);

        l2 = new Label("Second Number");
        l2.setBounds(50, 110, 100, 25);
        add(l2);

        t2 = new TextField();
        t2.setBounds(170, 110, 150, 25);
        add(t2);

        l3 = new Label("Result");
        l3.setBounds(50, 160, 100, 25);
        add(l3);

        l4 = new Label("");
        l4.setBounds(170, 160, 150, 25);
        add(l4);

        b1 = new Button("SUM");
        b1.setBounds(90, 230, 80, 35);
        add(b1);

        b2 = new Button("Reset");
        b2.setBounds(220, 230, 80, 35);
        add(b2);
        b3 =new Button("CLOSE");
        b3.setBounds(340, 230, 80, 35);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {

                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());

                int sum = a + b;

                l4.setText(String.valueOf(sum));

            }

        else if (e.getSource() == b2) {

            t1.setText("");
            t2.setText("");
            l4.setText("");
        }
        else if (e.getSource()==b3){
            dispose();
        }
    }

}


 class SecWin {

    public static void main(String args[]) {

       Win w1= new Win();

    }
}