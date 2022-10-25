/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class NestedForLoopsXAgain {
    public static void main(String[] args) throws Exception {
        //new File("numbers.txt").createNewFile();
        Scanner scan=new Scanner(new File("numbers.txt"));
        while(scan.hasNext()){
        int num=scan.nextInt();
            System.out.println("+++++++"+num+"++++++++++++");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("x");
            for (int j = 0; j < num-i-1; j++) {                
                System.out.print(" ");
            }
            for (int j = 0; j < num-i-2; j++) {                               
                System.out.print(" ");
            }
            if(i!=num-1)System.out.print("x");
            
            System.out.println("");
        }
        for (int i = 0; i < num-1; i++) {
            for (int j = i  ; j < num-2; j++) {
                
                System.out.print(" ");
            }
            System.out.print("x");
            for (int j = i; j >= -i; j--) {
                System.out.print(" ");
            }
            System.out.println("x");
        }
        }
    }

}
