/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class DoubleLessonDay5th {
    static int num=4;
    public static void main(String[] args) throws Exception {
        
        quackMultiple(6);quackMultiple(2);quackMultiple(1);
        for (int i = 0; i < 20; i++) {
            System.out.println(squareRootCurve(i));
        }
        
    }
    
    private static void quack(){
        System.out.print("QUACK ");
    }
    
    public static void quackMultiple(int num){
        System.out.println(num);
        for (int i = 0; i < num; i++) {
            quack();
        }
        System.out.println("\n     -says the duck");
    } 
    
    public static int squareRootCurve(int correct){
        double grade=correct/20.0 * 100;
        System.out.println("Correct: "+correct+"\tRaw Grade: "+grade);
        grade=Math.sqrt(grade)*10;
        return (int)Math.ceil(grade);
    }

}
