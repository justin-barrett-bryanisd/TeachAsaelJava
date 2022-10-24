/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class NullObjects {
    public static void main(String[] args) throws Exception {
        //primitive types
        int num; double num2; boolean trueOrFalse; char letter;
                
        //kind of primitive 
        String str;
        
        //Objects
        Student thing=new Student();
        thing.name="Carl";
        System.out.println(thing.name);
        Student second=thing;
        second.name="Susan";
        System.out.println(thing.name);
        
        Student third=null;
        if(third==null)
            System.out.println("Third is null");
        
    }
    
    static class Student{
        int idNum;
        String name;
        double gpa;
    }

}
