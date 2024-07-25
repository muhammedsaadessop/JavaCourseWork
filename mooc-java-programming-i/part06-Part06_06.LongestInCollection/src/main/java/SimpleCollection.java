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

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }

        String longestElement = this.elements.get(0);

        for (String element : this.elements) {
            if (element.length() > longestElement.length()) {
                longestElement = element;
            }
        }

        return longestElement;
    }

    @Override
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("The collection ").append(this.name).append(" has ").append(this.elements.size()).append(" element");

        if (this.elements.size() > 1) {
            sb.append("s");
        }

        sb.append(":\n");

        for (String element : this.elements) {
            sb.append(element).append("\n");
        }

        return sb.toString();
    }
}
