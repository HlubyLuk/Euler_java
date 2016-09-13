package cz.hlubyluk.euler.problems;

import cz.hlubyluk.euler.solvers.RecurringSolver;

/**
 * Reciprocal cycles
 * Problem 26
 * <p>
 * A unit fraction contains 1 in the numerator.
 * The decimal representation of the unit fractions with denominators 2 to 10 are given:
 * <p>
 * 1/2  = 0.5
 * 1/3  = 0.(3)
 * 1/4  = 0.25
 * 1/5  = 0.2
 * 1/6  = 0.1(6)
 * 1/7  = 0.(142857)
 * 1/8  = 0.125
 * 1/9  = 0.(1)
 * 1/10 = 0.1
 * <p>
 * Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle.
 * It can be seen that 1/7 has a 6-digit recurring cycle.
 * <p>
 * Find the value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal fraction part.
 * Created by HlubyLuk on 30.08.16.
 */
public class Problem26 extends Problem {
    private static final int START = 2;
    //    private static final int STOP = 11;
//    private static final int STOP = 210;
    private static final int STOP = 1000;
    private static final int PRECISION = 1000;

    @Override
    public void solve() {
        RecurringSolver biggest = new RecurringSolver(Integer.MIN_VALUE, Integer.MIN_VALUE);

        for (int i = START; i < STOP; i++) {
            RecurringSolver solver = new RecurringSolver(1, i);
            solver.setDecimalLength(PRECISION);
            solver.solveRecurring();

            int length = solver.getLengthOfRest();

            if (biggest.getLengthOfRest() < length) {
                biggest = solver;
            }
        }

        System.out.println(biggest);
    }
}
