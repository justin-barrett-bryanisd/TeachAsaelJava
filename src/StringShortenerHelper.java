/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class StringShortenerHelper {
    public static void main(String[] args) throws Exception {
        System.out.println(removeLetter("cats",1));
    }
    /*
    Algorithm 0 (remove a letter):
      method that given a number returns the addition of 2 substrings: up to that number and then one plus to the end     
    */
    public static String removeLetter(String str, int num){
        return str.substring(0,num)+str.substring(num+1);
    }
    
    /*
    Algorithm 1:
    lowercase your string
    loop through all letters starting at 1
        if the letter before looking at is not a space
            if the letter is an a, e, i, o, u
                remove that letter
            if the letter is the same as the one before it
                remove that letter
    return the string     
    */
    public static String algor1(String str){
        return str;
    }
    
    /*
    Algorithm 2:
    Start with a blank string called output
    Strip all spaces out of the original by replacing all " " with ""
    while original has letters
        make a character called target and it is the first letter
        make an int called count that starts at 0
        while original contains the target 
            add one to count
            remove the letter using the index of the target
        add to output the count and the target
    return output     
    */
    
    public static String algor2(String str){
        return str;
    }
}
