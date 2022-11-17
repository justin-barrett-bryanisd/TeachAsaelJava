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
