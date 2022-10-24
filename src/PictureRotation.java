/**
 *
 * @author NAME
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;

public class PictureRotation implements ActionListener, KeyListener {

    javax.swing.Timer timer;
    JFrame frame;
    JPanel display;
    
    RotatingPicture guy;

    public static void main(String[] args) throws Exception {
        new PictureRotation();
    }

    public PictureRotation() {
        frame = new JFrame("Insert Title Here");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        display = new DisplayPanel();
        frame.add(display);
        //put constructor code here
        
        guy=new RotatingPicture(new ImageIcon("a.png").getImage(),Math.PI/4);
        
        
        //end your constructor code
        timer = new javax.swing.Timer(10, this);
        timer.start();
        frame.addKeyListener(this);
        frame.setFocusable(true);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        //type what needs to be performed every time the timer ticks
        
        
        //end your code for timer tick code
        display.repaint();
    }

    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_RIGHT)
            guy.setAngle(guy.getAngle()+.1);
        if(e.getKeyCode()==KeyEvent.VK_LEFT)
            guy.setAngle(guy.getAngle()-.1);
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    class DisplayPanel extends JPanel {

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            //draw your graphics here
            
            guy.draw(g);
            g.fillRect(30, 20, 20, 50);
            g.drawLine(0, 0, 210, 210);
            
        }
    }
}