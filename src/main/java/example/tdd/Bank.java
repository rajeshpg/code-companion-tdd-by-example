package example.tdd;

import java.util.Hashtable;

public class Bank {

    private Hashtable rates = new Hashtable();

    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), new Integer(rate));
    }

    public int rate(String from, String to) {
        Integer rate = (Integer) rates.get(new Pair(from, to));
        return rate.intValue();
    }


    private class Pair {
        private String from;
        private String to;

        public Pair(String from, String to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public int hashCode() {
            return 0;
        }

        @Override
        public boolean equals(Object object) {
            Pair pair = (Pair) object;
            return from.equals(pair.from) && to.equals(pair.to);
        }
    }
}
