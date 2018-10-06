package cz.hlubyluk.euler.problems;

public class Problem40Test extends ProblemAbsTest<Problem40> {
    //	private Problem40 instnace;
    //
    //	@Before
    //	public void setUp() throws Exception {
    //		this.instnace = new Problem40();
    //	}
    //
    //	@After
    //	public void tearDown() throws Exception {
    //		this.instnace = null;
    //	}
    //
    //	@Test
    //	public void test() {
    //		Assert.assertEquals(210, instnace.solve());
    //	}

    @Override
    protected Problem40 getInstance() {
        return new Problem40();
    }

    @Override
    protected Number getResult() {
        return 210;
    }
}
