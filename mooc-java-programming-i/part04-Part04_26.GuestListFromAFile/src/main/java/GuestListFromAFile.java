
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GuestListFromAFile {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        Set<String> guestList = new HashSet<>();

        try {
            // Read guest list from file
            Files.lines(Paths.get(fileName)).forEach(guestList::add);
        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
            return;
        }

        System.out.println("Enter names, an empty line quits.");

        while (true) {
            String name = scanner.nextLine();
            
            if (name.isEmpty()) {
                break;
            }
            
            if (guestList.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }

        System.out.println("Thank you!");
        scanner.close();
    }
}
