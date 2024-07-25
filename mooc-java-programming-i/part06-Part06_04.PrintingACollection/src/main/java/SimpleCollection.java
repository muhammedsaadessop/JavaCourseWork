import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    @Override
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        StringBuilder result = new StringBuilder("The collection " + this.name + " has " + this.elements.size());
        
        if (this.elements.size() == 1) {
            result.append(" element:\n");
        } else {
            result.append(" elements:\n");
        }

        for (String element : this.elements) {
            result.append(element).append("\n");
        }

        return result.toString().trim();
    }

    
}
