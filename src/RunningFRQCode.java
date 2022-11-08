/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class RunningFRQCode {
    public static void main(String[] args) throws Exception {
        longestStreak("CAT IN THE HAT");
        longestStreak("TOMORROW");
        longestStreak("AABBBBCCCDDDEEEEEEE");
        
        int num=2345, placeHolder=1;
        System.out.println(num);
        while(num>0){
            int temp=placeHolder*(num%10);
            placeHolder*=10;
            num/=10;
            System.out.println(temp);
        }
    }
    
    public static void longestStreak(String str){
	char letter=str.charAt(0), bestLetter=str.charAt(0); int count=1, bestCount=1;
	for(int i=1; i<str.length(); i++){
		if(letter==str.charAt(i)){
			count++;
			if(count>bestCount){
				bestLetter=letter; bestCount=count;
			}
		}
		else{
			letter=str.charAt(i); count=1;
		}
	}
	System.out.println(bestLetter+" "+bestCount);
}

}
