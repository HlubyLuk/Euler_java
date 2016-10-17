package cz.hlubyluk.euler.problems;

import cz.hlubyluk.euler.solvers.PandigitalSolver;

import java.util.HashSet;

/**
 * Pandigital products
 * Problem 32
 * <p>
 * We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once; for example,
 * the 5-digit number, 15234, is 1 through 5 pandigital.
 * <p>
 * The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing multiplicand, multiplier,
 * and product is 1 through 9 pandigital.
 * <p>
 * Find the sum of all products whose multiplicand/multiplier/product identity can be written
 * as a 1 through 9 pandigital.
 * <p>
 * HINT: Some products can be obtained in more than one way so be sure to only include it once in your sum.
 * <p>
 * Created by HlubyLuk on 15.10.16.
 */
public class Problem32 extends Problem {

    private static final int START = 1;
    private static final int STOP_I = 100;
    private static final int STOP_J = 10000;

    @Override
    public Number solve() {
        int tmp = 0;
        HashSet<Integer> numbers = new HashSet<>();

        for (int i = START; i < STOP_I; i += 1) {
            for (int j = START; j < STOP_J; j += 1) {
                PandigitalSolver pandigitalSolver = new PandigitalSolver(i, j);

                if (pandigitalSolver.isPandigital(true)) {
                    int product = pandigitalSolver.getProduct();

                    numbers.add(product);
                }
            }
        }

        for (int number : numbers) {
            tmp += number;
        }

        return tmp;
    }

}
