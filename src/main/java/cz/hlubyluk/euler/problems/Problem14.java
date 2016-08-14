package cz.hlubyluk.euler.problems;

import java.util.ArrayList;

/**
 * Longest Collatz sequence
 * Problem 14
 * <p>
 * The following iterative sequence is defined for the set of positive integers:
 * <p>
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 * <p>
 * Using the rule above and starting with 13, we generate the following sequence:
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * <p>
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
 * Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 * <p>
 * Which starting number, under one million, produces the longest chain?
 * <p>
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 * <p>
 * Created by HlubyLuk on 13.08.16.
 */
public class Problem14 extends Problem {
    @Override
    public void solve() {
        CollatzSequenceSolver biggest = null;

        for (int i = 1000000; i > 0; i--) {
            CollatzSequenceSolver solver = new CollatzSequenceSolver(i);
            solver.solve();

            int count = solver.getCount();
            if (biggest == null || biggest.getCount() < count) {
                biggest = solver;
            }
        }

        System.out.println(biggest);
    }

    /**
     * The Collatz sequence, also called the Hailstone sequence,
     * is a sequence of numbers relevant to the Collatz conjecture,
     * which theorizes that any number using this algorithm will eventually be reduced to 1.
     * The conjecture's truth is supported by calculations,
     * but it hasn't yet been proved that no number can indefinitely stay above 1.
     */
    private class CollatzSequenceSolver {
        int count = 0;
        int start = 0;

        CollatzSequenceSolver(int start) {
            this.start = start;
        }

        public void solve() {
            ArrayList<Long> list = new ArrayList<Long>();
            long number = start;

            list.add(number);
            while (number != 1) {
                if (number % 2 == 0) {
                    number = even(number);
                } else {
                    number = odd(number);
                }

                list.add(number);
            }

            count = list.size();
        }

        /**
         * Compute odd number.
         *
         * @param number input
         * @return other number to solve.
         */
        private long odd(long number) {
            return (3 * number) + 1;
        }

        /**
         * Compute even number.
         *
         * @param number input.
         * @return other number to solve.
         */
        private long even(long number) {
            return number / 2;
        }

        /**
         * Get count numbers in sequence.
         *
         * @return sequence length.
         */
        int getCount() {
            return count;
        }

//        /**
//         * Getter of start point.
//         *
//         * @return where sequence start.
//         */
//        int getStart() {
//            return start;
//        }

        @Override
        public String toString() {
            return String.format("Start = %d, count = %d", start, count);
        }
    }
}
