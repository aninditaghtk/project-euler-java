package org.project.euler;



/**
 * The prime factors of 13195 are 5, 7, 13 and 29.<br>
 * What is the largest prime factor of the number 600851475143 ?
 *  
 * @author Shekhar
 *
 */
public class PE3 {
	
	public static void main(String[] args) {
		StopWatch stopWatch = new StopWatch().start();
		long largestPrimeFactor = ProjectEulerUtils.findLargestPrimeFactorForANumber(600851475143l);
		System.out.println(largestPrimeFactor);
		stopWatch.stop().getTimeElapsed();
	}

	
}
