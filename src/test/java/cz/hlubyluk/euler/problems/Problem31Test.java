package cz.hlubyluk.euler.problems;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by HlubyLuk on 12/11/2016.
 */
public class Problem31Test {
    @Test
    public void solve() throws Exception {
        Assert.assertEquals(73682, new Problem31().solve());
    }

}