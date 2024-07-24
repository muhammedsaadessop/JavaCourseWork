
public class MainProgram {

    public static void main(String[] args) {
        Money a = new Money(10, 0);
        Money b = new Money(5, 0);
        Money c = a.plus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

        a = a.plus(c);
        System.out.println(a);  // 25.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

        Money d = new Money(3, 50);
        Money e = a.minus(d);
        System.out.println(a);  // 25.00e
        System.out.println(d);  // 3.50e
        System.out.println(e);  // 21.50e

        e = e.minus(a);
        System.out.println(a);  // 25.00e
        System.out.println(d);  // 3.50e
        System.out.println(e);  // 0.00e
    }
}
