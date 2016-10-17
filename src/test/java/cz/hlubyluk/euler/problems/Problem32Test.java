package cz.hlubyluk.euler.problems;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by HlubyLuk on 18/10/2016.
 */
public class Problem32Test {
    @Test
    public void solve() throws Exception {
        Assert.assertEquals(45228, new Problem32().solve());
    }
}