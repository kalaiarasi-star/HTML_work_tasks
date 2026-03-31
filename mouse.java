import java.awt.*;
import java.awt.event.*;
public class AWTEventDemo extend Frame implements ActionListener,MouseListener,KeyListener{

Button btn;
Label label;

AWTEventDemo(){
setLayout(new FlowLayout());
btn = new Button("Click Me");
label = new label("Event Output");
add(btn);
add(label);
btn.addActionListener(this);
addMouseListener(this);
addKeyListener(this);
setSize(400,300);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
label.setText("Button clicked");
}
public void mouseClicked(MouseEvent e){
label.setText("Mouse Clicked at: " + e.getX() + "," + e.getY());
}