package cz.hlubyluk.euler.problems;

import java.util.TreeSet;

/**
 * Largest prime factor Problem 3
 *
 * <p>The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * <p>What is the largest prime factor of the number 600851475143 ?
 *
 * <p>Created by HlubyLuk on 24.07.16.
 */
public class Problem3 extends Problem {

    @Override
    public Number solve() {
        long number = 600851475143L;
        TreeSet<Integer> integers = new TreeSet<>();
        for (int i = 0; number != 1; i++) {
            if (i != 0 && number % i == 0 && i != 1) {
                number /= i;
                integers.add(i);
                i = 0;
            }
        }

        return integers.last();
    }
}
