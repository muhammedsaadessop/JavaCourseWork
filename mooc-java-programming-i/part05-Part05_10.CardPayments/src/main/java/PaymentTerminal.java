public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000; // Initial cash in the register
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        final double mealCost = 2.50;
        if (payment >= mealCost) {
            this.money += mealCost;
            this.affordableMeals++;
            return payment - mealCost;
        } else {
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        final double mealCost = 4.30;
        if (payment >= mealCost) {
            this.money += mealCost;
            this.heartyMeals++;
            return payment - mealCost;
        } else {
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        final double mealCost = 2.50;
        if (card.balance() >= mealCost) {
            card.takeMoney(mealCost);
            this.affordableMeals++;
            return true;
        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        final double mealCost = 4.30;
        if (card.balance() >= mealCost) {
            card.takeMoney(mealCost);
            this.heartyMeals++;
            return true;
        } else {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
