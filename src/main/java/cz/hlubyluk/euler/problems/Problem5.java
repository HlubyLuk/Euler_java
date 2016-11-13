package cz.hlubyluk.euler.problems;

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
        boolean check;
        int tmp;
        for (int i = START; ; i += STEP) {
            check = true;
            for (int j = START; j <= STOP; j += STEP) {
                check = i % j == 0;
                if (!check) break;
            }
            if (check) {
                tmp = i;
                break;
            }
        }
        return tmp;
    }
}
