import javax.swing.*;
import java.awt.event.*;
public static void main(Sring[] args){
JFramr frame = new JFrame("Components Demo")

JMMenuBar mb = new JTabbed 





menu.add(item);
mb.add(menu);
frame.setJMenuBar(mb);
//Tabs
JTabbedPane tab = new JTabbedPane();
JPanel panel1 = new JPanel();
JCheckBox cb = new JCheckBox("Java");
JRadioButton rb = new JRadioButton("Male");
panel1.add(cb);
panel1.add(rb);
JPanel panel2 = new JPanel();
JButton dialogBtn = new JButton("Show Dialog");
dialogBtn.addActionListener(e->JOptionPane.showMessageDialog(frame,"Hello Dialog!"));
panel2.add(dialogBtn);
tab.add("Tab1",panel1);
tab.add("Tab2",panel2);
frame.add(tab);
frame.setSize(400,300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
}