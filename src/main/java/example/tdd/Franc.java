package example.tdd;

public class Franc extends Money {

    private String currency;

    public Franc(int amount, String currency) {
        this.amount = amount;
        this.currency = "CHF";
    }

    @Override
    public String currency() {
        return currency;
    }

    public Money times(int multiplier) {
        return new Franc(amount * multiplier, null);
    }

}
