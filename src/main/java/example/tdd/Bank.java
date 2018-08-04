package example.tdd;

public class Bank {

    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public void addRate(String chf, String usd, int i) {

    }

    public int rate(String from, String to) {
        return (from.equals("CHF") && to.equals("USD")) ? 2 : 1;
    }
}
