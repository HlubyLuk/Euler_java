package cz.hlubyluk.euler.problems;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

/**
 * Created by HlubyLuk on 17.09.16.
 */
public class Problem24Test {
    @Test
    public void solve() {
        Assert.assertEquals(new BigInteger(String.valueOf(2783915460L)), new Problem24().solve());
    }
}
