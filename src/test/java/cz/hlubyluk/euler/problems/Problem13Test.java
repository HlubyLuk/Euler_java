package cz.hlubyluk.euler.problems;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

/**
 * Created by HlubyLuk on 17.09.16.
 */
public class Problem13Test {
    @Test
    public void solve() throws Exception {
        Assert.assertEquals(new BigInteger(String.valueOf(5537376230L)), new Problem13().solve());
    }
}
