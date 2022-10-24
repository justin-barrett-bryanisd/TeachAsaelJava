
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jbarrett
 */
public class RotatingPicture extends Rectangle {

    boolean up, down, left, right;
    Image img;
    double angle;

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }
    

    public RotatingPicture(Image im, double angl) {
        super(210, 210, 25, 40);
        up = down = left = right = false;
        img=im;
        angle=angl;
    }

    public void draw(Graphics g) {
        Graphics g2=g.create();
        Graphics2D g2d=(Graphics2D)g2;
        
        g2d.drawRect(x, y, width, height);
        
        g2d.translate(x+width/2, y+height/2);
        g2d.rotate(angle);
        g2d.drawImage(img, -width/2, -height/2, width, height, null);
        g2.dispose();
    }

    public void move() {
        if (up) {
            moveUp();
        }
        if (down) {
            moveDown();
        }
        if (right) {
            moveRight();
        }
        if (left) {
            moveLeft();
        }
    }

    public void moveUp() {
        y--;
    }

    public void moveDown() {
        y++;
    }

    public void moveRight() {
        x++;
    }

    public void moveLeft() {
        x--;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public void setRight(boolean right) {
        this.right = right;
    }
}
