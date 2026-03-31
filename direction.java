import java.awt.*;
public class LayoutDemo extends Frame{
LayoutDemo(){
setLayout(new BorderLayout());
add(new Button("North"),BorderLayout.NORTH);
add(new Button("South"),BorderLayout.SOUTH);
add(new Button("East"),BorderLayout.EAST);
add(new Button("West"),BorderLayout.WEST);
Panel panel = new Panel();
panel.setLayout(new GridLayout(2,2));
panel.add(new Button("1"));
panel.add(new Button("2"));
panel.add(new Button("3"));
panel.add(new Button("4"));
add(panel,BorderLayout.CENTER);
setSize(400,300);
setVisible(true);
}
public static void main(String[] args){
new LayoutDemo();
}
    