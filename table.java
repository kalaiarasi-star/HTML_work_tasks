import javax.swing.*;
public class JTableDemo{
public static void main(String[] args){
JFrame frame = new JFrame();
String data[][]={
{"1","John","20"},
{"2","Alice","22"},
{"3","Bob","21"}
};
String column[] = {"ID","Name","Age"};
JTable table = new JTable(data,column);
JScrollPane sp = new JScrollPane(table);
frame.add(sp);
frame.setSize(400,200);
frame.setVisible(true);
}
}