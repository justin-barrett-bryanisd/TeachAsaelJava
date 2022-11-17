/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class ForLoopPractice {
    public static void main(String[] args) throws Exception {
        String str="Brayden needs help";
        System.out.println(str.length());
        int lCount=0;
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.substring(i,i+1)+"|");
            if(str.substring(i,i+1).equals("l"))
                lCount++;
        }
        System.out.println("\nL Count :"+lCount);
        for(int i = str.length()-1; i>=0; i--){
            System.out.println(str.substring(i,i+1)+"|"+str.substring(i));
        }
        System.out.println("t");
        System.out.println("i\'s \t\tj\'s");
        for (int i = 0; i < 10; i++) {
            System.out.print(i+"|");
            for (int j = 0; j < 10; j+=2) {
                System.out.print("\t"+j);
            }
            System.out.println("");
        }
        Math.random();
        double num=getNum(2,"");
        
        
    }
    
    public static int getNum(int a){
        return 1;
    }
    public static double getNum(double b,String dontUse){
        return 3;
    }
    
}
