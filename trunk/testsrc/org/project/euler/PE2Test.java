package org.project.euler;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PE2Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void test_find_sum_of_all_even_in_fibonacci_till_100(){
		int limit = 100;
		PE2 problem = new PE2(limit);
		int sum = problem.findSumOfEvenFibnoacciTillLimit();
		assertEquals(44, sum);
	}
	
	@Test
	public void test_find_sum_of_all_even_in_fibonacci_till_4000000(){
		int limit = 4000000;
		PE2 problem = new PE2(limit);
		int sum = problem.findSumOfEvenFibnoacciTillLimit();
		assertEquals(4613732, sum);
	}

}
