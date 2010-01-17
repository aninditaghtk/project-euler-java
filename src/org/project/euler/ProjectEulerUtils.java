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
	
	/**
	 * Finds the Nth prime number
	 * 
	 * @param n
	 * @return Nth prime number 
	 */
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
	
	/**
	 * Given a string, this routine finds the greatest product of n consecutive number
	 * 
	 * @param number 
	 * @param n no of consecutive number
	 * @return Greatest product of n consecutive number.
	 */
	public static int findGreatestProductOfNConsecutiveNumber(String number,int n) {
		int greatestProduct = 0;
		int length = number.length();
		for(int i = 0;i<length-(n-1);i++){
			String str = number.substring(i, i+n);
			int result = 1;
			for(int j =0;j<str.length();j++){
				int num = Integer.parseInt(String.valueOf(str.charAt(j)));
				result = result*num;
			}
			if(result > greatestProduct){
				greatestProduct = result;
			}
		}
		return greatestProduct;
	}
	
	/**
	 * Finds the Pythagorean Triplets
	 * @param sum
	 * @return array of Pythagorean Triplets
	 */
	public static int[] findPythagoreanTriplets(int sum) {
		int[] triplets = new int[3];
		for(int c = sum;c>0;c--){
			for(int b = c-1;b >0;b--){
				for(int a = b-1;a>0;a--){
					if( ( (a+b+c)== sum) && (a*a + b*b -c*c == 0))  {
						triplets[0] = a;
						triplets[1] = b;
						triplets[2] = c;
					}
				}
			}
		}
		return triplets;
	}
	
	/**
	 * Given an array of pythagorean triplets,this method finds the product of those number.
	 * 
	 * @param triplets, an array of pythagorean triplets
	 * @return product of pythagorean triplets 
	 */ 
	public static int findProductOfPythagoreanTriplet(int[] triplets){
		return triplets[0]*triplets[1]*triplets[2];
	}
}
