package example.tdd;

public class Dollar {
    int amount;
    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier){
        amount *= multiplier;
        return null;
    }
}
