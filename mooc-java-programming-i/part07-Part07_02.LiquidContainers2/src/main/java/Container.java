public class Container {

    private int amount;
    private static final int MAX_CAPACITY = 100;

    public Container() {
        this.amount = 0;
    }

    public int contains() {
        return this.amount;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.amount += amount;
            if (this.amount > MAX_CAPACITY) {
                this.amount = MAX_CAPACITY;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.amount -= amount;
            if (this.amount < 0) {
                this.amount = 0;
            }
        }
    }

    @Override
    public String toString() {
        return this.amount + "/100";
    }
}
