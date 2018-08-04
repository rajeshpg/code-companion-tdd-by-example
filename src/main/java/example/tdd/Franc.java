package example.tdd;

public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    public String currency() {
        return currency;
    }
}
