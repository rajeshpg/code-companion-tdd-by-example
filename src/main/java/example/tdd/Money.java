package example.tdd;

public abstract class Money {
    protected int amount;
    protected String currency;

    public String currency(){
        return currency;
    }
    public abstract Money times(int multiplier);

    public static Money dollar(int amount) {
        return new Dollar(amount,null);
    }

    public static Money franc(int amount) {
        return new Franc(amount,null);
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }
}
