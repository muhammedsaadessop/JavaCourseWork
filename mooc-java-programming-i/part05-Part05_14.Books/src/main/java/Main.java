
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Book> bookList = new HashSet<>();
        
        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) break;

            System.out.println("Publication year:");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            Book newBook = new Book(name, publicationYear);

            if (bookList.contains(newBook)) {
                System.out.println("The book is already on the list. Let's not add the same book again.");
            } else {
                bookList.add(newBook);
            }
        }
        
        System.out.println("Thank you! Books added: " + bookList.size());
    }
}
