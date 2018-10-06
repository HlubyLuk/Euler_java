package cz.hlubyluk.euler.problems;

/**
 * Digit fifth powers Problem 30
 *
 * <p>Surprisingly there are only three numbers that can be written as the sum of fourth powers of
 * their digits:
 *
 * <p>1634 = 1^4 + 6^4 + 3^4 + 4^4 8208 = 8^4 + 2^4 + 0^4 + 8^4 9474 = 9^4 + 4^4 + 7^4 + 4^4
 *
 * <p>As 1 = 14 is not a sum it is not included.
 *
 * <p>The sum of these numbers is 1634 + 8208 + 9474 = 19316.
 *
 * <p>Find the sum of all the numbers that can be written as the sum of fifth powers of their
 * digits.
 *
 * <p>Created by HlubyLuk on 18.09.16.
 */
public class Problem30 extends Problem {

    private static final int START = 2;
    private static final int STOP = 1000000;
    private static final int EXPONENT = 5;

    @Override
    public Number solve() {
        int tmp = 0;

        for (int i = START; i < STOP; i++) {
            if (i == digitPowSum(i, EXPONENT)) {
                tmp += i;

                //                DEBGUG
                //                System.out.println(i + " " + tmp);
            }
        }

        return tmp;
    }
}
