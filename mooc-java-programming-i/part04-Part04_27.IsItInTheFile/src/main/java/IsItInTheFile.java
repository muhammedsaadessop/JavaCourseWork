
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class IsItInTheFile {

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        System.out.println("Search for:");
        String searchString = scanner.nextLine();

        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            if (lines.contains(searchString)) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        } catch (IOException e) {
            System.out.println("Reading the file " + fileName + " failed.");
        }

        scanner.close();
    }
}
