package cz.hlubyluk.euler.problems;

/**
 * Sum square difference
 * Problem 6
 * <p>
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 102 = 385
 * <p>
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 552 = 3025
 * <p>
 * Hence the difference between the sum of the squares of the first ten natural numbers
 * and the square of the sum is 3025 − 385 = 2640.
 * <p>
 * Find the difference between the sum of the squares of the first one hundred natural numbers
 * and the square of the sum.
 * <p>
 * Created by HlubyLuk on 24.07.16.
 */
public class Problem6 extends Problem {
    public Number solve() {
        int a = 0;
        for (int i = 1; i <= 100; i++) {
            a += Math.pow(i, 2);
        }

        int b = 0;
        for (int i = 1; i <= 100; i++) {
            b += i;
        }
        b = (int) Math.pow(b, 2);

        return b - a;
    }
}
