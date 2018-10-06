package cz.hlubyluk.euler.problems;

import cz.hlubyluk.euler.solvers.CollatzSequenceSolver;

/**
 * Longest Collatz sequence Problem 14
 *
 * <p>The following iterative sequence is defined for the set of positive integers:
 *
 * <p>n → n/2 (n is even) n → 3n + 1 (n is odd)
 *
 * <p>Using the rule above and starting with 13, we generate the following sequence: 13 → 40 → 20 →
 * 10 → 5 → 16 → 8 → 4 → 2 → 1
 *
 * <p>It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
 * Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers
 * finish at 1.
 *
 * <p>Which starting number, under one million, produces the longest chain?
 *
 * <p>NOTE: Once the chain starts the terms are allowed to go above one million.
 *
 * <p>Created by HlubyLuk on 13.08.16.
 */
public class Problem14 extends Problem {
    @Override
    public Number solve() {
        CollatzSequenceSolver biggest = null;

        for (int i = 1000000; i > 0; i--) {
            CollatzSequenceSolver solver = new CollatzSequenceSolver(i);
            solver.solve();

            int count = solver.getCount();
            if (biggest == null || biggest.getCount() < count) {
                biggest = solver;
            }
        }

        return biggest.getStart();
    }
}
