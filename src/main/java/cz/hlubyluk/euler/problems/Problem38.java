/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.hlubyluk.euler.problems;

import cz.hlubyluk.euler.solvers.SolverPandigitalMultiples;

/**
 * Pandigital multiples Problem 38 Take the number 192 and multiply it by each of 1, 2, and 3:
 * <p/>
 * <code>
 * 192 × 1 = 192<br>
 * 192 × 2 = 384<br>
 * 192 × 3 = 576<br>
 * </code>
 * <p/>
 * By concatenating each product we get the 1 to 9 pandigital, 192384576. We will call 192384576 the
 * concatenated product of 192 and (1,2,3)
 * <p/>
 * The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and 5, giving the
 * pandigital, 918273645, which is the concatenated product of 9 and (1,2,3,4,5).
 * <p/>
 * What is the largest 1 to 9 pandigital 9-digit number that can be formed as the concatenated
 * product of an integer with (1,2, ... , n) where n > 1?
 * <p/>
 * @author HlubyLuk
 */
public class Problem38 extends Problem {

    @Override
    public Number solve() {
        System.out.println(new SolverPandigitalMultiples(192).solve());
        System.out.println(new SolverPandigitalMultiples(9).solve());
        return Integer.MIN_VALUE;
    }


}
