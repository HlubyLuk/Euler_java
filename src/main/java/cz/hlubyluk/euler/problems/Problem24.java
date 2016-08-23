package cz.hlubyluk.euler.problems;

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
    private static final int[] START_SEQUENCE = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static final int STOP = 1000000;
//    private static final int[] START_SEQUENCE = {1, 2, 3, 4};
//    private static final int STOP = 24;

    @Override
    public void solve() {
        System.out.println(NOT_IMPLEMENTED);
    }
}
