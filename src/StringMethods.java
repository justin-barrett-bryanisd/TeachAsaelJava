
/**
 *
 * @author NAME
 */
import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class StringMethods {

    public static void main(String[] args) throws Exception {
        File f = new File("exponents.txt");
        f.createNewFile();
        Scanner scan = new Scanner(f);
        while (scan.hasNext()) {
            //start loop
            String line = scan.nextLine();

            System.out.println(line);
            String target = line.substring(0, 1);
            //How do I count how many times the target is in the line?
            int count = 0;
            int location = 0;
            int lastLocation = 0;
            while (location < line.length()) {
                if (target.equals(line.substring(location, location + 1))) {
                    count++;
                    if (location > lastLocation + 2) {
                        //line=line+line.substring(location, lastLocation);
                        line = line + line.substring(lastLocation + 1, location - 1);
                        System.out.println(line);
                    }
                    lastLocation = location;
                }
                location++;
            }
            System.out.println("(" + target + "^" + count + ")" + line.substring(lastLocation + 1));
        }
    }

}
