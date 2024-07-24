
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldestName = "";
        int oldestAge = 0;

        while (true) {
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }
            
            String[] parts = input.split(",");
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);
            
            if (age > oldestAge) {
                oldestAge = age;
                oldestName = name;
            }
        }
        
        System.out.println("Name of the oldest: " + oldestName);
    }
}
