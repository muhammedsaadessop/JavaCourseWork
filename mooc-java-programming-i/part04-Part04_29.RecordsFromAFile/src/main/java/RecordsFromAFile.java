
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class RecordsFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            for (String line : lines) {
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.parseInt(parts[1].trim());
                String ageWord = (age == 1) ? "year" : "years";
                System.out.println(name + ", age: " + age + " " + ageWord);
            }
        } catch (IOException e) {
            System.out.println("Reading the file " + fileName + " failed.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in file.");
        }

        scanner.close();
    }
}

