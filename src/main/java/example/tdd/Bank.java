package example.tdd;

public class Bank {

    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public void addRate(String chf, String usd, int i) {

    }
}
