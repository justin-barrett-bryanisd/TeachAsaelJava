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
        Book a=new Book("Heath Ledger","The making of: 10 Things I Hate About You","nonfiction",0.85);
        a.setTitle("Taming of the Shrew");
        Book b=new Book();
        for (int i = 0; i < 10; i++) {
            b=new Book();
        }
        
        b.compareBookPrice(a);
        b.compareYourself();
        System.out.println(a.getId());
        System.out.println(b.getId());
    }

}
