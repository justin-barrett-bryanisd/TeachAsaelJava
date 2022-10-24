
/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class SelectorFunDay2 {

    public static void main(String[] args) throws Exception {
        Random randy = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println("---------------------------");
            System.out.println("Picking number");
            int num = randy.nextInt(30);
            System.out.println(num);

            if (num < 20) {
                System.out.println("Less than twenty");
            }
            else if (num < 21) System.out.println("Equal to 20");
            else {
                i--;
            }
        }
    }

}
