public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = cents < 10 ? "0" : "";
        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money addition) {
        int totalCents = this.cents + addition.cents;
        int totalEuros = this.euros + addition.euros + totalCents / 100;
        totalCents = totalCents % 100;
        return new Money(totalEuros, totalCents);
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {
        int totalCentsThis = this.euros * 100 + this.cents;
        int totalCentsDecreaser = decreaser.euros * 100 + decreaser.cents;
        int differenceCents = totalCentsThis - totalCentsDecreaser;

        if (differenceCents < 0) {
            differenceCents = 0;
        }

        int resultEuros = differenceCents / 100;
        int resultCents = differenceCents % 100;

        return new Money(resultEuros, resultCents);
    }
}
