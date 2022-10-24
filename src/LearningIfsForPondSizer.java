
/**
 *
 * @author NAME
 */
import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class LearningIfsForPondSizer {

    public static void main(String[] args) throws Exception {
        JOptionPane.showMessageDialog(null, "Middle");
//        String input=JOptionPane.showInputDialog("Press (E) for (E)xit");
//        System.out.println(input);
//        if(input.substring(0,1).equals("E")){
//        System.out.println("You pressed \'E\'");
//            System.exit(0);
//        }
        int choice = JOptionPane.showConfirmDialog(null, "Press a button");
        System.out.println(choice);
        String[] dayOptions = {"It's good.", "Terrible. Leave me alone.", "Gotta wait and see?"};
        choice = JOptionPane.showOptionDialog(null, "How was your day?", "Day Question", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, dayOptions, null);
        System.out.println(choice);
        if (choice == 2) {
            System.out.println("Good to keep an open mind!");
        }

    }
}

//        JOptionPane.showMessageDialog(null, "Hello" + (3 + 5) + 9);
//        String input = JOptionPane.showInputDialog("Please enter your name:").trim();
//        System.out.println("|" + input + "|");
//        if (input.substring(0, 1).equals("I")) {
//            System.out.println("You are not the center of the world");
//        }
//        int choice = JOptionPane.showConfirmDialog(null, "Yes, No, or Cancel.... I think");
//        System.out.println(choice);
//        int[] nums={3,4,5};
//        String[] ops = {"Cat", "Dog", "Parrot", "Neither"};
//        choice = JOptionPane.showOptionDialog(null, "Please enter something", "Top bar", 
//                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, ops, null);
//        System.out.println(choice);
//        if (choice == 3) {
//            System.out.println("You answered Neither");
//        }
//        System.out.println("Best Choice");
