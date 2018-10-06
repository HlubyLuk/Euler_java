package cz.hlubyluk.euler.problems;

/**
 * Digit cancelling fractions Problem 33
 *
 * <p>The fraction 49/98 is a curious fraction, as an inexperienced mathematician in attempting to
 * simplify it may incorrectly believe that 49/98 = 4/8, which is correct, is obtained by cancelling
 * the 9s.
 *
 * <p>We shall consider fractions like, 30/50 = 3/5, to be trivial examples.
 *
 * <p>There are exactly four non-trivial examples of this type of fraction, less than one in value,
 * and containing two digits in the numerator and denominator.
 *
 * <p>If the product of these four fractions is given in its lowest common terms, find the value of
 * the denominator.
 *
 * <p>Created by HlubyLuk on 13/11/2016.
 */
public class Problem33 extends Problem {
    @Override
    public Number solve() {
        int denproduct = 1;
        int nomproduct = 1;
        for (int i = 1; i < 10; i++)
            for (int den = 1; den < i; den++)
                for (int nom = 1; nom < den; nom++)
                    if ((nom * 10 + i) * den == nom * (i * 10 + den)) {
                        denproduct *= den;
                        nomproduct *= nom;
                    }
        return denproduct / this.gcd(nomproduct, denproduct);
    }
}
