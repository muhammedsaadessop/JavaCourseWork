public class Person {
    private String name;
    private Pet pet;

    public Person(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public Pet getPet() {
        return pet;
    }

    @Override
    public String toString() {
        if (pet != null) {
            return name + ", has a friend called " + pet.getName() + " (" + pet.getBreed() + ")";
        } else {
            return name + " has no pets.";
        }
    }
}
