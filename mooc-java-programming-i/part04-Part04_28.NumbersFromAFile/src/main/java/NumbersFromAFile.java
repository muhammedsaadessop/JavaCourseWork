
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class NumbersFromAFile {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File?");
        String fileName = scanner.nextLine();

        System.out.println("Lower bound?");
        int lowerBound = Integer.parseInt(scanner.nextLine());

        System.out.println("Upper bound?");
        int upperBound = Integer.parseInt(scanner.nextLine());

        int count = 0;

        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            for (String line : lines) {
                int number = Integer.parseInt(line.trim());
                if (number >= lowerBound && number <= upperBound) {
                    count++;
                }
            }
            System.out.println("Numbers: " + count);
        } catch (IOException e) {
            System.out.println("Reading the file " + fileName + " failed.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in file.");
        }

        scanner.close();
    }

}
