/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class SilentWorking {
    public static void main(String[] args) throws Exception {
        
        String str="A cat catastrophy when cats do not get put down at their first appointment";
        String word="at";
        int num=0;
        for (int i = 0; i <= str.length()-word.length(); i++) {
            if(word.equals(str.substring(i, i+word.length())))
                System.out.println(i+" "+(++num));
        }
    }

}
