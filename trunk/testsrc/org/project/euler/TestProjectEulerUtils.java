package org.project.euler;

import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestProjectEulerUtils {
	
	@Test
	public void test_findAllFactorsForANumber(){
		long number = 600851475143l;
		List<Long> factors = ProjectEulerUtils.findAllFactorsForANumber(number);
		assertEquals(4, factors.size());
		
		number = 100; 
		factors = ProjectEulerUtils.findAllFactorsForANumber(number);
		assertEquals(3, factors.size());
	}
	
	@Test
	public void test_findAllPrimeFactorsForANumber(){
		long number = 200560490131l;
		List<Long> factors = ProjectEulerUtils.findAllPrimeFactorsForANumber(number);
		assertEquals(0, factors.size());
		
		number = 100; 
		factors = ProjectEulerUtils.findAllPrimeFactorsForANumber(number);
		assertEquals(2, factors.size());
	}
	
	
	@Test 
	public void test_isPrime(){
		long number = 200560490131l;
		StopWatch stopWatch = new StopWatch().start();
		boolean isPrime = ProjectEulerUtils.isPrimeNumber(number);
		stopWatch.stop().getTimeElapsed();
		assertTrue(isPrime);
		
		number = 1000000000l;
		isPrime = ProjectEulerUtils.isPrimeNumber(number);
		assertFalse(isPrime);
		
	}
	

}
