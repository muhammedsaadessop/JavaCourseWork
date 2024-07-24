
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> birthYears = new ArrayList<>();
        String longestName = "";
        int sumOfBirthYears = 0;

        while (true) {
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }
            
            String[] parts = input.split(",");
            String name = parts[0];
            int birthYear = Integer.parseInt(parts[1]);
            
            names.add(name);
            birthYears.add(birthYear);
            sumOfBirthYears += birthYear;
            
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        
        double averageBirthYear = (double) sumOfBirthYears / birthYears.size();
        
        System.out.println("Longest name: " + longestName);
        System.out.printf("Average:"+ averageBirthYear);
    }
}
