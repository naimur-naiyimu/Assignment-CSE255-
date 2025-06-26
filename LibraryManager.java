public class LibraryManager {
    private int fictionCount = 0;
    private int nonfictionCount = 0;
    private int magazineCount = 0;

    public void borrowBook(String category) {
        if (category.equalsIgnoreCase("Fiction")) {
            fictionCount++;
            System.out.println("Fiction book borrowed. Return within 7 days.");
        } else if (category.equalsIgnoreCase("Nonfiction")) {
            nonfictionCount++;
            System.out.println("Nonfiction book borrowed. Return within 10 days.");
        } else if (category.equalsIgnoreCase("Magazine")) {
            magazineCount++;
            System.out.println("Magazine borrowed. Return within 3 days.");
        } else {
            System.out.println("Invalid category. Please enter Fiction, Nonfiction, or Magazine.");
        }
    }

    public void displaySummary() {
        System.out.println("--- Borrow Summary ---");
        System.out.println("Fiction books borrowed: " + fictionCount);
        System.out.println("Nonfiction books borrowed: " + nonfictionCount);
        System.out.println("Magazines borrowed: " + magazineCount);
    }
} 