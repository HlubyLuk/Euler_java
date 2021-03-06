package cz.hlubyluk.euler.problems;

import java.util.TreeSet;

/**
 * 10001st prime
 * Problem 7
 * <p>
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * <p>
 * What is the 10 001st prime number?
 * <p>
 * Created by HlubyLuk on 24.07.16.
 */
public class Problem7 extends Problem {
    public Number solve() {
        TreeSet<Integer> ret = new TreeSet<>();

        for (int i = 0; ret.size() < 10001; i++) {
            if (proofByContradiction(i)) {
                ret.add(i);
            }
        }

        return ret.last();
    }
}
