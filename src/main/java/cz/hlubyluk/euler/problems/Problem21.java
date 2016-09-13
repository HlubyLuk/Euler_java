package cz.hlubyluk.euler.problems;

/**
 * Amicable numbers
 * Problem 21
 * <p>
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
 * If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair
 * and each of a and b are called amicable numbers.
 * <p>
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110;
 * therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
 * <p>
 * Evaluate the sum of all the amicable numbers under 10000.
 * <p>
 * Created by HlubyLuk on 14.08.16.
 */
public class Problem21 extends Problem {

    private static final int STOP = 10000;

    @Override
    public void solve() {
        int ret = 0;

        for (int i = 1; i < STOP; i++) {
            if (isAmicable(i)) {
                ret += i;
            }
        }

        System.out.println(ret);
    }

}
