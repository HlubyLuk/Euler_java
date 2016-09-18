package cz.hlubyluk.euler.problems;

/**
 * Multiples of 3 and 5
 * Problem 1
 * <p>
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * <p>
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * <p>
 * Created by HlubyLuk on 24.07.16.
 */
public class Problem1 extends Problem {

    private static final int LIMIT = 1000;

    @Override
    public Number solve() {
        int ret = 0;
        for (int i = 0; i < LIMIT; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                ret += i;
            }
        }

        return ret;
    }
}
