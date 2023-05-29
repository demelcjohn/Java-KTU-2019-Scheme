import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Demo extends KeyAdapter{
JFrame f = new JFrame("Adapter class Example");
JPanel p = new JPanel();
JTextField txt1 = new JTextField();
JTextField txt2 = new JTextField();
Demo(){
p.add(txt1);
p.add(txt2);
txt1.addKeyListener(this);
p.setBackground(Color.red);
f.add(p);
p.add(txt1);
p.add(txt2);
txt2.setEditable(false);
txt1.setBounds(150,100,200,50);
txt2.setBounds(150,200,200,50);
p.setLayout(null);
f.setVisible(true);
f.setSize(500,500);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void keyTyped(KeyEvent e1){
txt1.setText("");
String s = "Key Pressed";
txt2.setText(s);
}

public void keyReleased(KeyEvent e2){
String s = "";
txt2.setText("Key not pressed");
}

}



class AdapterClassExample {
public static void main(String args[]){
new Demo();
}
}
