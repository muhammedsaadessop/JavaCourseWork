
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

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

        System.out.print("From where? ");
        int startIndex = scanner.nextInt();
        System.out.print("To where? ");
        int endIndex = scanner.nextInt();

        for (int i = startIndex; i <= endIndex; i++) {
            System.out.println(numbers.get(i));
        }
    }
}
