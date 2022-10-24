/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class ShortCircuit2 {
    public static void main(String[] args) throws Exception {
//        int num=0;
//        if(num++==0 || num++==0){
//            System.out.println("a");
//        }
//        else{
//            System.out.println("b");
//        }
//        System.out.println(num);
//        
//        //Short circuiting:
//        //AND statements, the second expression is evaluated ONLY IF the first is true
//        //OR statements, the second expression is evaluated ONLY IF the first is false
        String str="abcd";
        if(str.length()>3 && str.charAt(3)=='d'){
            System.out.println("The fourth letter is a \'d\'");
        }
    }

}
