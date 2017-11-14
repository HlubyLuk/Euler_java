/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.hlubyluk.euler.utils;

import cz.hlubyluk.euler.problems.Problem;
import cz.hlubyluk.euler.solvers.SolverBase;

/**
 * Shared logic between {@link Problem}'s and {@link SolverBase}'s.
 * <p/>
 * @author HlubyLuk
 */
public abstract class Shared {

    /**
     * Proof by contradiction.
     * <p/>
     * @param number to resolve.
     * @return {@link Boolean#TRUE} is prime number, {@link Boolean#FALSE} divisible with other
     * number.
     */
    public boolean isPrime(int number) {
        if (number == 2) {
            return true;
        }
        if (number < 2 || number % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Proof by contradiction.
     * <p/>
     * @param number to resolve.
     * @return {@link Boolean#TRUE} is prime number, {@link Boolean#FALSE} divisible with other
     * number.
     */
    public boolean proofByContradiction(int number) {
        return this.isPrime(number);
    }
}
