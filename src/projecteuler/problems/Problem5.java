package projecteuler.problems;


/**
 * 
 * @author Luke Knight
 * 
 */

/*
 * Problem 5:
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder. What is the smallest positive number that is
 * evenly divisible by all of the numbers from 1 to 20?
 */

public class Problem5 {
	
	private static int smallestNumber(int min, int max) {
	
		int smallest = 0;
		int current = max;
		boolean attempt = true;

		while (smallest == 0) {
			attempt = true;
			for (int i = min; i <= max; i++) {
				if ((current % i) != 0) {
					attempt = false;
				}
			}
			if (attempt) {
				smallest = current;
			} else {
				current++;
			}
		}
		return smallest;
	}

	public static void main(String[] args) {

		// takes some time to compute
		System.out.println(smallestNumber(1, 20));

	}

}
