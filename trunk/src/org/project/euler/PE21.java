package org.project.euler;

import java.util.ArrayList;
import java.util.List;

public class PE21 {

	
	public int calculateSumOfAmicableNumbers(int limit) {
		StopWatch stopWatch = new StopWatch().start();
		List<Integer> amicableNumbers = findAmicableNumbers(limit);
		int sum = findSum(amicableNumbers);
		stopWatch.stop().getElapsedTime();
		return sum;
	}
	
	public List<Integer> findAmicableNumbers(int limit) {
		List<Integer> numbers = new ArrayList<Integer>();
		for(int index = 2;index <limit ;index++){
			int firstProbableAmicableNumber = index;
			int secondProbableAmicableNumber = calculateAmicableNumber(firstProbableAmicableNumber);
			if(isAmicablePair(firstProbableAmicableNumber, secondProbableAmicableNumber) == true){
				System.out.println("Numbers are amicable. First Number is "+firstProbableAmicableNumber +" Second Amicable Number is "+secondProbableAmicableNumber);
				numbers.add(index);
			}
		}
		return numbers;
	}

	private boolean isAmicablePair(int firstProbableAmicableNumber,int secondProbableAmicableNumber) {
		if(firstProbableAmicableNumber == secondProbableAmicableNumber){
			return false;
		}
		int amicableNumberOfSeconNumber = calculateAmicableNumber(secondProbableAmicableNumber);
		if(amicableNumberOfSeconNumber == firstProbableAmicableNumber){
			return true;
		}
		return false;
	}

	private int calculateAmicableNumber(int firstProbableAmicableNumber) {
		List<Integer> properDivisors = findProperDivisors(firstProbableAmicableNumber);
		int amicableNumber = findSum(properDivisors);
		return amicableNumber;
	}

	private int findSum(List<Integer> numbers) {
		int sum = 0;
		for(int number : numbers){
			sum += number;
		}
		return sum;
	}

	private List<Integer> findProperDivisors(int firstProbableAmicableNumber) {
		List<Integer> properDivisors = new ArrayList<Integer>();
		for(int divisor = 1; divisor<=firstProbableAmicableNumber/2;divisor++){
			if(isNumberDivisible(firstProbableAmicableNumber, divisor)){
				properDivisors.add(divisor);	
			}
		}
		return properDivisors;
	}

	private boolean isNumberDivisible(int firstProbableAmicableNumber,int divisor) {
		return firstProbableAmicableNumber % divisor == 0;
	}

	
	

}
