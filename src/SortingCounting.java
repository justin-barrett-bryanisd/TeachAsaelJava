/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class SortingCounting {
    public static void main(String[] args) throws Exception {
        String str="We the People of the United States, in Order to form a more perfect Union, establish Justice, insure domestic Tranquility, provide for the common defense, promote the general Welfare, and secure the Blessings of Liberty to ourselves and our Posterity, do ordain and establish this Constitution for the United States of America"; System.out.println(str);
        int count=0;
        for (int j = 0; j < str.length(); j++) 
        for (int i = 0; i < str.length()-1; i++) {
            count+=2;
            if(str.charAt(i)>str.charAt(i+1)){
                //System.out.println(i);
                count+=4;
                str=str.substring(0, i)+str.charAt(i+1)+str.charAt(i)+str.substring(i+2);
                //System.out.println(str);
            }            
        }
        System.out.println(count+" "+str);
        count=0;
        str="We the People of the United States, in Order to form a more perfect Union, establish Justice, insure domestic Tranquility, provide for the common defense, promote the general Welfare, and secure the Blessings of Liberty to ourselves and our Posterity, do ordain and establish this Constitution for the United States of America"; System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            int lowest=i;
            for (int j = i+1; j < str.length(); j++) {
                count+=2;
                if(str.charAt(lowest)>str.charAt(j))
                    lowest=j;
            }
            count+=4;
            str=str.substring(0,i)+str.charAt(lowest)+str.substring(i,lowest)+str.substring(lowest+1);
            //System.out.println(str);
            
        }
        System.out.println(count+" "+str);
    }

}
