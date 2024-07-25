import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;
        final int MAX_CAPACITY = 100;

        while (true) {
            System.out.println("First: " + firstContainer + "/" + MAX_CAPACITY);
            System.out.println("Second: " + secondContainer + "/" + MAX_CAPACITY);

            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            String command = parts[0];
            if (command.equals("quit")) {
                break;
            }

            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                if (amount > 0) {
                    firstContainer += amount;
                    if (firstContainer > MAX_CAPACITY) {
                        firstContainer = MAX_CAPACITY;
                    }
                }
            } else if (command.equals("move")) {
                if (amount > 0) {
                    if (amount > firstContainer) {
                        amount = firstContainer;
                    }
                    firstContainer -= amount;
                    secondContainer += amount;
                    if (secondContainer > MAX_CAPACITY) {
                        secondContainer = MAX_CAPACITY;
                    }
                }
            } else if (command.equals("remove")) {
                if (amount > 0) {
                    if (amount > secondContainer) {
                        amount = secondContainer;
                    }
                    secondContainer -= amount;
                }
            }
        }
    }
}
