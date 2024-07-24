
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    private ArrayList<Item> items;

    public Items() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Items itemsList = new Items();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            itemsList.addItem(new Item(name));
        }

        itemsList.printItems();
    }
}
