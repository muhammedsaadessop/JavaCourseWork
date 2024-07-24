
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

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

        int greatest = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (greatest < number) {
                greatest = number;
            }
        }
        System.out.println("The greatest number: " + greatest);
    }
}
