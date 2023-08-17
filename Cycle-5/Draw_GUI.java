import javax.swing.JFrame;
import java.awt.*;

class Draw_GUI extends Canvas{

public void paint(Graphics g) {
setBackground(Color.YELLOW);
g.setColor(Color.RED);
g.fillRect(30,30,250,150);
g.setColor(Color.BLUE);
g.fillOval(30,230,250,150);
g.setColor(Color.BLACK);
g.drawLine(50,400,450,100);
g.drawLine(100,10,400,450);
}

public static void main(String arg[]){
JFrame fobj = new JFrame("Draw Shapes and lines");
Draw_GUI dobj = new Draw_GUI();
fobj.setSize(500,500);
fobj.add(dobj);
fobj.setVisible(true);
fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
