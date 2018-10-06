package cz.hlubyluk.euler.solvers;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** Created by HlubyLuk on 18.09.16. */
public class CollatzSequenceSolverTest {

    private CollatzSequenceSolver solver;

    @Test
    public void getCount() throws Exception {
        int count = solver.getCount();

        Assert.assertEquals(8, count);
    }

    @Before
    public void setUp() throws Exception {
        this.solver = new CollatzSequenceSolver(20);
        this.solver.solve();
    }

    @After
    public void tearDown() throws Exception {
        this.solver = null;
    }
}
