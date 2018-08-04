package example.tdd;

public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    public String currency() {
        return currency;
    }

}
