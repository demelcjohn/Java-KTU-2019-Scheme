import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Operation extends JFrame implements ActionListener{
    JFrame f;
    JPanel Red,Yellow,Green,buttons,lights;
    JRadioButton rBtn,yBtn,gBtn;
    ButtonGroup bg=new ButtonGroup();
    Font txtFont = new Font("SansSerif", Font.BOLD, 30);

    Operation(){
        f = new JFrame();
        f.setSize(400,600);
        f.setLayout(new GridLayout(1,2));

        Red = new JPanel();
        Red.setSize(200,200);
        Yellow = new JPanel();
        Yellow.setSize(200,200);
        Green = new JPanel();
        Green.setSize(200,200);

        lights = new JPanel();
        lights.setLayout(new GridLayout(3,1));
        lights.add(Red);
        lights.add(Green);
        lights.add(Yellow);

        buttons = new JPanel();
        buttons.setLayout(new BoxLayout(buttons,BoxLayout.Y_AXIS));
        buttons.setSize(200,600);

        rBtn = new JRadioButton("Red");
        gBtn = new JRadioButton("Green");
        yBtn = new JRadioButton("Yellow");

        rBtn.setFont(txtFont);
        gBtn.setFont(txtFont);
        yBtn.setFont(txtFont);

        bg.add(rBtn);
        bg.add(yBtn);
        bg.add(gBtn);
        
        buttons.add(rBtn);
        buttons.add(gBtn);
        buttons.add(yBtn);

        rBtn.addActionListener(this);
        gBtn.addActionListener(this);
        yBtn.addActionListener(this);

        f.add(lights);
        f.add(buttons);

        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();

        Red.setBackground(null);
        Green.setBackground(null);
        Yellow.setBackground(null);
        if(s.equals("Red")){
            Red.setBackground(new Color(255,0,0));
        }
        if(s.equals("Green")){
            Green.setBackground(new Color(71, 237, 85));
        }
        if(s.equals("Yellow")){
            Yellow.setBackground(new Color(230, 207, 0));
        }
    }
}


public class TrafficSignal{
public static void main(String arg[]){
new Operation();
}
}
















