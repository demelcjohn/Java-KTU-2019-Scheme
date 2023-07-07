import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Functions implements ActionListener{
JTextField txt = new JTextField();
JPanel pan = new JPanel();
Functions(){
Functions fun = new Functions();
JFrame fobj = new JFrame();
fobj.setSize(1000,1000);
JButton b_add = new JButton("+");
JButton b_sub = new JButton("-");
JButton b_mul = new JButton("*");
JButton b_div = new JButton("/");
JButton b_rem = new JButton("%");
fobj.add(pan);
pan.add(txt);
pan.setSize(900,900);
txt.setBounds(70,90,100,200);
b_add.addActionListener(fun);
b_sub.addActionListener(fun);
b_mul.addActionListener(fun);
b_div.addActionListener(fun);
b_rem.addActionListener(fun);
b_add.setBounds(50,50,50,50);
b_sub.setBounds(150,150,50,50);
b_mul.setBounds(250,200,50,50);
b_div.setBounds(350,300,50,50);
b_rem.setBounds(450,400,50,50);  
pan.add(b_add);
pan.add(b_sub);
pan.add(b_mul);
pan.add(b_div);
pan.add(b_rem);
fobj.setTitle("Calculator");
fobj.setLayout(new FlowLayout());
fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
fobj.setVisible(true);
}

public void actionPerformed(ActionEvent e)
    {
    txt.setText("Hello");
    }
}

class Calculator{
public static void main(String args[]){
new Functions(); 
} 
}
