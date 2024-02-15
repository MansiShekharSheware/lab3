package demojava;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class BookApplication {
    public static void main(String[] args) {
        // Create a predefined list of programming books
        List<Book> programmingBooks = new ArrayList<>();
        programmingBooks.add(new Book(101, "Clean Code", "Robert C. Martin", 29.99));
        programmingBooks.add(new Book(102, "Design Patterns", "Erich Gamma", 24.95));
        programmingBooks.add(new Book(103, "Java: The Complete Reference", "Herbert Schildt", 39.99));

        // Display details for each predefined programming book
        for (Book book : programmingBooks) {
            book.displayBookDetails();
            System.out.println("---------------------");
        }

        // Get user input for book ID
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Book ID to get details: ");
        int userBookId = scanner.nextInt();

        // Find and display the details of the selected book
        boolean bookFound = false;
        for (Book book : programmingBooks) {
            if (book.bookid == userBookId) {
                book.displayBookDetails();
                bookFound = true;
                break;
            }
        }

        // Display a message if the book is not found
        if (!bookFound) {
            System.out.println("Book with ID " + userBookId + " not found.");
        }

        // Close the Scanner to prevent resource leak
        scanner.close();
    }
}
