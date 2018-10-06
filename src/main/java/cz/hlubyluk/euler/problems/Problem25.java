package cz.hlubyluk.euler.problems;

import java.math.BigInteger;

/**
 * 1000-digit Fibonacci number Problem 25
 *
 * <p>The Fibonacci sequence is defined by the recurrence relation:
 *
 * <p>Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
 *
 * <p>Hence the first 12 terms will be:
 *
 * <p>F1 = 1 F2 = 1 F3 = 2 F4 = 3 F5 = 5 F6 = 8 F7 = 13 F8 = 21 F9 = 34 F10 = 55 F11 = 89 F12 = 144
 *
 * <p>The 12th term, F12, is the first term to contain three digits.
 *
 * <p>What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
 *
 * <p>Created by HlubyLuk on 29.08.16.
 */
public class Problem25 extends Problem {

    private static final int STOP = 1000;
    //    private static final int STOP = 3;

    @Override
    public Number solve() {
        BigInteger f1 = BigInteger.ONE, f2 = BigInteger.ONE, f3 = BigInteger.ZERO;
        int i = 2;

        while (f3.toString().length() != STOP) {
            f3 = f1.add(f2);

            f1 = f2;
            f2 = f3;

            i++;
        }

        return i;
    }
}
