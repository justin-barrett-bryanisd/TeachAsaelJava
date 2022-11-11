/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class PassingClasses {
    public static void main(String[] args) throws Exception {
        Integer num=4;
        Scanner scan=new Scanner(new File("numbers.txt"));
        String s="cas";
        addOne(num);
        addOne(num);
        addOne(num);
        System.out.println("================");
        readNumAndPrint(scan);
        readNumAndPrint(scan);
        readNumAndPrint(scan);
        System.out.println("================");
        stringExample(s);
        stringExample(s);
        stringExample(s);
    }
    
    public static int addOne(int n){
        n++;
        System.out.println(n);
        return n;
    }    
    public static void readNumAndPrint(Scanner s){
        int a=s.nextInt();
        System.out.println(a);
    }
    public static void stringExample(String s){
        s=s+"a";
        System.out.println(s);
    }

}
