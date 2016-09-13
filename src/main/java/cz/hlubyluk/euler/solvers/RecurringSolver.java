package cz.hlubyluk.euler.solvers;

import java.util.Vector;

/**
 * Created by HlubyLuk on 13.09.16.
 */
public class RecurringSolver {
    private final StringBuilder builder = new StringBuilder();
    private final Vector<Integer> stack = new Vector<>();
    private final int numerator;
    private final int denominator;
    private int decimalLength;
    private String number;

    public RecurringSolver(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.decimalLength = 32;
    }

    public void solveRecurring() {
        this.number = String.valueOf(this.numerator / this.denominator);
        int x = this.numerator % this.denominator;

        for (int i = 0; i < this.decimalLength && !stack.contains(x); i++) {
            stack.add(x);

            int tmp = 1;
            while (x > 0 && x * Math.pow(10, tmp) <= this.denominator) {
                tmp += 1;
                builder.append('0');
            }

            x = (int) (x * Math.pow(10, tmp));

            builder.append(x / this.denominator);

            x = x % this.denominator;
        }

        if (x != 0) {
            int indexOf = stack.indexOf(x);
            builder.insert(indexOf, '(').append(')');
        } else {
            builder.deleteCharAt(builder.length() - 1);
        }
    }

    public void setDecimalLength(int decimalLength) {
        this.decimalLength = decimalLength;
    }

    public String getRest() {
        return this.builder.toString();
    }

    public String getFullNumber() {
        return String.format("%s.%s", this.number, this.getRest());
    }

    public int getDenominator() {
        return this.denominator;
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

    @Override
    public String toString() {
        return "RecurringSolver{" +
                "denominator(index)=" + denominator +
                ", lengthOfRest=" + getLengthOfRest() +
                ", getFullNumber='" + getFullNumber() + '\'' +
                '}';
    }
}
