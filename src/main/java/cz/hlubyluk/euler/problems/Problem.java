package cz.hlubyluk.euler.problems;

import java.math.BigDecimal;
import java.util.Set;
import java.util.TreeSet;

/**
 * Helper class for easier common implementation.
 * <p>
 * Created by HlubyLuk on 24.07.16.
 */
public abstract class Problem {
    /**
     * Common method for problems. Easier call from {@link cz.hlubyluk.euler.App#main(String[])} method.
     */
    public abstract void solve();

    /**
     * Proof by contradiction.
     *
     * @param number to resolve.
     * @return {@link Boolean#TRUE} is prime number, {@link Boolean#FALSE} divisible with other number.
     */
    boolean proofByContradiction(int number) {
        if (number == 2) {
            return true;
        }

        if (number < 2 || number % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Factorization of number.
     *
     * @param number for factorization.
     * @return booleans array where {@link Boolean#FALSE} is prime number
     * {@link Boolean#TRUE} is divisible with prime number
     */
    private boolean[] sieveOfEratosthenes(int number) {
        boolean[] sieves = new boolean[number + 1];
        sieves[0] = sieves[1] = true;

        for (int i = 2; i * i <= number; i++) {
            if (sieves[i]) {
                continue;
            }

            for (int j = 2 * i; j <= number; j += i) {
                sieves[j] = true;
            }
        }

        return sieves;
    }

    /**
     * Use {@link #sieveOfEratosthenes(int)} and filter only prime numbers.
     *
     * @param number for prime number factorization.
     * @return collection of prime dividers.
     */
    Set<Integer> primeDividers(int number) {
        Set<Integer> ret = new TreeSet<Integer>();

        boolean[] sieves = sieveOfEratosthenes(number);
        for (int i = 0; i < sieves.length; i++) {
            if (!sieves[i]) {
                ret.add(i);
            }
        }

        return ret;
    }

    /**
     * Greatest common divisor.
     *
     * @param a number 1.
     * @param b number 2.
     * @return greatest common divisor of the given numbers.
     */
    private int gcd(int a, int b) {
        if (a < 1 || b < 1) {
            throw new IllegalArgumentException("a or b is less than 1!!!");
        }

        do {
            int temp = a;
            a = b;
            b = temp % b;
        } while (b != 0);

        return a;
    }

    /**
     * Least common multiple.
     *
     * @param a number.
     * @param b number.
     * @return least common multiple of given numbers.
     */
    int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    /**
     * This sequence is generated from a pattern of dots which form a triangle.
     * <p>
     * By adding another row of dots and counting all the dots we can find the next number of the sequence.
     *
     * @param number edge of triangle.
     * @return count of dots in triangle.
     */
    long triangleNumber(int number) {
        return number * (number + 1) / 2;
    }

    /**
     * Compute dividers count.
     *
     * @param number for factorization.
     * @return count dividers.
     */
    int countOfDividers(long number) {
        int ret = 0;

        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                ret++;
            }
        }

        return ret * 2;
    }

    /**
     * Compute count k-value subset from n-value set.
     *
     * @param n number.
     * @param k number.
     * @return count of combination.
     */
    long binomialCoefficient(int n, int k) {
        return factorial(n).divide(factorial(n - k).multiply(factorial(k)), BigDecimal.ROUND_HALF_UP).longValue();
    }

    /**
     * Mathematics, the factorial of a non-negative integer n, denoted by n!
     *
     * @param number n.
     * @return product of all positive numbers, than bigger or equal to number.
     */
    BigDecimal factorial(int number) {
        BigDecimal ret;

        if (number <= 1) {
            ret = BigDecimal.ONE;
        } else {
            ret = new BigDecimal(number).multiply(factorial(number - 1));
        }

        return ret;
    }

    /**
     * Amicable numbers are two different numbers so related
     * that the sum of the proper divisors of each is equal to the other number.
     *
     * @param n number.
     * @return {@link Boolean#TRUE} number is amicable, otherwise {@link Boolean#FALSE}.
     */
    boolean isAmicable(int n) {
        int m = sumDividers(n);

        return m != n && sumDividers(m) == n;
    }

    /**
     * Compute sum of dividers.
     *
     * @param n number to fraction.
     * @return sum of dividers.
     */
    int sumDividers(int n) {
        int ret = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                ret += i;
            }
        }

        return ret;
    }
}