package cz.hlubyluk.euler.problems;

import cz.hlubyluk.euler.solvers.SolverCircular;

/**
 * Circular primes
 * Problem 35
 * <p/>
 * The number, 197, is called a circular prime because all rotations of the digits: 197, 971,
 * and 719, are themselves prime.
 * <p/>
 * There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.
 * <p/>
 * How many circular primes are there below one million?
 * <p/>
 * Created by HlubyLuk on 06/02/2017.
 */
public class Problem35 extends Problem{
    @Override
    public Number solve() {
        return new SolverCircular(1000000).solve();
    }
}
