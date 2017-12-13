/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.hlubyluk.euler.problems;

/**
 * If p is the perimeter of a right angle triangle with integral length sides, {a,b,c}, there are
 * exactly three solutions for p = 120.
 * <p/>
 * {20,48,52}, {24,45,51}, {30,40,50}
 * <p/>
 * For which value of p ≤ 1000, is the number of solutions maximised?
 * <p/>
 * @author HlubyLuk
 */
public class Problem39 extends Problem {

    private static final int START = 1, STOP = 1000;

    @Override
    public Number solve() {
        int tmp = Integer.MIN_VALUE, triangle = Integer.MIN_VALUE;

        for (int p = START; p <= STOP; p += 1) {
            int count = 0;
            for (int a = 1; a < p; a += 1) {
                for (int b = 1; a + b < p; b += 1) {
                    int c = p - a - b;
                    if (a * a + b * b == c * c) {
                        count += 1;
                    }
                }
            }
//            if (count > 0) {
//                System.out.println(String.format("p=%d, count=%d", p, count));
//            }
            if (tmp < count) {
                tmp = count;
                triangle = p;
            }
        }

        return triangle;
    }

}
