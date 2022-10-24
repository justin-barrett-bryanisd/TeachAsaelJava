/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class EthanPainAndSuffering {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        System.out.print("What is your favorite snack:\t");
        String favorite=scan.nextLine();
        System.out.println("We are out of "+favorite);
        System.out.print("How about the second favorite snack?\t");
        String otherSnack=scan.next();
        System.out.println("We will deliver "+otherSnack+" right away");
    }
}
