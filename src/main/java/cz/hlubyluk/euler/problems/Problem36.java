package cz.hlubyluk.euler.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Double-base palindromes Problem 36
 *
 * <p>The decimal number, 585 = 1001001001 (binary), is palindromic in both bases.
 *
 * <p>Find the sum of all numbers, less than one million, which are palindromic in base 10 and base
 * 2.
 *
 * <p>(Please note that the palindromic number, in either base, may not include leading zeros.)
 *
 * <p>
 *
 * @author HlubyLuk
 */
public class Problem36 extends Problem {
    private static final int START = 1, STEP = 1, STOP = 1000000;

    @Override
    public Number solve() {
        List<Integer> palindromics = new ArrayList<>();
        for (int i = START; i < STOP; i += STEP) {
            if (this.isPalindromic(i) && this.isPalindromic(this.toBinary(i))) {
                palindromics.add(i);
            }
        }
        return this.sum(palindromics);
    }
}
