package org.project.euler;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PE20Test {
	
	private PE20 pe20;
	
	private static final String HUNDRED_FACTORIAL = "93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000";
	
	@Before
	public void setUp() {
		pe20 = new PE20();
	}
	
	@Test
	public void test_find_factorial_for_0(){
		String factorial = pe20.largeFactorial(0);
		assertEquals("1", factorial);
	}
	
	@Test
	public void test_find_factorial_for_1(){
		String factorial = pe20.largeFactorial(1);
		assertEquals("1", factorial);
	}

	@Test
	public void test_find_factorial_for_2(){
		String factorial = pe20.largeFactorial(2);
		assertEquals("2", factorial);
	}
	
	@Test
	public void test_find_factorial_for_5(){
		String factorial = pe20.largeFactorial(5);
		assertEquals("120", factorial);
	}
	
	@Test
	public void test_find_factorial_for_10(){
		String factorial = pe20.largeFactorial(10);
		assertEquals("3628800", factorial);
	}
	
	@Test
	public void test_find_factorial_for_20(){
		String factorial = pe20.largeFactorial(20);
		assertEquals("2432902008176640000", factorial);
	}
	
	@Test
	public void test_find_factorial_for_100(){
		String factorial = pe20.largeFactorial(100);
		
		assertEquals(HUNDRED_FACTORIAL, factorial);
	}
	
	@Test
	public void test_find_sum_of_digits_for_123(){
		int sum = pe20.findSumOfDigits("123");
		assertEquals(6, sum);
	}
	
	
	@Test
	public void test_find_sum_of_digits_for_0123456789(){
		int sum = pe20.findSumOfDigits("0123456789");
		assertEquals(45, sum);
	}
	
	@Test
	public void test_find_sum_of_digits_for_100_factorial(){
		int sum = pe20.findSumOfDigits(HUNDRED_FACTORIAL);
		assertEquals(648, sum);
	}
}
