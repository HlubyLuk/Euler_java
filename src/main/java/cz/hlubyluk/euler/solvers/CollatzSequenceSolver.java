package cz.hlubyluk.euler.solvers;

/**
 * The Collatz sequence, also called the Hailstone sequence, is a sequence of numbers relevant to
 * the Collatz conjecture, which theorizes that any number using this algorithm will eventually be
 * reduced to 1. The conjecture's truth is supported by calculations, but it hasn't yet been proved
 * that no number can indefinitely stay above 1.
 */
public class CollatzSequenceSolver {
    private int count = 0;
    private int start = 0;

    /**
     * Constructor.
     *
     * @param start of sequence.
     */
    public CollatzSequenceSolver(int start) {
        this.start = start;
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
    public int getCount() {
        return count == 0 ? Integer.MIN_VALUE : count;
    }

    public int getStart() {
        return start;
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

    /** Compute length of sequence. */
    public void solve() {
        long number = start;

        count++;
        while (number != 1) {
            if (number % 2 == 0) {
                number = even(number);
            } else {
                number = odd(number);
            }

            count++;
        }
    }

    @Override
    public String toString() {
        return String.format("Start = %d, count = %d", start, count);
    }
}
