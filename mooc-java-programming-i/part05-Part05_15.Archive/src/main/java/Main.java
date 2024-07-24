
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Item> items = new LinkedHashMap<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) break;

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) break;

            Item item = new Item(identifier, name);

            items.putIfAbsent(identifier, item);
        }

        System.out.println("\n==Items==");
        for (Item item : items.values()) {
            System.out.println(item);
        }
    }
}
