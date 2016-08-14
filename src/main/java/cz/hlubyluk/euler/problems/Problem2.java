package cz.hlubyluk.euler.problems;

/**
 * Even Fibonacci numbers
 * Problem 2
 * <p>
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * <p>
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 * find the sum of the even-valued terms.
 * <p>
 * Created by HlubyLuk on 24.07.16.
 */
public class Problem2 extends Problem {

    private static final int LIMIT = 4000000;

    public Problem2() {
    }

    @Override
    public void solve() {
        int ret = 0;
        int a = 0;
        int b = 1;
        while (a + b < LIMIT) {
            int temp = a + b;
            a = b;
            b = temp;
            if (temp % 2 == 0) {
                ret += temp;
            }
        }

        System.out.println(ret);
    }
}