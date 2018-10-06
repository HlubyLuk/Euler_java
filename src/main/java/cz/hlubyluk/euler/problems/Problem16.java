package cz.hlubyluk.euler.problems;

import java.math.BigInteger;

/**
 * Power digit sum Problem 16
 *
 * <p>2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 *
 * <p>What is the sum of the digits of the number 2^1000?
 *
 * <p>Created by HlubyLuk on 13.08.16.
 */
public class Problem16 extends Problem {
    @Override
    public Number solve() {
        BigInteger two = BigInteger.valueOf(2L);
        BigInteger pow = two.pow(1000);
        String powAsTxt = pow.toString();

        int ret = 0;
        for (int i = 0; i < powAsTxt.length(); i++) {
            char c = powAsTxt.charAt(i);
            String valueOf = String.valueOf(c);
            ret += Integer.valueOf(valueOf);
        }

        return ret;
    }
}
