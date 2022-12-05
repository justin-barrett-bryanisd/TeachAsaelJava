/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jbarrett
 */
public class Book {
    private static int ID=0;
    private int id;
    private double price;
    private String author, title, genre;
    public static final double MIN_PRICE=1.99;
    
    public Book(String author, String title, String genre, double price){
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.price=price;
        id=ID;
        ID++; 
    }

    public Book(String author, String title, String genre) {
        this(author, title, genre, 8);
    }
    
    public Book(){
        this("No one","Title assigned later","Unknown",8);
    }
    
    /*
    Pre-condition: 
            c is a valid letter of the alphabet (upper or lower case)
            str has the a length > 1 and a length > index
            index >= 0
    Post-condition:
            Character c has replaced the current character in str at specified index  
    */    
    public static String replaceLetter(char c, String str, int index){
        return (str.substring(0, index) + c + str.substring(index+1));
    }
    
    /*
    Pre-condition: 
            title has length > 0
    Post-condition:
            title is in "title casing"  
    */  
    public void titleCaseCleanUp(){
        title=title.toLowerCase();
        for (int i = 1; i < title.length()-1; i++) {
            if(title.charAt(i)==' '){
                title=replaceLetter(title.toUpperCase().charAt(i+1), title, i+1);
            }
        }
        title=title.replaceAll(" The ", " the ").replaceAll(" Of ", " of ").replaceAll(" In ", " in ");
        title=replaceLetter(title.toUpperCase().charAt(0), title, 0);
        
    }
    
    /*
    Pre-condition: 
            title is non-empty
    Post-condition:
            title will be returned in title case, and if it starts with "The ", the "The" will be placed at the end after a comma
    */ 
    public String alphabetizeTitle(){
        titleCaseCleanUp();
        if(title.startsWith("The "))
            return title.substring(4)+", The";
        
        return title;        
    }
    
    public void compareBookPrice(Book a){
        if(this.price > a.price)
            System.out.println(this.title +" is more expensive than "+a.title);
        else if(this.price < a.price)
            System.out.println(this.title +" is less expensive than "+a.title);
        else
            System.out.println(this.title +" is the same price as "+a.title);
    }
    
    public void compareYourself(){
        compareBookPrice(this);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getId() {
        return id;
    }
    
}
