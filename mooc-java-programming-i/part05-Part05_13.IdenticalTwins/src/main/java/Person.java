public class Person {
    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person otherPerson = (Person) obj;
        return this.name.equals(otherPerson.name) &&
               this.height == otherPerson.height &&
               this.weight == otherPerson.weight &&
               this.birthday.equals(otherPerson.birthday);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + birthday.hashCode();
        result = 31 * result + height;
        result = 31 * result + weight;
        return result;
    }
}
