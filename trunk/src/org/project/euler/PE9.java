package org.project.euler;

import static org.project.euler.ProjectEulerUtils.*;
/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^(2) + b^(2) = c^(2).
 * For example, 3^(2) + 4^(2) = 9 + 16 = 25 = 5^(2).
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 * 
 * <a href="http://projecteuler.net/index.php?section=problems&id=9">Problem 9</a>


 * @author Shekhar
 *
 */
public class PE9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StopWatch stopWatch = new StopWatch().start();
		System.out.println(findProductOfPythagoreanTriplet(findPythagoreanTriplets(1000)));
		stopWatch.stop().getElapsedTime();
	}

	

}
