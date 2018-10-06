/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.hlubyluk.euler.problems;

import org.junit.Assert;
import org.junit.Test;

/** @author HlubyLuk */
public class Problem38Test {
    @Test
    public void run() throws Exception {
        Assert.assertEquals("932718654", String.valueOf(new Problem38().solve()));
    }
}
