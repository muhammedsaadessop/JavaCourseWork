public class Book {
    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return publicationYear == book.publicationYear &&
               name.equals(book.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + publicationYear;
        return result;
    }

    @Override
    public String toString() {
        return name + " (" + publicationYear + ")";
    }
}
