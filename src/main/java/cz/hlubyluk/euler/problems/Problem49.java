package cz.hlubyluk.euler.problems;

/**
 * Prime permutationsProblem 49
 *
 * <p>The arithmetic sequence, 1487, 4817, 8147, in which each of the terms increases by 3330, is
 * unusual in two ways: (i) each of the three terms are prime, and, (ii) each of the 4-digit numbers
 * are permutations of one another.
 *
 * <p>T here are no arithmetic sequences made up of three 1-, 2-, or 3-digit primes, exhibiting this
 * property, but there is one other 4-digit increasing sequence.
 *
 * <p>What 12-digit number do you form by concatenating the three terms in this sequence?
 *
 * @author HlubyLuk
 */
public class Problem49 extends Problem {
    private static final int LIMIT = 10000;

    private boolean condition(int base, int x) {
        return x < Problem49.LIMIT && this.isPrime(x) && this.sameDigit(base, x);
    }

    @Override
    public Number solve() {
        for (int base = Problem49.LIMIT; base > 1000; base -= 1) {
            if (this.isPrime(base)) {
                for (int step = 1; step < Problem49.LIMIT; step += 1) {
                    int b = base + step;
                    int c = b + step;
                    if (this.condition(base, b)
                            && this.condition(base, c)
                            && this.condition(b, c)) {
                        return Long.valueOf(String.format("%d%d%d", base, b, c));
                    }
                }
            }
        }
        return Integer.MIN_VALUE;
    }
}
