/**
 *
 * @author NAME
 */

import java.awt.Rectangle;
import java.lang.*;

public class RectangleEquality {
    public static void main(String[] args) throws Exception {
        Rectangle r1=new Rectangle(10,10,40,20);
        Rectangle r2=new Rectangle(11,11,40,20);
        Rectangle r3=new Rectangle(10,10,30,10);
        
        boolean r1r2=r1.equals(r2);
        boolean r1r3=r1.equals(r3);
        
        
        System.out.println(r1r2+" "+r1r3);  
        
        PartyRectangle pr1=new PartyRectangle(10,10,40,20);
        PartyRectangle pr2=new PartyRectangle(11,11,40,20);
        PartyRectangle pr3=new PartyRectangle(10,10,1,800);
        
        
        boolean pr1pr2=pr1.equals(pr2);
        boolean pr1pr3=pr1.equals(pr3);
        
        System.out.println(pr1pr2+" "+pr1pr3);          
    }
    
    static class PartyRectangle extends Rectangle{

        public PartyRectangle(int x, int y, int width, int height) {
            super(x, y, width, height);
        }
        
        public boolean equals(PartyRectangle other){
            return (width*height)==(other.width*other.height);
        }        
    }
}
