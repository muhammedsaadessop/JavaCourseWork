
public class MainProgram {

    public static void main(String[] args) {
        Counter counter1 = new Counter(5);
        System.out.println("Initial value: " + counter1.value());
        counter1.increase();
        System.out.println("After increase(): " + counter1.value());
        counter1.decrease();
        System.out.println("After decrease(): " + counter1.value());
        counter1.increase(10);
        System.out.println("After increase(10): " + counter1.value());
        counter1.decrease(3);
        System.out.println("After decrease(3): " + counter1.value());
    }
}
