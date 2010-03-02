package org.project.euler;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n
 * which divide evenly into n). If d(a) = b and d(b) = a, where a # b, then a
 * and b are an amicable pair and each of a and b are called amicable numbers.
 * 
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44,
 * 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4,
 * 71 and 142; so d(284) = 220.
 * 
 * Evaluate the sum of all the amicable numbers under 10000.
 * 
 * Problem <a href="http://projecteuler.net/index.php?section=problems&id=21">http://projecteuler.net/index.php?section=problems&id=21</a>
 * 
 * @author shekhar
 * 
 */
public class PE21Test {

	private PE21 pe21;
	@Before
	public void setUp() throws Exception {
		pe21 = new PE21();
	}

	@After
	public void tearDown() throws Exception {
		pe21 = null;
	}
	
	@Test
	public void test_find_amicable_numbers_under_10(){
		int limit = 10;
		List<Integer> amicableNumbers = pe21.findAmicableNumbers(limit);
		assertEquals(0, amicableNumbers.size());
	}
	
	@Test
	public void test_find_amicable_numbers_under_300(){
		int limit = 300;
		List<Integer> amicableNumbers = pe21.findAmicableNumbers(limit);
		assertEquals(2, amicableNumbers.size());
		assertTrue(amicableNumbers.contains(220));
		assertTrue(amicableNumbers.contains(284));
		assertFalse(amicableNumbers.contains(100));
	}
	
	@Test
	public void test_calculate_sum_of_all_amicable_numbers_under_300(){
		int limit = 300;
		int sum = pe21.calculateSumOfAmicableNumbers(limit);
		assertEquals(504, sum);
	}
	
	@Test
	public void test_calculate_sum_of_all_amicable_numbers_under_10000(){
		int limit = 10000;
		int sum = pe21.calculateSumOfAmicableNumbers(limit);
		assertEquals(31626, sum);
	}
}
