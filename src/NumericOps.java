
/**
 *
 * @author NAME
 */
import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class NumericOps {

    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        
        int     num1=5, 
                num2=4, 
                num3=5, 
                num4=5;
        int count=5;
        
        double average=(1.0*num1+num2+num3+num4)/count;
        
        ;
        System.out.println(average);
        System.out.println((""+average).length());

    }
}
