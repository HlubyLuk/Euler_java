/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.hlubyluk.euler.solvers;

import cz.hlubyluk.euler.solvers.SolverPandigitalMultiples.SPMEntity;

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
public class SolverPandigitalMultiples extends SolverBase<SPMEntity> {

    private static final String OK = "123456789";
    private final int start;

    public SolverPandigitalMultiples(int start) {
        this.start = start;
    }

    @Override
    public SPMEntity solve() {
        SPMEntity tmp = new SPMEntity();
        StringBuilder builder = new StringBuilder();
//        for (char item : OK.toCharArray()) {
        for (int i = 1; i < 10 && this.check(builder.toString()); i += 1) {
            builder.append(this.start * i);
            if (this.isPandigital(builder.toString())) {
                tmp = new SPMEntity(Long.valueOf(builder.toString()), i == 1);
                break;
            }
        }
        return tmp;
    }

    public static final class SPMEntity {

        public final boolean pandigital, out;
        public final long number;

        private SPMEntity() {
            this.pandigital = false;
            this.out = false;
            this.number = Integer.MIN_VALUE;
        }

        private SPMEntity(long number, boolean out) {
            this.pandigital = true;
            this.out = out;
            this.number = number;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 67 * hash + (this.pandigital ? 1 : 0);
            hash = 67 * hash + (int) (this.number ^ (this.number >>> 32));
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
            final SPMEntity other = (SPMEntity) obj;
            if (this.pandigital != other.pandigital) {
                return false;
            }
            if (this.number != other.number) {
                return false;
            }
            return true;
        }
        
        

        @Override
        public String toString() {
            return "SPMEntity{" + "pandigital=" + pandigital + ", number=" + number + '}';
        }
    }
}
