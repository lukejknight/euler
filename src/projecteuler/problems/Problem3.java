package projecteuler.problems;

import java.util.ArrayList;

/**
 * @author Luke Knight
 */

/*
 * Problem 3:
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
 * factor of the number 600851475143 ?
 */

public class Problem3 {

	public static long largestPrime(long number) {

		long upperBound = 1000000;
		ArrayList<Long> primes = new ArrayList<Long>();
		boolean add = false;

		// loop pointer through numbers
		for (long i = 2; i < upperBound; i++) {
			/*
			 * if number is divisible by the pointer test it's not a multiple of
			 * another prime
			 */
			if (number % i == 0) {
				add = true;
				for (int j = 0; j < primes.size(); j++) {
					/*
					 * if this returns true then j is a multiple of a prime so
					 * don't add.
					 */
					if (i % primes.get(j) == 0) {
						add = false;
					}
				}
				if (add) {
					primes.add(i);
				}
			}
		}
		// return largest prime in the array list
		return primes.get(primes.size() - 1);
	}

	public static void main(String[] args) {

		System.out.println(largestPrime(600851475143L));

	}

}
