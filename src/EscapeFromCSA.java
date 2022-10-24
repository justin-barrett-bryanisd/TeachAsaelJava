/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class EscapeFromCSA {
    public static void main(String[] args) throws Exception {
        String[] names={"Barrett","Jaq","Juan"};
        for (String name : names) {
            if(name.startsWith("J")){
                name=name+"\rREDACTED";
            }
            System.out.println(name);
            if(name.contains("n"))
                System.out.println("Name has an \'n\'");
            System.out.println("");
        }
    }

}
