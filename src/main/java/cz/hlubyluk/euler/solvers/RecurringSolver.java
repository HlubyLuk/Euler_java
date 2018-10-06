package cz.hlubyluk.euler.solvers;

import java.util.Vector;

/** Created by HlubyLuk on 13.09.16. */
public class RecurringSolver {
    private final StringBuilder builder = new StringBuilder();
    private final Vector<Integer> rests = new Vector<>();
    private final int numerator;
    private final int denominator;
    private int precision;
    private String number;

    public RecurringSolver(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.precision = 32;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public String getFullNumber() {
        return String.format("%s.%s", this.number, this.getRest());
    }

    public int getLengthOfRest() {
        int tmp;

        if (builder.length() == 0) {
            tmp = 0;
        } else if (builder.charAt(builder.length() - 1) == ')') {
            tmp = builder.length() - 2;
        } else {
            tmp = builder.length();
        }

        return tmp;
    }

    public String getRest() {
        return this.builder.toString();
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public void solveRecurring() {
        this.number = String.valueOf(this.numerator / this.denominator);
        int rest = this.numerator % this.denominator;
        for (int i = 0; i < this.precision && rest > 0 && !rests.contains(rest); i++) {
            this.rests.add(rest);
            rest *= 10;
            builder.append(rest / this.denominator);
            rest %= this.denominator;
        }
    }

    @Override
    public String toString() {
        return "RecurringSolver{"
                + "denominator(index)="
                + denominator
                + ", lengthOfRest="
                + getLengthOfRest()
                + ", getFullNumber='"
                + getFullNumber()
                + '\''
                + '}';
    }
}
