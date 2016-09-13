package cz.hlubyluk.euler.problems;

import java.math.BigDecimal;

/**
 * Factorial digit sum
 * Problem 20
 * <p>
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 * <p>
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * <p>
 * Find the sum of the digits in the number 100!
 * <p>
 * Created by HlubyLuk on 14.08.16.
 */
public class Problem20 extends Problem {

    private static final int LIMIT = 100;

    @Override
    public void solve() {
        int ret = 0;

        BigDecimal factorial = factorial(LIMIT);
        String factorialString = factorial.toString();
        for (int i = 0; i < factorialString.length(); i++) {
            char charAt = factorialString.charAt(i);
            ret += Character.getNumericValue(charAt);
        }

        System.out.println(ret);
    }
}
