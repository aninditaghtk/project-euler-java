package org.project.euler;


/**
 * The following iterative sequence is defined for the set of positive longegers:
 * n -> n/2 (n is even)
 *n -> 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:
13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1

It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. 
Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.

 * @author Shekhar
 *
 */
public class PE14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StopWatch stopWatch = new StopWatch().start();
		long startNumber = 2; 
		long endNumber = 1000000; 
		
		long largestChainElement = ProjectEulerUtils.getLargestCollatzNumber(startNumber, endNumber);
		System.out.println("Number with longest chain: "+largestChainElement);
		stopWatch.stop().getElapsedTime();
	}

	
}
