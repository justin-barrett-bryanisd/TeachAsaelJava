
/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class GradeCreator {

    public static void main(String[] args) throws Exception {
        Random randy = new Random();
        int math = randy.nextInt(30)+70, english = randy.nextInt(30)+70, sci = randy.nextInt(30)+70, soc = randy.nextInt(30)+70, pe = randy.nextInt(5)+95, art = randy.nextInt(20)+80;
        int mathC = randy.nextInt(10), englishC = randy.nextInt(10), sciC = randy.nextInt(10), socC = randy.nextInt(10), peC = randy.nextInt(5), artC = randy.nextInt(8);

        int id = randy.nextInt(999999);
        DecimalFormat df = new DecimalFormat("000000");
        PrintWriter out = new PrintWriter("stu" + df.format(id) + ".csv");
        out.println(df.format(id));
        for (int i = 7; i < 13; i++) {
            out.println("");
            out.println(i + "th");
            printLine("MATH", math, out);
            printLine("ENG", english, out);
            printLine("SCI", sci, out);
            printLine("SOC", soc, out);
            printLine("PE", pe, out);
            printLine("ART", art, out);

            math += randy.nextInt(mathC) - mathC/2;
            english += randy.nextInt(10) - 5;
            sci += randy.nextInt(8) - 4;
            soc += randy.nextInt(6) - 3;
            pe += randy.nextInt(2) - 1;
            art += randy.nextInt(3) - 1;
        }
        out.close();
    }

    public static void printLine(String label, int num, PrintWriter out) {
        Random randy = new Random();
        out.print(label + ",");
        for (int j = 0; j < 6; j++) {
            int g = randy.nextInt(num - 3, num + 3);
            g = Math.max(0, g);
            g = Math.min(g, 100);
            out.print(g + ",");
        }
        out.println("");
    }

}
