
/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class BeesFlowers {

    public static void main(String[] args) throws Exception {
        Bee benson;
        int minFlowers = -1, maxFlowers = -1, maxBees=Integer.MAX_VALUE/10000;
        double averageFlowers=0;
        //If red flowers give 5 pollen and blue flowers give 16 pollen, and 30% of a field is blue flowers....
        //How many flowers should a bee travel to for 100 total pollen?

        for (int i = 0; i < maxBees; i++) {
            benson = new Bee();
            while (benson.getPollenCount() < 100) {
                benson.visitFlower((Math.random() < 0.3) ? 16 : 5);

//            if(Math.random()<.3)
//                benson.visitFlower(16);
//            else
//                benson.visitFlower(5);
            }
            System.out.println(benson);
            if(minFlowers==-1 || benson.getFlowerCount()<minFlowers)
                minFlowers=benson.getFlowerCount();
            if(maxFlowers==-1 || benson.getFlowerCount()>maxFlowers)
                maxFlowers=benson.getFlowerCount();
            averageFlowers+=benson.getFlowerCount();
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Stats:");
        System.out.println("Average Flowers: "+(averageFlowers/=maxBees));
        System.out.println("Max Flowers: "+maxFlowers);
        System.out.println("Min Flowers: "+minFlowers);

    }

    static class Bee {

        static int beeCount=0;
        int pollen, flowerCount;

        public Bee() {
            pollen = 0;
            flowerCount = 0;
            beeCount++;
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
            return "Bee:"+beeCount+"\tPollen: " + pollen + "\tFlower Count: " + flowerCount;
        }
    }

}
