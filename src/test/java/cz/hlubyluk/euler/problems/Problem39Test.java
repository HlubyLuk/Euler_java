/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.hlubyluk.euler.problems;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/** @author HlubyLuk */
public class Problem39Test {
    private Problem39 instance;

    @Before
    public void setUp() {
        this.instance = new Problem39();
    }

    @After
    public void tearDown() {
        this.instance = null;
    }

    /** Test of solve method, of class Problem39. */
    @Test
    public void testSolve() {
        assertEquals(840, this.instance.solve());
    }
}
