/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class TruthTables {
    public static void main(String[] args) throws Exception {
        int cols=2;
        System.out.println("binary\t|\tA\t|\tB\t|\tA or B");
        for (int i = 0; i < Math.pow(2,cols); i++) {
            String row=Integer.toBinaryString(i);
            while(row.length()<cols) row="0"+row;
            boolean a=row.substring(0, 1).equals("1"), b=row.substring(1, 2).equals("1");
            row+="\t|\t"+(a)+"\t|\t"+(b);
            row+="\t|\t"+(a || b);
            
            System.out.println(row);
        }
    }

}
