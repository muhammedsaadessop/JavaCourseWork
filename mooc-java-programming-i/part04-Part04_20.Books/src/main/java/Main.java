import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
          List<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.print("Publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, pages, publicationYear));
        }

        System.out.print("What information will be printed? ");
        String printInfo = scanner.nextLine();

        if (printInfo.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (printInfo.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }

    }
}
