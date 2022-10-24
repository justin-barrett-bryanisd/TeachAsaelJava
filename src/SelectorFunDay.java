
/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class SelectorFunDay {

    public static void main(String[] args) throws Exception {
//        int grade=85;
//        
//        boolean retestAvailable=grade<75;
//        String parentContactMethod=(grade<75)?"phone call" :"email" ;
//        
////        if(grade < 75 ){
////            retestAvailable=true;
////            parentContactMethod="phone call";
////        }
////        else  if(grade >= 75){
////            retestAvailable=false;
////            parentContactMethod="email";
////        }
//        System.out.println(retestAvailable);
//        System.out.println(parentContactMethod);
//        
//        
//        char letterGrade=(grade >=80)?
//                (grade >=90)?
//                    'A':
//                    'B':
//                (grade >=70)?
//                    'C':
//                    'F';
//        System.out.println(letterGrade);

        Scanner scan = new Scanner(System.in);
        
        boolean working = true;

        while (working) {
            System.out.println("Do you want to build a snowman?:  ");
            String answer = scan.nextLine().trim();
            if (answer.toUpperCase().startsWith("Y")) {
                System.out.println("Learn the movie, nerd");
                System.out.println("Dum dum dum");
                working=false;
            } else if (answer.startsWith("N")) {
                System.out.println("Please...n");
            } else if (answer.startsWith("U")) {
                System.out.println("Please...u");
            } else if (answer.startsWith("O")) {
                System.out.println("Please...o");
            }
        }
        
        for (int i = 1; i < 101; i++) {
            System.out.print(i+"\t");
            if(i%10==1)
                System.out.println("");
        }

    }

}
