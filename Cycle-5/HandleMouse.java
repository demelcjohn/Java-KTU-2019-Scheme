import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MouseEg extends JFrame implements MouseListener{
JTextArea txtData;

MouseEg(){
JPanel panel = new JPanel(new FlowLayout());
txtData = new JTextArea(20,30);
txtData.addMouseListener(this);
panel.add(txtData);
add(panel,BorderLayout.CENTER);
}

public void mousePressed(MouseEvent e) 
{ 
	String s= "Mouse Pressed \n"+"x-Corrdinate = " + e.getX() + "y-Coordinate = " + e.getY(); 
	txtData.setText(s); 
}
public void mouseExited(MouseEvent e)  
{ 
	String s = "Mouse Exited"; 
	txtData.setText(s);
} 
public void mouseEntered(MouseEvent e) 
{ 
	String s = "Mouse Entered"+"x-Coordinate = " + e.getX() + "y-Coordinate = " + e.getY(); 
	txtData.setText(s); 
} 
public void mouseReleased(MouseEvent e) 
{ 
	String s = "Mouse Released\n"+"x-Coordinate = " + e.getX() + "y-Coordinate = " + e.getY();  
	txtData.setText(s); 
} 
public void mouseClicked(MouseEvent e) 
{ 
	String s= "Mouse Clicked\n"+"X-Corrdinate = " + e.getX() + " y-Coordinate = " + e.getY();  
	txtData.setText(s); 
} 

}

class HandleMouse{
public static void main(String arg[]){
MouseEg mobj = new MouseEg(); 
mobj.setSize(500,500);
mobj.setVisible(true);
mobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}




