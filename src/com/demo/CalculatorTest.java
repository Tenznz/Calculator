package com.demo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	static Calculator calc;

	@Before
	public void init() {
		System.out.println("Help");
		calc = new Calculator();
	}

//	@BeforeClass
//	public static void init() {
//		System.out.println("Help");
//		calc = new Calculator();
//	}
	@Test // By using this annotation of method convert to JUint test case
//@Test(expected = Exception.class)
	public void test_addtwonumber_should_return_sum() throws Exception {

		int result = calc.add(10, 20);
		int expectedValue = 30;
		Assert.assertEquals(expectedValue, result);
//		throw new Exception();
	}

	@Test
	public void test_multiplytwonumber_should_return_result() {

		int result = calc.multiply(10, 20);
		int expectedValue = 200;
		Assert.assertEquals(expectedValue, result);
	}

	@Test
	public void test_dividetwonumber_should_return_result() {

		int result = calc.divide(20, 10);
		int expectedValue = 2;
		Assert.assertEquals(expectedValue, result);
	}

	@Test
	public void test_subtracttwonumber_should_return_result() {

		int result = calc.sub(20, 10);
		int expectedValue = 10;
		Assert.assertEquals(expectedValue, result);
	}
	@After
	public void endTask() {
		System.out.println("Ending task");
	}
}
