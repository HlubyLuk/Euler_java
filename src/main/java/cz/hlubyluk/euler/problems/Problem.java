package cz.hlubyluk.euler.problems;

import cz.hlubyluk.euler.utils.Constants;

import java.math.BigDecimal;
import java.text.StringCharacterIterator;
import java.util.*;

/**
 * Helper class for easier common implementation.
 * <p>
 * Created by HlubyLuk on 24.07.16.
 */
public abstract class Problem {

    static final Number NOT_IMPLEMENTED = Long.MIN_VALUE;

    /**
     * Common method for problems. Easier call from {@link cz.hlubyluk.euler.App#main(String[])}
     * method.
     */
    public abstract Number solve();

    /**
     * Proof by contradiction.
     *
     * @param number to resolve.
     * @return {@link Boolean#TRUE} is prime number, {@link Boolean#FALSE} divisible with other
     * number.
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
     * @return booleans array where {@link Boolean#FALSE} is prime number {@link Boolean#TRUE} is
     * divisible with prime number
     */
    boolean[] sieveOfEratosthenes(int number) {
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
    int gcd(int a, int b) {
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
     * By adding another row of dots and counting all the dots we can find the next number of the
     * sequence.
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
     * Amicable numbers are two different numbers so related that the sum of the proper divisors of
     * each is equal to the other number.
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

    /**
     * In number theory, an abundant number or excessive number is a number for which the sum of its
     * proper divisors is greater than the number itself. The integer 12 is the first abundant
     * number. Its proper divisors are 1, 2, 3, 4 and 6 for a total of 16. The amount by which the
     * sum exceeds the number is the abundance. The number 12 has an abundance of 4, for example.
     *
     * @param number to resolve.
     * @return {@link Boolean#TRUE} abundant number, otherwise {@link Boolean#FALSE} non abundant
     * number.
     */
    boolean isAbundant(int number) {
        return number < sumDividers(number);
    }

    /**
     * Transform input array into next lexicographic permutation.
     *
     * @param sequence input for modification.
     * @return {@link Boolean#TRUE} when sequence has next permutation, otherwise
     * {@link Boolean#FALSE}.
     */
    boolean nextLexicographicPermutations(int[] sequence) {
        int i = sequence.length - 2;
        while (i > 0 && sequence[i] >= sequence[i + 1]) {
            i--;
        }

        int j = sequence.length - 1;
        while (j > 0 && sequence[j] <= sequence[i]) {
            j--;
        }

        int tmp = sequence[i];
        sequence[i] = sequence[j];
        sequence[j] = tmp;

        int x = i + 1, y = sequence.length - 1;
        int[] clone = sequence.clone();
        while (x < y) {
            tmp = clone[x];
            sequence[x] = clone[y];
            sequence[y] = tmp;

            x++;
            y--;
        }

        return true;
    }

    /**
     * Iteration trow number and digits powered and sum together.
     *
     * @param number to sum.
     * @param exponent second number of call {@link Math#pow(double, double)}.
     * @return sum of powered digits.
     */
    int digitPowSum(int number, int exponent) {
        String value = String.valueOf(number);
        StringCharacterIterator iterator = new StringCharacterIterator(value);
        int tmp = 0;

        for (char i = iterator.first(); i != StringCharacterIterator.DONE; i = iterator.next()) {
            tmp += Math.pow(i - Constants.ZERO_CHAR, exponent);
        }

        return tmp;
    }

    /**
     * Check number is prime number.
     *
     * @param number to resolve.
     * @return {@link Boolean#TRUE} is prime number, otherwise {@link Boolean#FALSE}.
     */
    boolean isPrime(int number) {
        return proofByContradiction(number);
    }

    /**
     * Decomposition of number into prime dividers.
     *
     * @param number to resolve.
     * @return {@link ArrayList} of {@link Integer} primes dividers.
     */
    List<Integer> primeNumbers(int number) {
        List<Integer> tmp = new ArrayList<>();
        boolean[] primeBooleans = sieveOfEratosthenes(number);
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 0; i < primeBooleans.length; i += 1) {
            if (!primeBooleans[i]) {
                primes.add(i);
            }
        }
        for (int i = primes.size() - 1; i >= 0;) {
            Integer prime = primes.get(i);
            if (number % prime == 0) {
                tmp.add(prime);
                number /= prime;
            } else {
                i -= 1;
            }
        }
        Collections.sort(tmp);
        return tmp;
    }

    /**
     * Check input is same from start to end and end to start.
     *
     * @param in number to check.
     * @return {@link Boolean#TRUE} is palindromic, otherwise {@link Boolean#FALSE}.
     */
    protected boolean isPalindromic(Number in) {
        return this.isPalindromic(String.valueOf(in));
    }

    /**
     * Check input is same from start to end and end to start.
     *
     * @param in string input to check.
     * @return {@link Boolean#TRUE} is palindromic, otherwise {@link Boolean#FALSE}.
     */
    protected boolean isPalindromic(String in) {
        String rev = new StringBuilder(in).reverse().toString();
        return in.equals(rev);
    }

    /**
     * Convert <code>int<code/> into binary string.
     *
     * @param in to convert.
     * @return binary string.
     */
    protected String toBinary(int in) {
        return Integer.toBinaryString(in);
    }

    /**
     * Get sum form list of integers.
     *
     * @param in collection to sum.
     * @return sum of collection.
     */
    protected int sum(List<Integer> in) {
        return in.stream().reduce((a, b) -> a + b).get();
    }
}
