/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class BonusReturnMethods {
    public static void main(String[] args) throws Exception {
        System.out.println(lowestLetter("The house at the end of the corner"));
        System.out.println(alphaSort("The house at the end of the corner"));
        //aThe house t the end of the corner
    }
    
    //create a method that puts the lowest letter alphabetically 
    //regardless of casing in the front
    
    public static String lowestLetter(String str){
        String tmp=str.toLowerCase().replaceAll(" ", "~");
        int lowIndex=0;
        char lowestLetter=tmp.charAt(0);
        for (int i = 1; i < tmp.length(); i++) {
            if(tmp.charAt(i)<lowestLetter){
                lowestLetter=tmp.charAt(i);
                lowIndex=i;
            }
        }        
        return str.charAt(lowIndex)+str.substring(0, lowIndex)+str.substring(lowIndex+1);
    }

    //create a method that sorts the letters alphabetically
    //regardless of casing
    public static String alphaSort(String str){        
        for (int i = 0; i < str.length(); i++) {
            str=str.substring(0,i)+lowestLetter(str.substring(i));
        }               
        return str;
    }
}
