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
        String str="the small cat";
        System.out.println(str.length());
        int lCount=0;
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.substring(i,i+1)+"|");
            if(str.substring(i,i+1).equals("l"))
                lCount++;
        }
        System.out.println("");
        System.out.println("L Count: "+lCount);
        
        for (int i = str.length()-1; i >=0; i--) {
            System.out.print(str.substring(i,i+1)+"|");
            System.out.println(str.substring(i));
        }
    }

}
