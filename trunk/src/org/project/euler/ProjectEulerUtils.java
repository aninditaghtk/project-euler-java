package org.project.euler;

import java.util.ArrayList;
import java.util.List;

/**
 * ProjectEulerUtils is a utility class for solving the Project euler problems.
 * This class contains the utility methods which can be used while solving the Project Euler problems.
 * 
 * @author Shekhar
 *
 */
public class ProjectEulerUtils {
	
	/**
	 * This method returns list of all the factors whether prime or non-prime
	 * 
	 * @param number
	 * @return List of all the factors
	 */
	public static List<Long> findAllFactorsForANumber(long number){
		List<Long> factors = new ArrayList<Long>();
		if(isPrimeNumber(number) == true){
			return factors;
		}
		for(long i = 2;i <= number;i++){
			if(number % i == 0){
				number = number/i;
				factors.add(i);
			}
		}
		return factors;
	}
	
	/**
	 * This method returns all the prime factors for a given number
	 * 
	 * @param number for which we have to find all the prime factors
	 * @return List of all the prime factors
	 */
	public static  List<Long> findAllPrimeFactorsForANumber(long number){
		List<Long> factors = new ArrayList<Long>();
		if(isPrimeNumber(number) == true){
			return factors;
		}
		for(long i = 2;i <= number;i++){
			if(number % i == 0){
				if(isPrimeNumber(i) == true){
					factors.add(i);
				}
				number = number/i;
			}
		}
		return factors;
	}
	
	/**
	 * This method returns the count of PrimeFactors for a number
	 * 
	 * @param number
	 * @return count of prime factors
	 */
	public static int getCountOfPrimeFactorsForANumber(long number){
		return findAllPrimeFactorsForANumber(number).size();
	}
	
	/**
	 * Finds the largest prime factor for a given number.
	 * This method does not uses findAllPrimeFactorsForANumber method becuase in findAllPrimeFactorsForANumber we use {@link List} to hold
	 * all the prime factors for a number. As a result, findAllPrimeFactorsForANumber performance is 1-2 ms lower than this method.
	 * 
	 * @param number --> Number for which we have to find the largest prime factor
	 * @return largest prime factor
	 */
	public static long findLargestPrimeFactorForANumber(long number){
		if(isPrimeNumber(number) == true){
			return 0;
		}
		long largestPrimeFactor = 0;
		for(int i = 2;i<= number;i++){
			while(number % i == 0){
				number = number/i;
				if(isPrimeNumber(i) == true){
					largestPrimeFactor = i;
				}
			}
		}
		return largestPrimeFactor;
	}

	/**
	 * This method finds out whether the given number is prime or not.
	 * 
	 * @param number --> to check whether it is prime or not
	 * @return true if the number is prime, false otherwise
	 */
	public static boolean isPrimeNumber(long number){
		if(number == 1 || number == 2){
			return true;
		}
		for(long i = 2; i*i <= number;i++){
			long remainder = number % i;
			if((remainder == 0)){
				return false;
			}
		}
		return true;
	}
	
	
	public static int findNthPrimeNumber(int n){
		int start = 3;
		int count = 1;
		int prime = 2;
		while(count != n){
			if(isPrimeNumber(start) == true){
				count++;
				prime = start;
			}
			start++;
		}
		return prime;
	}
	
}
