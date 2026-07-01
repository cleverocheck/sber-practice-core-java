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

abstract class LibraryItem {
    private String title;
    private int year;
    private boolean isBorrowed;

    public LibraryItem(String title, int year) {
        this.title = title;
        this.year = year;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setBorrowed(boolean borrowed) {
        this.isBorrowed = borrowed;
    }

    public abstract String getDescription();
}

class Book extends LibraryItem {
    private String author;
    private String isbn;

    public Book(String title, int year, String author, String isbn) {
        super(title, year);
        this.author = author;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String getDescription() {
        return "Book: " + getTitle() + ", " + author + ", ISBN " + isbn;
    }
}

class DVD extends LibraryItem {
    private String director;
    private int durationMinutes;

    public DVD(String title, int year, String director, int durationMinutes) {
        super(title, year);
        this.director = director;
        this.durationMinutes = durationMinutes;
    }

    public String getDirector() {
        return director;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    @Override
    public String getDescription() {
        return "DVD: " + getTitle() + ", " + director + ", " + durationMinutes + " min";
    }
}

class Library {
    private final ArrayList<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public boolean borrowItem(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equals(title) && !item.isBorrowed()) {
                item.setBorrowed(true);
                return true;
            }
        }
        return false;
    }

    public boolean returnItem(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equals(title) && item.isBorrowed()) {
                item.setBorrowed(false);
                return true;
            }
        }
        return false;
    }

    public LibraryItem searchByTitle(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equals(title)) return item;
        }
        return null;
    }
}