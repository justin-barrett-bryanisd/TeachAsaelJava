
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
        int math = 85, english = 80, sci = 82, soc = 90, pe = 100, art = 95;

        Random randy = new Random();
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

            math += randy.nextInt(6) - 3;
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
