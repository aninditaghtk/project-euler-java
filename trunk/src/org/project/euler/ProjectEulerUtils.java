package org.project.euler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		for(long i = 2;i <= number/2;i++){
			if(number % i == 0){
				number = number/i;
				factors.add(i);
			}
		}
		factors.add(number);
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
	 * This method returns all the prime factors for a given number
	 * 
	 * @param number for which we have to find all the prime factors
	 * @return List of all the prime factors
	 */
	public static  List<Integer> findAllPrimeFactorsForANumber(int number){
		List<Integer> factors = new ArrayList<Integer>();
		if(isPrimeNumber(number) == true){
			return factors;
		}
		for(int i = 2;i <= number;i++){
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
	
	/**
	 * This method finds the prime numbers below a given number.
	 * This method uses Sieve of Eratosthenes algortithm. See <a href="http://en.wikipedia.org/wiki/Sieve_of_Eratosthenes">link</a> 
	 * 
	 * @param number
	 * @return List of prime numbers.
	 */
	public static List<Integer> getListOfPrimeNumbersBelowAGivenNumber(int number){
		boolean[] primes = new boolean[number +1];
		for(int i = 1;i<primes.length ;i++){
			primes[i] = true;
		}
		for(int divisor = 2;divisor * divisor< number;divisor++){
			if(primes[divisor] == true){
				for(int i = divisor*2;i<=number; i = i + divisor){
					primes[i] = false;
				}
			}
		}
		List<Integer> primeNumbers = new ArrayList<Integer>();
		for(int i = 2;i<primes.length;i++){
			if(primes[i] == true){
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
	}
	
	/**
	 * Calculates sum of elements of List.
	 * 
	 * @param primeNumbers, a list of prime numbers
	 * @return sum of elements of List
	 */
	public static long calculateSumOfElements(List<Integer> primeNumbers) {
		long sum = 0;
		for(int prime : primeNumbers){
			sum += prime;
		}
		return sum;
	}
	
	/**
	 * Any nonzero natural number n can be factored into primes, written as a product of primes or powers of primes.
	 * This method will return you a map of PrimeNumber and its maximaum power.
	 * For example, consider a number 28, it can be factored to 2^2*7^1
	 * This method will return a map with entries, 2 and 2 and 7 and 1.
	 * 
	 * @param number
	 * @param primeNumbers
	 * @return
	 */
	public static Map<Integer, Integer> findPowerOfPrimeNumber(int number,List<Integer> primeNumbers) {
		Map<Integer, Integer> primeNumberWithPower = new HashMap<Integer, Integer>();
		for(int primeNumber : primeNumbers){
			int power = 1;
			boolean maxPowerReached = false;
			while(maxPowerReached == false){
				if(number % Math.pow(primeNumber, power) == 0){
					power++;
				}else{
					maxPowerReached = true;
				}
			}
			if(maxPowerReached == true){
				power--;
				primeNumberWithPower.put(primeNumber, power);
			}
		}
		return primeNumberWithPower;
	}


	/**
	 * Calculates the number of divisors.
	 * Number of divisors are calculated based on the <a href="http://en.wikipedia.org/wiki/Divisor_function">Divisor Function</a>.
	 * For example, consider a number 28, it can be factored to 2^2*7^1.
	 * So, the number of divisors are calculated as (2+1)*(1+1) = 6.
	 * As you can check also, 28 has 6 factors 1,2,4,7,14,28
	 * 
	 * @param primeNumberWithPower
	 * @return Number of divisors
	 */
	public static int calculateNumberOfDivisors(Map<Integer, Integer> primeNumberWithPower) {
		int numberOfDivisors = 1;
		for(int power : primeNumberWithPower.values()){
			numberOfDivisors *= (power +1); 
		}
		return numberOfDivisors;
	}

	/**
	 * finds which all prime numbers are applicable to a given number out of the given list of prime numbers.
	 * 
	 * @param primeNumbers
	 * @param number
	 * @return List of prime numbers applicable to the number
	 */
	public static List<Integer> findPrimeNumbersApplicableToNumber(List<Integer> primeNumbers, int number) {
		List<Integer> primeNumberForTriangleNumber = new ArrayList<Integer>();
		for(int primeNumber : primeNumbers){
			if(number % primeNumber == 0){
				primeNumberForTriangleNumber.add(primeNumber);
			}
		}
		return primeNumberForTriangleNumber;
	}
	
	public static long getLargestCollatzNumber(long startNumber,long endNumber) {
		long largestChainElement = 0;
		long largestChainSize = 0;
		for(long i = startNumber; i<=endNumber;i++){
			long number = i;
			long count = 1;
			while(number != 1){
				count++;
				if(number%2 == 0){
					number = number/2;
				}else{
					number = 3*number +1;
				}
			}
			if(largestChainSize < count){
				largestChainElement = i;
				largestChainSize = count;
			}
		}
		return largestChainElement;
	}
	
	public static int getSumOfDigitsOfNumber(String number) {
		char[] charArray = number.toCharArray();
		int sum = 0;
		for(char ch : charArray){
			sum += Integer.parseInt(String.valueOf(ch));
		}
		return sum;
	}

}
