public class Task4 {
    public static void main(String[] args) {
        Author author = new Author("Игнат", true, "ignat2006l01@gmail.com");
        Author author2 = new Author("Игнат", true, "ignat2006l01@gmail.com");
        Book book = new Book("ПЛАТЕЖНЫЙ СЕРВИС ДЛЯ ФИЗИЧЕСКИХ ЛИЦ", author, 2026);

        System.out.println(author.getName());
        System.out.println(author.isMale());
        System.out.println(author.getEmail());

        System.out.println(book.getName());
        System.out.println(book.getAuthor());
        System.out.println(book.getYear());

        author2.setName("Агата");
        author2.setMale(false);
        author2.setEmail("agata@gmail.com");

        book.setName("Убийство в „Восточном экспрессе“");
        book.setAuthor(author2);
        book.setYear(1934);

        System.out.println(book);
    }
}

class Author {
    private String name;
    private boolean isMale;
    private String email;

    Author(String name, boolean isMale, String email) {
        this.name = name;
        this.isMale = isMale;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }
    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String value) {
        this.email = value;
    }

    @Override
    public String toString() {
        return name + " " + isMale + " " + email;
    }
}

class Book {
    private String name;
    private Author author;
    private int year;

    Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return name + " " + author + " " + year;
    }
}
