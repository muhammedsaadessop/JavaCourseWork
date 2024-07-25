
import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == searchedId) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, int searchedId) {
        int begin = 0;
        int end = books.size() - 1;

        while (begin <= end) {
            int middle = (begin + end) / 2;
            Book book = books.get(middle);

            if (book.getId() == searchedId) {
                return middle;
            } else if (book.getId() < searchedId) {
                begin = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "Book A"));
        books.add(new Book(2, "Book B"));
        books.add(new Book(3, "Book C"));
        books.add(new Book(4, "Book D"));
        books.add(new Book(5, "Book E"));

        System.out.println("Linear Search:");
        System.out.println(linearSearch(books, 3));
        System.out.println(linearSearch(books, 6));

        System.out.println("Binary Search:");
        System.out.println(binarySearch(books, 3));
        System.out.println(binarySearch(books, 6));
    }
      
}

