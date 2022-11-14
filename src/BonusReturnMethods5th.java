/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class BonusReturnMethods5th {
    public static void main(String[] args) throws Exception {
        System.out.println(lowestLetter("The house at the end of the street sits on the corner"));
        System.out.println(alphaSort("The house at the end of the street sits on the corner"));
    }
    
    //create a method that puts the lowest letter alphabetically 
    //regardless of casing in the front
    public static String lowestLetter(String str){
        String tmp=str.toLowerCase().replaceAll(" ", "~");
        int lowIndex=0;
        char lowLetter=tmp.charAt(0);
        for (int i = 0; i < tmp.length(); i++) {
            if(tmp.charAt(i)<lowLetter){
                lowLetter=tmp.charAt(i);
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
        return lowestLetter(str);
    }

}
