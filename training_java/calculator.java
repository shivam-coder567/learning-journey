import javax.swing.*;
 class MyCalculator {
    public static void main(String[] args) {

        JFrame frame = new JFrame("My First Calculator");
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1 = new JLabel("First Number");
        l1.setBounds(40, 30, 100, 25);
        frame.add(l1);

        JLabel l2 = new JLabel("Second Number");
        l2.setBounds(40, 80, 100, 25);
        frame.add(l2);

        JLabel l3 = new JLabel("Result");
        l3.setBounds(40, 130, 100, 25);
        frame.add(l3);

        // Text Fields
        JTextField t1 = new JTextField();
        t1.setBounds(160, 30, 150, 25);
        frame.add(t1);

        JTextField t2 = new JTextField();
        t2.setBounds(160, 80, 150, 25);
        frame.add(t2);

        JTextField t3 = new JTextField();
        t3.setBounds(160, 130, 150, 25);
        t3.setEditable(false); // Result field cannot be edited
        frame.add(t3);

        // Button
        JButton addButton = new JButton("ADD");
        addButton.setBounds(130, 190, 100, 35);
        frame.add(addButton);

        // Button Action
        addButton.addActionListener(e -> {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());

            int sum = num1 + num2;

            t3.setText(String.valueOf(sum));
        });

        frame.setVisible(true);
    }
}