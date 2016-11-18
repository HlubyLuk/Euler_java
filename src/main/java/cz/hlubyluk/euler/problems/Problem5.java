package cz.hlubyluk.euler.problems;

import cz.hlubyluk.euler.entity.MapCounting;

import java.util.List;

/**
 * Smallest multiple
 * Problem 5
 * <p>
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * <p>
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * <p>
 * Created by HlubyLuk on 24.07.16.
 */
public class Problem5 extends Problem {
    private static final int START = 1, STOP = 20, STEP = START;

    public Number solve() {
        int tmp = 1;
        int[] arrMax = new int[STOP];
        for (int i = START; i <= STOP; i += STEP) {
            MapCounting counter = new MapCounting(STOP);
            List<Integer> primes = primeNumbers(i);
            for (Integer prime : primes) counter.add(prime);
            for (int j = 1; j < STOP; j += 1) {
                Integer max = counter.get(j + 1);
                if (arrMax[j] < max) arrMax[j] = max;
            }
        }
        for (int i = START - 1; i < STOP; i += STEP) tmp *= Math.pow(i + 1, arrMax[i]);
        return tmp;
    }
}
