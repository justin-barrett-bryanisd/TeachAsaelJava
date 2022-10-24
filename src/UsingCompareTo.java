/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class UsingCompareTo {
    public static void main(String[] args) throws Exception {
        System.out.println("cat".toLowerCase().compareTo("Dog".toLowerCase()));
        System.out.println("dog".toLowerCase().compareTo("dog".toLowerCase()));
        System.out.println("rat".toLowerCase().compareTo("Cat".toLowerCase()));
        
        int jesseScore=170;
        int farhenScore=190;
        
        String results=jesseScore>farhenScore?"Jesse Wins":jesseScore==farhenScore?"Tie":"Farhen Wins";
        System.out.println(results);
    }

}
