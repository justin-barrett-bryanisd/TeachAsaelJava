
/**
 *
 * @author NAME
 */
import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class WhileLoopsFun {

    public static void main(String[] args) throws Exception {

        //If red flowers give 5 pollen and blue flowers give 16 pollen, and 40% of a field is blue flowers....
        //How many flowers should a bee travel to for 100 total pollen?
        Bee larry = new Bee();

        while (larry.getPollenCount() < 100) {
            if (Math.random() < 0.4) {
                larry.visitFlower(16);
            } else {
                larry.visitFlower(5);
            }
        }
        System.out.println(larry);
    }

    static class Bee {

        int pollen, flowerCount;

        public Bee() {
            pollen = 0;
            flowerCount = 0;
        }

        public void visitFlower(int num) {
            pollen += num;
            flowerCount++;
        }

        public int getFlowerCount() {
            return flowerCount;
        }

        public int getPollenCount() {
            return pollen;
        }

        public String toString() {
            return "Bee\tPollen: " + pollen + "\tFlower Count: " + flowerCount;
        }
    }
}
