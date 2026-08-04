import javax.swing.*;
public class GUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("SHIVAM MISHRA");
        frame.setSize(500, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Welcome to my page");
        label.setBounds(150, 50, 200, 30);

        JTextField textField = new JTextField();
        textField.setBounds(100, 100, 200, 25);

        JButton button = new JButton("Click Me");
        button.setBounds(170, 150, 120, 30);

        button.addActionListener(e -> textField.setText("Button Clicked"));

        frame.add(label);
        frame.add(textField);
        frame.add(button);

        frame.setVisible(true);
    }
}