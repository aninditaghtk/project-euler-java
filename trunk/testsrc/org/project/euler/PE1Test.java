package org.project.euler;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PE1Test {
	
	private PE1 problem;

	@Before
	public void setUp() throws Exception {
		problem = new PE1();
	}

	@After
	public void tearDown() throws Exception {
		problem = null;
	}
	
	@Test
	public void test_sum_of_multiples_of_3_and_5_below_10(){
		int firstNumber = 3;
		int secondNumber = 5;
		int limit = 10;
		
		int sum = problem.calculateSum(limit,firstNumber,secondNumber);
		assertEquals(23, sum);
	}
	
	@Test
	public void test_sum_of_multiples_of_3_and_5_below_1000(){
		int firstNumber = 3;
		int secondNumber = 5;
		int limit = 1000;
		int sum = problem.calculateSum(limit,firstNumber,secondNumber);
		assertEquals(233168, sum);
	}
	
	@Test
	public void test_sum_of_multiples_of_2_3_and_5_below_10(){
		int firstNumber = 2;
		int secondNumber = 3;
		int thirdNumber = 5;
		int limit = 10;
		
		int sum = problem.calculateSum(limit,firstNumber,secondNumber, thirdNumber);
		assertEquals(37, sum);
	}

}
