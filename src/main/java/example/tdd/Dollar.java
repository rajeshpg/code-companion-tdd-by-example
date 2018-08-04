package example.tdd;

public class Dollar extends Money {

    private String currency;

    public Dollar(int amount, String currency) {
        this.amount = amount;
        this.currency = "USD";
    }

    @Override
    public String currency() {
        return currency;
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier, null);
    }

}
