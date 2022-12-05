/**
 *
 * @author NAME
 */

import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class BookStoreTester {
    public static void main(String[] args) throws Exception {
        Book a=new Book("Heath Ledger","The making of: ten Things I Hate About You, the true story of their struggle","nonfiction",0.85);
        //a.setTitle("Taming of the Shrew");
        Book b=new Book();
        for (int i = 0; i < 10; i++) {
            b=new Book();
        }
        
        b.compareBookPrice(a);
        b.compareYourself();
        System.out.println(a.getId());
        System.out.println(b.getId());
        Employee a1=new Employee("Thomas Sanders",0,15.25);
        Employee b1=new Employee("Robert Sanders", 10, 8.25);
        Employee c1=new Employee("Sandra Peters");
        a1.printDetails();
        a1.setName("Tom Sanders");
        a1.printDetails();
        b1.printDetails();
        c1.printDetails();
        Employee d=new Employee();
        
        d.printDetails();
        System.out.println(a.replaceLetter('A', "cat", 1));
        a.titleCaseCleanUp();
        System.out.println(a.getTitle());
        System.out.println(a.alphabetizeTitle());
        
        a1.printDetails();
        a1.addTime(20);
        a1.printDetails();
        System.out.println("Process time card: "+a1.processTimeCard());
        a1.printDetails();
        
        System.out.println(Book.replaceLetter('t', "target", 1));
        System.out.println(Employee.getNameTagString("John Smith-Jones the Fourth Jr."));
        a1.printNameTag();
        System.out.println(Employee.MIN_WAGE);
    }

}
