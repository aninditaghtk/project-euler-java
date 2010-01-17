package org.project.euler;

import java.util.List;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 * 
 * <a href="http://projecteuler.net/index.php?section=problems&id=10">Problem 10</a>
 * 
 * @author Shekhar
 *
 */
public class PE10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StopWatch stopWatch = new StopWatch().start();
		int limit = 2000000;
		List<Integer> primeNumbers = ProjectEulerUtils.getListOfPrimeNumbersBelowAGivenNumber(limit);
		long sum = ProjectEulerUtils.calculateSumOfElements(primeNumbers);
		System.out.println(sum);
		stopWatch.stop().getElapsedTime();
	}

	

}
