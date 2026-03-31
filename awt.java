import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class FrequencyCounter extends Frame implements ActionListener{
ActionListener{
TextField tf;
TextArea result;
Button btn;

FrequencyCounter(){
setLayout(new FlowLayout());
tf = new TextField(30);
btn = new Button("Find Frequency");
result = new TextArea(10,40);

add(new Label("Enter items(space separated): "));
add(tf);
add(btn);
add(result);
btn.addActionListener(this);

setSize(400,300);
setVisible(true);
}

public void actionPerformed(ActionEvent e){
String input = tf.getText();
String[] items = input.split(" ");
HashMap<String,Integer> map = new HashMap<>();
for(String item : items){
map.put(item,map.getOrDefault(items,0) + 1);
}
result.setText("");
for(String key : map.keySet()){
result.append(key + " : " + map.get(key) + "\n");
}
}

public static void main(String[] args){
new FrequencyCounter();
}
}
