import javax.swing.*;
import java.awt.event.*;
public class SwingEventDemo{
public static void main(String[] args){
JFrame frame = new JFrame("Events");
JButton button = new JButton("Clicks");
JCheckBox checkbox = new JCheckBox("Accept");
JLabel label = new JLabel("Output");
//Action Event
button.addActionListener(e-> label.setText("Button Clicked"));
//Item Event
checkbox.addItemListener(e->{
if(checkbox.isSelected())
label.setText("Checked");
else
label.setText("Unchecked");
});
//Mouse Event
button.addMouseListener(new MouseAdapter(){
public void mouseEntered(MouseEvent e){
label.setText("Mouse Entered button");
}
});
JPanel panel = new JPanel();
panel.add(button);
panel.add(checkbox);
panel.add(label);
frame.add(panel);
frame.setSize(400,200);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
}

