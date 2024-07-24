
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printed?");
        String fileName = scanner.nextLine();
        
        File file = new File(fileName);
        
        if (file.exists()) {
            try {
                String content = new String(Files.readAllBytes(Paths.get(fileName)));
                System.out.println(content);
            } catch (IOException e) {
                System.err.println("An error occurred while reading the file.");
                e.printStackTrace();
            }
        } else {
            System.out.println("File not found.");
        }
        
        scanner.close();


    }
}
