package cz.hlubyluk.euler.problems;

import java.math.BigInteger;
import java.util.Set;
import java.util.TreeSet;

/**
 * Non-abundant sums
 * Problem 23
 * <p>
 * A perfect number is a number for which the sum of its proper divisors is exactly equal to the number.
 * For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28,
 * which means that 28 is a perfect number.
 * <p>
 * A number n is called deficient if the sum of its proper divisors is less than n
 * and it is called abundant if this sum exceeds n.
 * <p>
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16,
 * the smallest number that can be written as the sum of two abundant numbers is 24.
 * By mathematical analysis, it can be shown that all integers greater than 28123
 * can be written as the sum of two abundant numbers. However,
 * this upper limit cannot be reduced any further by analysis even though it is known that the greatest number
 * that cannot be expressed as the sum of two abundant numbers is less than this limit.
 * <p>
 * Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
 * <p>
 * Created by HlubyLuk on 21.08.16.
 */
public class Problem23 extends Problem {
    private static final int STOP = 28123;

    @Override
    public void solve() {
        BigInteger ret = BigInteger.ZERO;
        boolean[] abundants_bool = new boolean[STOP];
        Set<Integer> abundant_sums = new TreeSet<>();

        for (int i = 0; i < STOP; i++) {
            abundants_bool[i] = isAbundant(i);
        }

        for (int i = 0; i < STOP; i++) {
            if (abundants_bool[i]) {
                abundant_sums.addAll(abundant_sum(i, abundants_bool));
            }
        }

        for (int i = 0; i < STOP; i++) {
            if (!abundant_sums.contains(i)) {
                ret = ret.add(BigInteger.valueOf(i));
            }
        }

        System.out.println(ret);
    }

    private Set<Integer> abundant_sum(int num, boolean[] bools) {
        Set<Integer> tmp = new TreeSet<>();
        for (int i = num; i < bools.length; i++) {
            if (bools[i]) {
                tmp.add(i + num);
            }
        }

        return tmp;
    }
}
