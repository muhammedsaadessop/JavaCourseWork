
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mainProgram {

     static class Bird {
        String name;
        String latinName;
        int observations;

        Bird(String name, String latinName) {
            this.name = name;
            this.latinName = latinName;
            this.observations = 0;
        }

        void addObservation() {
            this.observations++;
        }

        @Override
        public String toString() {
            return name + " (" + latinName + "): " + observations + " observations";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Bird> birds = new HashMap<>();
        
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();
                birds.putIfAbsent(name, new Bird(name, latinName));
            } else if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String birdName = scanner.nextLine();
                Bird bird = birds.get(birdName);
                if (bird != null) {
                    bird.addObservation();
                } else {
                    System.out.println("Not a bird!");
                }
            } else if (command.equals("All")) {
                for (Bird bird : birds.values()) {
                    System.out.println(bird);
                }
            } else if (command.equals("One")) {
                System.out.print("Bird? ");
                String birdName = scanner.nextLine();
                Bird bird = birds.get(birdName);
                if (bird != null) {
                    System.out.println(bird);
                } else {
                    System.out.println("Not a bird!");
                }
            } else if (command.equals("Quit")) {
                break;
            } else {
                System.out.println("Unknown command");
            }
        }
    }

}
