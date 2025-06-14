// 8. You are building a library management system. 
//Design an interface named "LibraryItem" with the following methods:

// String getTitle() to retrieve the title of the library item

// String getAuthor() to retrieve the author of the library item

// int getYear() to retrieve the publication year of the library item

// boolean isAvailable() to check if the library item is currently available for borrowing.

interface LibraryItem {
    String getTitle();
    String getAuthor();
    int getYear();
    boolean isAvailable();
}

class Book implements LibraryItem {
    private String title;
    private String author;
    private int year;
    private boolean available;
    
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = true;
    }
    
    @Override
    public String getTitle() {
        return title;
    }
    
    @Override
    public String getAuthor() {
        return author;
    }
    
    @Override
    public int getYear() {
        return year;
    }
    
    @Override
    public boolean isAvailable() {
        return available;
    }
    
    public void borrow() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }
    
    public void returnBook() {
        available = true;
        System.out.println("Book returned successfully.");
    }
}

public class Question8 {
    public static void main(String[] args) {
        LibraryItem book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Year: " + book.getYear());
        System.out.println("Available: " + book.isAvailable());
        
        if (book instanceof Book) { //instanceof check to cash to Boook
            Book concreteBook = (Book) book;
            concreteBook.borrow();
            System.out.println("Available after borrowing: " + book.isAvailable());
            concreteBook.returnBook();
            System.out.println("Available after returning: " + book.isAvailable());
        }
    }
}