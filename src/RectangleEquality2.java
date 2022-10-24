/**
 *
 * @author NAME
 */

import java.awt.Rectangle;
import java.lang.*;

public class RectangleEquality2 {
    public static void main(String[] args) throws Exception {
        Rectangle r1=new Rectangle(10, 12, 30, 10);
        Rectangle r2=new Rectangle(11, 11, 30, 10);
        Rectangle r3=new Rectangle(10, 12, 20, 10);
        
        r2.setLocation(10, 12);
        
        r1=r2;
        boolean r1r2=r1==r2;
        boolean r1r3=r1.equals(r3);
        
        System.out.println(r1r2+" "+r1r3);
        
        Rectastic rr1=new Rectastic(10, 12, 30, 10);
        Rectastic rr2=new Rectastic(10, 11, 30, 10);
        Rectastic rr3=new Rectastic(20, 12, 20, 10);
        
        
        boolean rr1r2=rr1.equals(rr2);
        boolean rr1r3=rr1.equals(rr3);
        
        System.out.println(rr1r2+" "+rr1r3);
    }
    
    static class Rectastic extends Rectangle{

        public Rectastic(int x, int y, int width, int height) {
            super(x, y, width, height);
        }
        
        public boolean equals(Rectastic other){
            return (x)==(other.x);
        }
    }

}
