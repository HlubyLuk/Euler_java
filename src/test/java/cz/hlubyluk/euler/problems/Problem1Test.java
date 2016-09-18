package cz.hlubyluk.euler.problems;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by HlubyLuk on 17.09.16.
 */
public class Problem1Test {
    @Test
    public void solve() throws Exception {
        Assert.assertEquals(233168, new Problem1().solve());
    }
}
