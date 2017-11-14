/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.hlubyluk.euler.solvers;

/**
 *
 * @author HlubyLuk
 */
public class SolverTruncatable extends SolverBase<Boolean> {

    private final int num;

    public SolverTruncatable(int num) {
        this.num = num;
    }

    @Override
    public Boolean solve() {
        String tmp = String.valueOf(this.num);
        for (int i = 0; i < tmp.length(); i += 1) {
            if (!this.isPrime(Integer.valueOf(tmp.substring(i)))) {
                return false;
            }
        }
        for (int i = tmp.length() - 1; i > 0; i -= 1) {
            if (!this.isPrime(Integer.valueOf(tmp.substring(0, i)))) {
                return false;
            }
        }
        return true;
    }
}
