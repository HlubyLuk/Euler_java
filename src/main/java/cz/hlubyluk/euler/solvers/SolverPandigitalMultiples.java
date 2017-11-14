/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.hlubyluk.euler.solvers;

import cz.hlubyluk.euler.solvers.SolverPandigitalMultiples.ResultPandigitalMultiples;
import java.util.List;
import java.util.logging.Logger;

/**
 * Pandigital multiples Problem 38 Take the number 192 and multiply it by each of 1, 2, and 3:
 * <p/>
 * <code>
 * 192 × 1 = 192<br>
 * 192 × 2 = 384<br>
 * 192 × 3 = 576<br>
 * </code>
 * <p/>
 * @author HlubyLuk
 */
public class SolverPandigitalMultiples extends SolverBase<ResultPandigitalMultiples> {

    private final int num;
    private final boolean digits[] = new boolean[9];

    public SolverPandigitalMultiples(int num) {
        this.num = num;
    }

    @Override
    public ResultPandigitalMultiples solve() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static final class ResultPandigitalMultiples {

        public final boolean pandigital;
        public final int countMultiples, number;

        ResultPandigitalMultiples(boolean pandigital, int countMultiples, List<Integer> products) {
            StringBuilder tmp = new StringBuilder();
            for (int item : products) {
                tmp.append(item);
            }
            this.pandigital = pandigital;
            this.countMultiples = countMultiples;
            this.number = Integer.valueOf(tmp.toString());
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 23 * hash + (this.pandigital ? 1 : 0);
            hash = 23 * hash + this.countMultiples;
            hash = 23 * hash + this.number;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final ResultPandigitalMultiples other = (ResultPandigitalMultiples) obj;
            if (this.pandigital != other.pandigital) {
                return false;
            }
            if (this.countMultiples != other.countMultiples) {
                return false;
            }
            if (this.number != other.number) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            return "ResultPandigitalMultiples{" + "pandigital=" + pandigital + ", countMultiples=" +
                    countMultiples + ", number=" + number + '}';
        }
    }
}
