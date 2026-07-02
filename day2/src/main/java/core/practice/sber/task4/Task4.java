package core.practice.sber.task4;

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

        book.setName("Убийство в \"Восточном экспрессе\"");
        book.setAuthor(author2);
        book.setYear(1934);

        System.out.println(book);
    }
}