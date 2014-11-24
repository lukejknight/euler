package projecteuler.problems;

import java.util.ArrayList;

/**
 * 
 * @author Luke Knight
 * 
 *         By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we
 *         can see that the 6th prime is 13.
 * 
 *         What is the 10 001st prime number?
 * 
 */

public class Problem7 {

	public static void main(String[] args) {

		ArrayList<Integer> primes = new ArrayList<Integer>();
		int number = 2;
		primes.add(number);

		while (primes.size() < 10001) {
			boolean prime = true;
			number++;
			if (number % 2 != 0) {
				for (int i = 0; i < primes.size(); i++) {
					if (number % primes.get(i) == 0) {
						prime = false;
					}
				}
				if (prime) {
					primes.add(number);
				}
			}
		}

		System.out.println(primes.get(primes.size()-1));

	}

}
