package cz.hlubyluk.euler.solvers;

import java.util.stream.IntStream;

/**
 * The number, 197, is called a circular prime because all rotations of the digits: 197, 971, and
 * 719, are themselves prime.
 *
 * <p>Created by HlubyLuk on 06/02/2017.
 */
public class SolverCircular extends SolverBase<Long> {
    private final int start;
    private final int stop;

    public SolverCircular(int stop) {
        this(1, stop);
    }

    public SolverCircular(int start, int stop) {
        this.start = start;
        this.stop = stop;
    }

    /**
     * Check all circular of number are prime number.
     *
     * @param input number.
     * @return {@link Boolean#TRUE} all circular are primes, otherwise {@link Boolean#FALSE}.
     */
    private boolean isAllCircularPrime(int input) {
        String str = String.valueOf(input);
        int length = str.length();
        for (int i = 0; i < length; i += 1) {
            String tmp = str.substring(i, length) + str.substring(0, i);
            if (!prime(Integer.valueOf(tmp))) return false;
        }
        return true;
    }

    /**
     * Proof by contradiction.
     *
     * @param number to resolve.
     * @return {@link Boolean#TRUE} is prime number, {@link Boolean#FALSE} divisible with other
     *     number.
     */
    private boolean prime(int number) {
        return IntStream.range(3, (int) Math.sqrt(number)).noneMatch(x -> number % x == 0);
    }

    @Override
    public Long solve() {
        return IntStream.range(this.start, this.stop).filter(this::isAllCircularPrime).count();
    }
}
