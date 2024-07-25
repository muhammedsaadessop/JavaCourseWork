
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    static class Recipe {
        String name;
        int cookingTime;
        ArrayList<String> ingredients = new ArrayList<>();

        Recipe(String name, int cookingTime) {
            this.name = name;
            this.cookingTime = cookingTime;
        }
        
        void addIngredient(String ingredient) {
            ingredients.add(ingredient);
        }

        @Override
        public String toString() {
            return name + ", cooking time: " + cookingTime;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();
        
        System.out.println("File to read: ");
        String fileName = scanner.nextLine();
        
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                if (name.isEmpty()) continue;
                
                int cookingTime = Integer.parseInt(fileScanner.nextLine());
                Recipe recipe = new Recipe(name, cookingTime);
                
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    if (line.isEmpty()) break;
                    recipe.addIngredient(line);
                }
                
                recipes.add(recipe);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return;
        }

        while (true) {
            System.out.println("\nCommands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");

            System.out.print("\nEnter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searchName = scanner.nextLine();
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.name.contains(searchName)) {
                        System.out.println(recipe);
                    }
                }
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.parseInt(scanner.nextLine());
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.cookingTime <= maxTime) {
                        System.out.println(recipe);
                    }
                }
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String searchIngredient = scanner.nextLine();
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.ingredients.contains(searchIngredient)) {
                        System.out.println(recipe);
                    }
                }
            } else {
                System.out.println("Unknown command.");
            }
        }
    }

}
