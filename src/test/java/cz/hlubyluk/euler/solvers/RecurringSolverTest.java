package cz.hlubyluk.euler.solvers;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by HlubyLuk on 18.09.16.
 */
public class RecurringSolverTest {

    private RecurringSolver solver;

    @Before
    public void setUp() throws Exception {
        this.solver = new RecurringSolver(1, 3);
        this.solver.solveRecurring();
    }

    @After
    public void tearDown() throws Exception {
        this.solver = null;
    }

    @Test
    public void getRest() throws Exception {
        String rest = solver.getRest();

        Assert.assertEquals("3", rest);
    }

    @Test
    public void getFullNumber() throws Exception {
        String fullNumber = solver.getFullNumber();

        Assert.assertEquals("0.3", fullNumber);
    }

    @Test
    public void getLengthOfRest() throws Exception {
        int lengthOfRest = solver.getLengthOfRest();

        Assert.assertEquals(1, lengthOfRest);
    }

}