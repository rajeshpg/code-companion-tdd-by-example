package example.tdd;

public class Franc extends Money {

    public Franc(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public String currency() {
        return currency;
    }

    public Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }

}
