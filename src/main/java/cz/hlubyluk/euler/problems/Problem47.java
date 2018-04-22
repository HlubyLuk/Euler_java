package cz.hlubyluk.euler.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Distinct primes factors Problem 47
 * <p/>
 * The first two consecutive numbers to have two distinct prime factors are: v
 * 14 = 2 × 7
 * <p/>
 * 15 = 3 × 5
 * <p/>
 * The first three consecutive numbers to have three distinct prime factors are:
 * <p/>
 * 644 = 2² × 7 × 23
 * <p/>
 * 645 = 3 × 5 × 43
 * <p/>
 * 646 = 2 × 17 × 19.
 * <p/>
 * Find the first four consecutive integers to have four distinct prime factors
 * each. What is the first of these numbers?
 * 
 * @author HlubyLuk
 */
public class Problem47 extends Problem {

	@Override
	public Number solve() {
		int tmp = -1;
		for (int i = 2;; i += 1) {
			if (this.count(i) == 4 && this.count(i + 1) == 4 && this.count(i + 2) == 4 &&
					this.count(i + 3) == 4) {
				tmp = i;
				break;
			}
		}
		return tmp;
	}

	private int count(int x) {
		Set<Integer> tmp = new HashSet<>();
		int y = x;
		int z = x % 2 == 0 ? 2 : 3;
		for (int i = 2; i * z <= x; i += 1) {
			while (y % i == 0) {
				y /= i;
				tmp.add(i);
			}
		}
		return tmp.size();
	}
}
