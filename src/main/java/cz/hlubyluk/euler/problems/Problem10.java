package cz.hlubyluk.euler.problems;

/**
 * Summation of primes
 * Problem 10
 * <p>
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * <p>
 * Find the sum of all the primes below two million.
 * <p>
 * Created by HlubyLuk on 24.07.16.
 */
public class Problem10 extends Problem {
    public void solve() {
        long sum = 0;
        for (int i = 2; i < 2000000; i++) {
            if (proofByContradiction(i)) {
                sum += i;
            }
        }

        String format = String.format("Sum %d", sum);
        System.out.println(format);
    }
}
