package cz.hlubyluk.euler.problems;

/**
 * Quadratic primes Problem 27
 *
 * <p>Euler discovered the remarkable quadratic formula: n^2+n+41
 *
 * <p>It turns out that the formula will produce 40 primes for the consecutive integer values
 * 0≤n≤39. However, when n=40,40^2+40+41=40(40+1)+41 is divisible by 41, and certainly when
 * n=41,41^2+41+41 is clearly divisible by 41.
 *
 * <p>The incredible formula n^2−79n+1601 was discovered, which produces 80 primes for the
 * consecutive values 0≤n≤79. The product of the coefficients, −79 and 1601, is −126479.
 *
 * <p>Considering quadratics of the form: n^2+an+b , where |a|<1000 and |b|≤1000 where |n| is the
 * modulus/absolute value of n e.g. |11|=11 and |−4|=4
 *
 * <p>Find the product of the coefficients, a and b, for the quadratic expression that produces the
 * maximum number of primes for consecutive values of n, starting with n=0.
 *
 * <p>Created by HlubyLuk on 18.09.16.
 */
public class Problem27 extends Problem {

    private static final int STOP = 1000;
    private static final int START = -STOP;

    private int magicFormula(int i, int j) {
        for (int n = 0; ; n++) {
            int tmp = n * n + n * i + j;

            if (tmp < 0 || !this.proofByContradiction(tmp)) {
                return n;
            }
        }
    }

    @Override
    public Number solve() {
        int n = 0, a = 0, b = 0;

        for (int i = START + 1; i < STOP; i++) {
            for (int j = START; j <= STOP; j++) {
                int tmp = magicFormula(i, j);
                if (n < tmp) {
                    n = tmp;
                    a = i;
                    b = j;
                }
            }
        }

        return a * b;
    }
}
