package cz.hlubyluk.euler.problems;

import java.math.BigInteger;

/**
 * Lexicographic permutations
 * Problem 24
 * <p>
 * A permutation is an ordered arrangement of objects.
 * For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4.
 * If all of the permutations are listed numerically or alphabetically, we call it lexicographic order.
 * The lexicographic permutations of 0, 1 and 2 are:
 * <p>
 * 012   021   102   120   201   210
 * <p>
 * What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
 * <p>
 * Created by HlubyLuk on 22.08.16.
 */
public class Problem24 extends Problem {
    private static final int[] SEQUENCE = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static final int STOP = 1000000;
//    private static final int[] SEQUENCE = {0, 1, 2};
//    private static final int STOP = 6;
//    /** Wikipedia example https://en.wikipedia.org/wiki/Permutation#Generation_in_lexicographic_order */
//    private static final int[] SEQUENCE = {1, 2, 3, 4};
//    private static final int STOP = 24;

    @Override
    public Number solve() {
        int j = 1;
        while (j < STOP && nextLexicographicPermutations(SEQUENCE)) {
            j++;
        }
        StringBuilder tmp = new StringBuilder();
        for (int i : SEQUENCE) {
            tmp.append(i);
        }

        return new BigInteger(tmp.toString());
    }
}
