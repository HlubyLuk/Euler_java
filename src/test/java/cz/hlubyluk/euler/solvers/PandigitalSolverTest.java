package cz.hlubyluk.euler.solvers;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by HlubyLuk on 18/10/2016.
 */
public class PandigitalSolverTest {
    private PandigitalSolver solver;

    @Before
    public void setUp() {
        this.solver = new PandigitalSolver(39, 186);
    }

    @Test
    public void getProduct() throws Exception {
        Assert.assertEquals(7254, this.solver.getProduct());
    }

    @Test
    public void isPandigital() throws Exception {
        Assert.assertTrue(this.solver.isPandigital(true));
    }

    @After
    public void tearDown() {
        this.solver = null;
    }
}