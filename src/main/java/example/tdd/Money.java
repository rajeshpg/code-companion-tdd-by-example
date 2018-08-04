package example.tdd;

public class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String currency(){
        return currency;
    }
    public Money times(int amount){
        return null;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount,"USD");
    }

    public static Money franc(int amount) {
        return new Franc(amount,"CHF");
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && currency().equals(money.currency());
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
