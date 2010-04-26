package org.project.euler;

public class PE2 {
	
	private int limit;

	public PE2(int limit) {
		this.limit = limit;
	}

	public int findSumOfEvenFibnoacciTillLimit() {
		int firstNumber = 0;
		int secondNumber = 1;
		
		int sum = 0;
		
		while(true){
			int fibonacciNumber = firstNumber + secondNumber;
			if(fibonacciNumber >= limit){
				break;
			}
			System.out.print(fibonacciNumber +" ");
			firstNumber = secondNumber;
			secondNumber = fibonacciNumber;
			if(isEven(fibonacciNumber) == true){
				sum += fibonacciNumber;
			}
			fibonacciNumber = firstNumber + secondNumber;
		}
		
		return sum;
	}

	private boolean isEven(int number) {
		return number % 2 == 0;
	}

}
