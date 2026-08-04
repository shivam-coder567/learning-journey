import java.awt.*;
import java.awt.event.*;

class Sum extends Frame implements ActionListener {

    TextField t1, t2;
    Label l1, l2, l3, l4;
    Button b1, b2;

    Sum() {

        setTitle("Calculator");
        setSize(450, 450);
        setLayout(null);

        l1 = new Label("First Number");
        l1.setBounds(50, 100, 100, 30);
        add(l1);

        l2 = new Label("Second Number");
        l2.setBounds(50, 150, 100, 30);
        add(l2);

        t1 = new TextField();
        t1.setBounds(170, 100, 150, 25);
        add(t1);

        t2 = new TextField();
        t2.setBounds(170, 150, 150, 25);
        add(t2);

        l3 = new Label("Result");
        l3.setBounds(50, 200, 100, 30);
        add(l3);

        l4 = new Label("");
        l4.setBounds(170, 200, 150, 30);
        add(l4);

        b1 = new Button("SUM");
        b1.setBounds(90, 260, 80, 30);
        add(b1);

        b2 = new Button("Reset");
        b2.setBounds(220, 260, 80, 30);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());

                int res = a + b;

                l4.setText(String.valueOf(res));

            }
        

        if (ae.getSource() == b2) {

            t1.setText("");
            t2.setText("");
            l4.setText("");
        }
    }
}


class Addition {

    public static void main(String args[]) {

        new Sum();
    }
}