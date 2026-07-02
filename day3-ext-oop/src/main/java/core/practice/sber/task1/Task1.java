package core.practice.sber.task1;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Library library = new Library();

        Book book = new Book("Clean Code", 2008, "Robert Martin", "ISBN123");
        DVD dvd = new DVD("Inception", 2010, "Christopher Nolan", 148);

        library.addItem(book);
        library.addItem(dvd);

        System.out.println(library.borrowItem("Clean Code"));

        LibraryItem found = library.searchByTitle("Inception");
        System.out.println(found.getDescription());

        System.out.println(library.returnItem("Clean Code"));

        book.setAuthor("R. Martin");
        System.out.println(book.getAuthor());
    }
}