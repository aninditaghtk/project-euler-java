package org.project.euler;

import java.math.BigDecimal;

/**
 * 2^(15) = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

	What is the sum of the digits of the number 2^(1000)?

 * @author Shekhar
 *
 */
public class PE16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StopWatch stopWatch = new StopWatch().start();
		BigDecimal bigDecimal = new BigDecimal("2");
		bigDecimal = bigDecimal.pow(1000);
		String number = bigDecimal.toString();
		System.out.println("2^1000 is equal to--> "+number);
		int sum = ProjectEulerUtils.getSumOfDigitsOfNumber(number);
		System.out.println("sum of the digits of the number 2^(1000)--> "+sum);
		stopWatch.stop().getElapsedTime();
	}

	

}
