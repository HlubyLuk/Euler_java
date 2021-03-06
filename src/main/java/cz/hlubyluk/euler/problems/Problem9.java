package cz.hlubyluk.euler.problems;

/**
 * Special Pythagorean triplet
 * Problem 9
 * <p>
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c^2
 * <p>
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * <p>
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 * <p>
 * Created by HlubyLuk on 24.07.16.
 */
public class Problem9 extends Problem {

    private static final int STOP = 1000;

    public Number solve() {
        for (int a = 1; a < STOP; a++) {
            for (int b = 1; b < STOP; b++) {
                int c = STOP - a - b;

                if (a < b && b < c && (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))) {
                    return a * b * c;
                }
            }
        }

        return NOT_IMPLEMENTED;
    }
}
