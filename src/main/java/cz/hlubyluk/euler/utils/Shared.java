/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.hlubyluk.euler.utils;

import cz.hlubyluk.euler.problems.Problem;
import cz.hlubyluk.euler.solvers.SolverBase;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Shared logic between {@link Problem}'s and {@link SolverBase}'s.
 * <p/>
 * @author HlubyLuk
 */
public abstract class Shared {

    protected static final char ZERO = '0';

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

    public boolean isPandigital(int number) {
        return this.check(number) && this.isPandigital(String.valueOf(number));
    }

    public boolean isPandigital(String number) {
        char[] tmp = number.toCharArray();
        Arrays.sort(tmp);
        return "123456789".equals(String.valueOf(tmp));
    }

    public boolean check(int number) {
        return this.check(Long.toString(number));
    }

    public boolean check(String number) {
        int[] items = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (char item : number.toCharArray()) {
            final int x = item - ZERO;
            items[x] += 1;
            if (items[x] == 2) {
                return false;
            }
        }
        return true;
    }
}
