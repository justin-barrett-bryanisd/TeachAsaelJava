
/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class ShortCircuit {

    public static void main(String[] args) throws Exception {
        String abc = "aaad";
        if (abc.length() >= 3 && abc.charAt(3) == 'd') {
            System.out.println("The fourth letter is a d");
        }
        //if an OR has the first item come up true, the second expression is ignored
        //if an AND has the first item come up false, the second expression is ignored

    }
}
