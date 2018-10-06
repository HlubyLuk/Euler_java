package cz.hlubyluk.euler.problems;

/**
 * Number spiral diagonals Problem 28
 *
 * <p>Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is
 * formed as follows:
 *
 * <p>21 22 23 24 25 20 7 8 9 10 19 6 1 2 11 18 5 4 3 12 17 16 15 14 13
 *
 * <p>It can be verified that the sum of the numbers on the diagonals is 101.
 *
 * <p>What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same
 * way?
 *
 * <p>Created by HlubyLuk on 18.09.16.
 */
public class Problem28 extends Problem {

    // private static final int EDGE = 5;
    private static final int EDGE = 1001;
    private static final int[] MATRIX = new int[EDGE * EDGE];

    @Override
    public Number solve() {
        int shift = 2, counter = 0, tmp = 0;

        for (int i = 0; i < MATRIX.length; i++) {
            MATRIX[i] = i + 1;
        }

        for (int i = 0; i < MATRIX.length; i++) {
            if (i % shift == 0) {
                if (counter == 3) {
                    shift += 2;
                    counter = 0;
                } else {
                    counter++;
                }

                tmp += MATRIX[i];

                //                DEBUG
                //                String format = String.format("MATRIX[i]=%,9d, tmp=%,9d",
                // MATRIX[i], tmp);
                //                System.out.println(format);
            }
        }

        return tmp;
    }
}
