package cz.hlubyluk.euler.problems;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by HlubyLuk on 17.09.16.
 */
public class Problem12Test {
    @Test
    public void solve() throws Exception {
        Assert.assertEquals(76576500L, new Problem12().solve());
    }
}
