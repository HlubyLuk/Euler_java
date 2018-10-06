/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.hlubyluk.euler.solvers;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/** @author HlubyLuk */
public class SolverTruncatableTest {

    @Test
    public void ko() {
        Assert.assertFalse(new SolverTruncatable(1111).solve());
    }

    @Test
    public void ok() {
        assertTrue(new SolverTruncatable(3797).solve());
    }
}
