package cz.hlubyluk.euler.problems;

import java.util.TreeSet;

/**
 * Largest palindrome product
 * Problem 4
 * <p>
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * <p>
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * <p>
 * Created by HlubyLuk on 24.07.16.
 */
public class Problem4 extends Problem {

    private static final int LIMIT = 6;
    private static final int FROM = 1000;
    private static final int TO = 10;

    public void solve() {
        TreeSet<Integer> ret = new TreeSet<>();

        for (int i = FROM; i > TO; i--) {
            for (int j = FROM; j > TO; j--) {
                int temp = i * j;
                String a = String.valueOf(temp);
                String b = new StringBuilder(a).reverse().toString();

                if (a.equals(b) && a.length() == LIMIT && b.length() == LIMIT) {
                    ret.add(temp);
                }
            }
        }

        System.out.println(ret.last());
    }
}
