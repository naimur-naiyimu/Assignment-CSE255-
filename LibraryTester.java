import java.util.Scanner;

public class LibraryTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryManager manager = new LibraryManager();
        String input;
        while (true) {
            System.out.print("Enter book category (Fiction, Nonfiction, Magazine) or 'exit' to stop: ");
            input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            manager.borrowBook(input);
        }
        manager.displaySummary();
    }
} 