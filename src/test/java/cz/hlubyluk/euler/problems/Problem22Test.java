package cz.hlubyluk.euler.problems;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

/**
 * Created by HlubyLuk on 17.09.16.
 */
public class Problem22Test {
    @Test
    public void solve() {
        Assert.assertEquals(new BigInteger(String.valueOf(871198282)), new Problem22().solve());
    }
}
