package cz.hlubyluk.euler.solvers;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by HlubyLuk on 12/11/2016.
 */
public class SolverKnapsackTest {

    private SolverKnapsack solver;

    @Before
    public void setUp() throws Exception {
        this.solver = new SolverKnapsack(200, new int[]{1, 2, 5, 10, 20, 50, 100, 200});
    }

    @After
    public void tearDown() throws Exception {
        this.solver = null;
    }

    @Test
    public void solve() throws Exception {
        Assert.assertEquals(73682, (int) this.solver.solve());
    }
}