/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class DoubleLessonDay {
    
    private static int num=0;
    public static void main(String[] args) throws Exception {
        printRoundedHalf();
        seeThis();
        printRoundedHalf();
        seeThis();
        printRoundedHalf();
        seeThis();
        printRoundedHalf();
        seeThis();
        addThis(1);
        System.out.println(squareRootCurve(20));
        System.out.println(squareRootCurve(11));
        System.out.println(squareRootCurve(12));
        System.out.println(squareRootCurve(13));
        System.out.println(squareRootCurve(14));
        System.out.println(squareRootCurve(19));
        
    }
    
    static void printRoundedHalf(){
        System.out.println(".5 rounded is 1");
        num++;
        System.out.println(num);
    }
    private static void seeThis(){
        System.out.println("John Cena");
    }
    
    public static void addThis(int num){
        System.out.println(num);
    }
    
    public static int squareRootCurve(int correct){
        double grade=correct/20.0 * 100;
        System.out.println("Raw Grade: "+grade);
        grade=Math.sqrt(grade)*10;
        
        //return (int)Math.ceil(grade);
        
        return (int)(grade+.5);
    }
}
