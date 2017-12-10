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
public class SolverPandigitalMultiplesATest extends SolverPandigitalMultiplesTest {

    @Override
    public int getNumber() {
        return 192;
    }

    @Override
    public boolean isPandigital() {
        return true;
    }

    @Override
    public boolean isOut() {
        return false;
    }
}
