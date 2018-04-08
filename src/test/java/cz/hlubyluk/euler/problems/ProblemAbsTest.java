package cz.hlubyluk.euler.problems;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public abstract class ProblemAbsTest<P extends Problem> {
	protected P instance;

	protected abstract P getInstance();

	protected abstract Number getResult();

	@Before
	public void setUp() {
		this.instance = this.getInstance();
	}

	@After
	public void tearDown() {
		this.instance = null;
	}

	@Test
	public void solveTest() {
		Assert.assertEquals(this.getResult(), this.instance.solve());
	}
}
