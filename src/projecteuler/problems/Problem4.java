package projecteuler.problems;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Luke Knight
 */

/*
 * Problem 4:
 * 
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99. Find the largest
 * palindrome made from the product of two 3-digit numbers.
 */

public class Problem4 {

	public static int largestPalindrome() {

		ArrayList<Integer> palindromes = new ArrayList<Integer>();

		int max = 999;
		int min = 100;

		for (int i = max; i >= min; i--) {
			for (int j = max; j >= min; j--) {
				if (isPalindrome(i * j)) {
					palindromes.add(i * j);
				}
			}
			max--;
		}

		Integer[] palindromesArray = new Integer[palindromes.size()];
		palindromes.toArray(palindromesArray);
		Arrays.sort(palindromesArray);
		return palindromesArray[palindromesArray.length - 1];
	}

	public static boolean isPalindrome(Integer input) {
		StringWriter writer = new StringWriter();
		String s = input.toString();
		String output;
		for (int i = s.length() - 1; i >= 0; i--) {
			writer.append(s.charAt(i));
		}
		output = writer.toString();
		return s.equals(output);
	}

	public static void main(String[] args) {

		System.out.println(largestPalindrome());

	}

}
