/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.hlubyluk.euler.problems;

import java.util.TreeSet;

/**
 * Pandigital prime Problem 41
 *
 * <p>We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n
 * exactly once. For example, 2143 is a 4-digit pandigital and is also prime.
 *
 * <p>What is the largest n-digit pandigital prime that exists?
 *
 * @author HlubyLuk
 */
public class Problem41 extends Problem {

    private int mapToInt(int[] x) {
        StringBuilder tmp = new StringBuilder();
        for (int item : x) {
            tmp.append(item);
        }
        return Integer.valueOf(tmp.toString());
    }

    boolean nextPermutation(int[] array) {
        // Find longest non-increasing suffix
        int i = array.length - 1;
        while (i > 0 && array[i - 1] >= array[i]) {
            i--;
        }
        // Now i is the head index of the suffix

        // Are we at the last permutation already?
        if (i <= 0) {
            return false;
        }

        // Let array[i - 1] be the pivot
        // Find rightmost element that exceeds the pivot
        int j = array.length - 1;
        while (array[j] <= array[i - 1]) {
            j--;
        }
        // Now the value array[j] will become the new pivot
        // Assertion: j >= i

        // Swap the pivot with j
        int temp = array[i - 1];
        array[i - 1] = array[j];
        array[j] = temp;

        // Reverse the suffix
        j = array.length - 1;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }

        // Successfully computed the next permutation
        return true;
    }

    @Override
    public Number solve() {
        TreeSet<Integer> tmp = new TreeSet<>();
        int[] x = {};
        for (int i = 1; i < 10; i += 1) {
            x = new int[i];
            for (int j = 1; j <= i; j += 1) {
                x[j - 1] = j;
            }
            while (this.nextPermutation(x)) {
                final int mapToInt = this.mapToInt(x);
                if (this.isPrime(mapToInt)) {
                    tmp.add(mapToInt);
                }
            }
        }
        return tmp.last();
    }
}
