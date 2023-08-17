import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class CalFunc extends JFrame implements ActionListener{
JPanel pan = new JPanel();
JFrame f = new JFrame("Calculator");
JTextField txt1 = new JTextField();
JTextField txt2 = new JTextField();
JTextField txt3 = new JTextField();
JLabel l1 = new JLabel("First no.");
JLabel l2 = new JLabel("Second no.");
JLabel l3 = new JLabel("Answer");
CalFunc(){
l1.setBounds(10,20,100,20);
l2.setBounds(10,100,100,20);
l3.setBounds(10,180,100,20);
f.add(l1);f.add(l2);f.add(l3);
JButton b1 = new JButton("+");
JButton b2 = new JButton("-");
JButton b3 = new JButton("*");
JButton b4 = new JButton("/");
JButton b5 = new JButton("%");
JButton b6 = new JButton("Clear");
pan.add(b1);pan.add(b2);pan.add(b3);pan.add(b4);pan.add(b5);pan.add(b6);
b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);
b4.addActionListener(this);b5.addActionListener(this);b6.addActionListener(this);
b1.setBounds(170,40,100,50);
b2.setBounds(320,40,100,50);
b3.setBounds(170,120,100,50);
b4.setBounds(320,120,100,50);
b5.setBounds(170,200,100,50);
b6.setBounds(320,200,100,50);
pan.add(txt1);pan.add(txt2);pan.add(txt3);
txt1.setBounds(10,40,100,50);
txt2.setBounds(10,120,100,50);
txt3.setBounds(10,200,100,50);
b1.setBackground(Color.yellow);b2.setBackground(Color.yellow);b3.setBackground(Color.yellow);
b4.setBackground(Color.yellow);b5.setBackground(Color.yellow);b6.setBackground(Color.yellow);
pan.setBackground(Color.red);
pan.setLayout(null);
f.add(pan);
f.setSize(500,500);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);
}

public void actionPerformed(ActionEvent e){
String s1 = txt1.getText();
String s2 = txt2.getText();
try{
float n1 = Float.parseFloat(s1);
float n2 = Float.parseFloat(s2);
float n;
String s = e.getActionCommand();
if(s.equals("+")){
	n = n1 + n2;
	s1 = s1.valueOf(n);
	txt3.setText(s1);
}
if(s.equals("-")){
	n = n1 - n2;
	s1 = s1.valueOf(n);
	txt3.setText(s1);
}
if(s.equals("*")){
	n = n1 * n2;
	s1 = s1.valueOf(n);
	txt3.setText(s1);
}
if(s.equals("/")){
	try{
	if(n2 == 0)
		throw new ArithmeticException();
	n = n1 / n2;
	s1 = s1.valueOf(n);
	txt3.setText(s1);
	}catch(ArithmeticException ex1){txt3.setText("x/0 restricted");}
}
if(s.equals("%")){
	n = n1 % n2;
	s1 = s1.valueOf(n);
	txt3.setText(s1);
}
if(s.equals("Clear")){
	txt1.setText("");
	txt2.setText("");
	txt3.setText("");
}
}
catch(Exception ex2){ex2.printStackTrace();}
}
}

public class Calculator2{
public static void main(String args[]){
new CalFunc();
}
}





