/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class WordFun {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        
        while(str.length()>2){
            System.out.print(str.substring(0,2));
            if(str.length()>2) str=str.substring(3);
        }
        System.out.print(str);
    }

}
