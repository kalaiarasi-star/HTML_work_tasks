import javax.swing.*;
import java.awt.event.*;
public class SwingBasicDemo{
public static void main(String[] args){
JFrame frame = new JFrame("Swing Demo");
JTextField textField = new JTextField(15);
JButton button = new JButton("Show");
JLabel label = new JLabel("Output");
button.addActionListener(e ->{
label.setText(textField.getText());
});
JPanel panel = new JPanel();
panel.add(textField);
panel.add(button);
panel.add(label);
frame.add(panel);
frame.setSize(400,200);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
}
