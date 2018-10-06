/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.hlubyluk.euler.problems;

import cz.hlubyluk.euler.solvers.SolverTruncatable;
import java.util.ArrayList;
import java.util.List;

/**
 * Truncatable primes Problem 37 The number 3797 has an interesting property. Being prime itself, it
 * is possible to continuously remove digits from left to right, and remain prime at each stage:
 * 3797, 797, 97, and 7. Similarly we can work from right to left: 3797, 379, 37, and 3.
 *
 * <p>Find the sum of the only eleven primes that are both truncatable from left to right and right
 * to left.
 *
 * <p>NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.
 *
 * @author HlubyLuk
 */
public class Problem37 extends Problem {
    private static final int START = 10, LIMIT = 11;

    @Override
    public Number solve() {
        List<Integer> tmp = new ArrayList<>();
        for (int i = START; tmp.size() < LIMIT; i += 1) {
            if (new SolverTruncatable(i).solve()) {
                tmp.add(i);
            }
        }
        return this.sum(tmp);
    }
}
