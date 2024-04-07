package day3;

import java.util.*;

class Book implements Comparable<Book> {
    private int bookId;
    private String title;
    private double price;
    private String author;
    private Date publicationDate;

    public Book(int bookId, String title, double price, String author, Date publicationDate) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String toString() {
        return bookId + " " + title + " " + price + " " + author + " " + publicationDate;
    }

   
    public int hashCode() {
        return Objects.hash(bookId);
    }

   
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book otherBook = (Book) obj;
        return bookId == otherBook.bookId;
    }

        
    public int compareTo(Book otherBook) {
        return Integer.compare(this.bookId, otherBook.bookId);
    }
}

public class BookMain {
    public static void main(String[] args) {
                Set<Book> bookSet = new TreeSet<>();

                bookSet.add(new Book(1001, "Python Learning", 715.0, "Martic C. Brown", new Date(120, 1, 2))); // Note: Month is 0-based (0 = January)
        bookSet.add(new Book(1002, "Modern Mainframe", 295.0, "Sharad", new Date(97, 4, 19)));
        bookSet.add(new Book(1003, "Java Programming", 523.0, "Glad Bracha", new Date()));
        bookSet.add(new Book(1004, "Read C++", 0.0, "", new Date(84, 10, 23)));
        bookSet.add(new Book(1005, ".Net Platform", 295.0, "Henry Harvin", new Date(84, 10, 19)));
        bookSet.add(new Book(3497, "Mark J. Price", 3497.0, "", new Date(84, 2, 6)));

        for (Book book : bookSet) {
            System.out.println(book);
        }
    }
}
