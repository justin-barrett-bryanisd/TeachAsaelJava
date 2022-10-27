
/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class BetterCounting {

    public static void main(String[] args) throws Exception {
        String str = "a cat ate some chips but then he couldn't make furballs because chips don't have hair or do they?";

        //How many letters are duplicated?
        int dupCount = 0, opCount = 0;
        String used = " ";
        for (int i = 0; i < str.length(); i++) {
            if (!used.contains("" + str.charAt(i))) {
                for (int j = i+1; j < str.length(); j++) {
                    used+=str.charAt(i);
                    opCount += 2;
                    if (i != j && i < j && str.charAt(i) == str.charAt(j)) {
                        System.out.println(str.charAt(i));
                        dupCount++;
                    }
                }
            }
        }
        System.out.println(dupCount + "    " + opCount + "   " + str);
    }

}
