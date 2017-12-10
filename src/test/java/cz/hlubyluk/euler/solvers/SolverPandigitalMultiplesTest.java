/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.hlubyluk.euler.solvers;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author HlubyLuk
 */
public abstract class SolverPandigitalMultiplesTest {

    public SolverPandigitalMultiples.SPMEntity solve;

    public abstract int getNumber();

    public abstract boolean isPandigital();

    public abstract boolean isOut();

//    protected abstract long getNum();
    @Before
    public void setUp() {
        this.solve = new SolverPandigitalMultiples(this.getNumber()).solve();
    }

    @After
    public void setDown() {
        this.solve = null;
    }

    @Test
    public void pandigital() {
        System.out.println(this.isPandigital());
        Assert.assertEquals(this.isPandigital(), this.solve.pandigital);
    }

    @Test
    public void out() {
        System.out.println(this.isOut());
        Assert.assertEquals(this.isOut(), this.solve.out);
    }
}
