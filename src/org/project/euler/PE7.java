package org.project.euler;


/**
 * 	By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
 *  we can see that the 6th prime is 13.
 *  What is the 10001th prime number?
 *  
 *  <a href="http://projecteuler.net/index.php?section=problems&id=7">Problem 7</a>.
 * 
 * @author Shekhar
 *
 */
public class PE7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StopWatch watch = new StopWatch().start();
		int nthPrimeNumber = ProjectEulerUtils.findNthPrimeNumber(10001);
		System.out.println(nthPrimeNumber);
		watch.stop().getElapsedTime();
	}
	
	
	
}
