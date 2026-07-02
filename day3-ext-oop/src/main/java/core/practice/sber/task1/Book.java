package core.practice.sber.task1;


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
