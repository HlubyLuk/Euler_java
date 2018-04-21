package cz.hlubyluk.euler.problems;

import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * It was proposed by Christian Goldbach that every odd composite number can be
 * written as the sum of a prime and twice a square.
 * <p/>
 * 9 = 7 + 2×1^2
 * <p/>
 * 15 = 7 + 2×2^2
 * <p/>
 * 21 = 3 + 2×3^2
 * <p/>
 * 25 = 7 + 2×3^2
 * <p/>
 * 27 = 19 + 2×2^2
 * <p/>
 * 33 = 31 + 2×1^2
 * <p/>
 * It turns out that the conjecture was false.
 * <p/>
 * What is the smallest odd composite that cannot be written as the sum of a
 * prime and twice a square?
 * 
 * @author HlubyLuk
 */
public class Problem46 extends Problem {

	@Override
	public Number solve() {
		for (int i = 10; i < 5888; i += 1) {
			if (this.isOK(i)) {
				return i;
			}
		}
		return null;
	}

	private boolean isOK(int n) {
		if (n % 2 == 0 || this.isPrime(n)) {
			return false;
		}
		for (int i = 1; i * i <= n; i += 1) {
			if (this.isPrime(n - i * i * 2)) {
				return false;
			}
		}
		return true;
	}
}
