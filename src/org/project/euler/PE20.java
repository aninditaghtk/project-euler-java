package org.project.euler;

import java.math.BigInteger;

/**
 * 
 * n! means n (n 1) ... 3 2 1
 * 
 * Find the sum of the digits in the number 100!
 * 
 * 
 * @author shekhar
 * 
 */
public class PE20 {
	
	public static void main(String[] args) {
		StopWatch stopWatch = new StopWatch().start();
		PE20 pe20 = new PE20();
		int sum = pe20.findSumOfDigits(pe20.largeFactorial(100));
		System.out.println("The answer to project euler problem 20 is "+sum);
		stopWatch.stop().getElapsedTime();
		
	}

	public int findSumOfDigits(String number){
		char[] numbers = number.toCharArray();
		int sum = 0;
		for(char ch : numbers){
			sum += Integer.parseInt(String.valueOf(ch));
			 
		}
		return sum;
	}
	public String largeFactorial(int number) {
		BigInteger bigNumber = new BigInteger(String.valueOf(number));
		if(isNumberZero(bigNumber) == true){
			return BigInteger.ONE.toString();
		}
		return bigNumber.multiply(new BigInteger(largeFactorial(bigNumber.subtract(BigInteger.ONE).intValue()))).toString();
	}

	private boolean isNumberZero(BigInteger number) {
		return number.equals(BigInteger.ZERO);
	}

	

}
