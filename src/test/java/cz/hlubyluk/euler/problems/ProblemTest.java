package cz.hlubyluk.euler.problems;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Set;

/**
 * Created by HlubyLuk on 18.09.16.
 */
public class ProblemTest {

    private ProblemDummyHolder problem;

    @Before
    public void before() {
        this.problem = new ProblemDummyHolder();
    }

    @Test
    public void proofByContradiction() throws Exception {
        boolean b = problem.proofByContradiction(21);

        Assert.assertFalse(b);
    }

    @Test
    public void sieveOfEratosthenes() throws Exception {
        boolean[] sieves = problem.sieveOfEratosthenes(2);
        boolean[] booles = {true, true, false};

        Assert.assertArrayEquals(booles, sieves);
    }

    @Test
    public void primeDividers() throws Exception {
        Set<Integer> dividers = problem.primeDividers(200);
        Integer[] integers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};

        Assert.assertArrayEquals(integers, dividers.toArray(new Integer[dividers.size()]));
    }

    @Test
    public void gcd() throws Exception {
        int gcd = problem.gcd(21, 14);

        Assert.assertEquals(7, gcd);
    }

    @Test
    public void lcm() throws Exception {
        int lcm = problem.lcm(400, 1000);

        Assert.assertEquals(2000, lcm);
    }

    @Test
    public void triangleNumber() throws Exception {
        long triangleNumber = problem.triangleNumber(20);

        Assert.assertEquals(210, triangleNumber);
    }

    @Test
    public void countOfDividers() throws Exception {
        int countOfDividers = problem.countOfDividers(10);

        Assert.assertEquals(4, countOfDividers);
    }

    @Test
    public void binomialCoefficient() throws Exception {
        long coefficient = problem.binomialCoefficient(3, 2);

        Assert.assertEquals(3L, coefficient);
    }

    @Test
    public void factorial() throws Exception {
        BigDecimal factorial = problem.factorial(6);

        Assert.assertEquals(720, factorial.intValue());
    }

    @Test
    public void isAmicable() throws Exception {
        boolean amicable = problem.isAmicable(16);

        Assert.assertFalse(amicable);
    }

    @Test
    public void sumDividers() throws Exception {
        int sumDividers = problem.sumDividers(10);

        Assert.assertEquals(8, sumDividers);
    }

    @Test
    public void isAbundant() throws Exception {
        boolean abundant = problem.isAbundant(10);

        Assert.assertFalse(abundant);
    }

    @Test
    public void nextLexicographicPermutations() throws Exception {
        int[] sequence = {0, 1, 2};
        int[] expected = {0, 2, 1};

        problem.nextLexicographicPermutations(sequence);

        Assert.assertArrayEquals(expected, sequence);
    }

    @Test
    public void digitPowSum() {
        int powSum = problem.digitPowSum(1634, 4);

        Assert.assertEquals(1634, powSum);
    }

    @After
    public void after() {
        this.problem = null;
    }

    private class ProblemDummyHolder extends Problem{
        @Override
        public Number solve() {
            return null;
        }
    }
}