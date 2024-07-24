
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            numbers.add(input);
        }

        System.out.print("Search for? ");
        int searchNumber = scanner.nextInt();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == searchNumber) {
                System.out.println(searchNumber + " is at index " + i);
            }
        }
    }
}
