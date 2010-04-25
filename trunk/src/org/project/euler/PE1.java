package org.project.euler;


/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * <br>
 * <a href="http://projecteuler.net/index.php?section=problems&id=1">Problem 1</a>

 * @author shekhar
 *
 */
public class PE1 {

	
	/**
	 * Calculates the sum of all multiple of an array of numbers below a limit
	 * 
	 * @param limit
	 * @param numbers
	 * @return sum of all multiples
	 */
	public int calculateSum(int limit, int... numbers) {
		StopWatch stopWatch = new StopWatch().start();
		int sum = 0;
		for(int number = 1; number<limit; number++){
			boolean alreadyDivisible = false;
			for(int divisor : numbers){
				if(!alreadyDivisible && isDivisible(divisor, number)){
					sum += number;
					alreadyDivisible = true;
				}
			}
			
		}
		stopWatch.stop().getElapsedTime();
		return sum;
	}

	private boolean isDivisible(int divisor, int number) {
		return number % divisor == 0;
	}

	

}
