import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String category;
    public static int totalBooks = 0;
    private static ArrayList<Book> allBooks = new ArrayList<>();

    public Book(String title, String author, String category) {
        this.title = title;
        this.author = author;
        this.category = category;
        totalBooks++;
        allBooks.add(this);
    }

    public String details() {
        return "Title: " + title + "\n" +
               "Author: " + author + "\n" +
               "Category: " + category;
    }

    public static void displayAllBooks() {
        for (int i = 0; i < allBooks.size(); i++) {
            Book b = allBooks.get(i);
            System.out.println("Book " + (i + 1) + ":");
            System.out.println(b.details());
        }
    }
} 