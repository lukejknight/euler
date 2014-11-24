package projecteuler.problems;

/**
 * @author Luke Knight
 */

/*
 * Problem 1:
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of all the
 * multiples of 3 or 5 below 1000.
 */

public class Problem1 {

	public static int sumOfMultiples() {
		int sum = 0;
		// loop pointer from 0 to 999
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				int temp = i;
				// add numbers divisible by 3 or 5
				sum = sum + temp;
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		System.out.println(sumOfMultiples());

	}

}
