package com.demo;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ArithmeticTest {
	private int result = 0;
	private int fNumber = 0, sNumber = 0;

	static Calculator calc;

	public ArithmeticTest(int firstNumber, int secondNumber, int result) {
		super();
		this.fNumber = firstNumber;
		this.sNumber = secondNumber;
		this.result = result;
	}

	@Before
	public void init() {
		calc = new Calculator();
	}

	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] { { 1, 2, 3 }, { 10, 11, 21 }, { 20, 22, 42 } });

	}

	@Test
	public void testArithmeticToNumber() {
		System.out.println("sum of two number is " + result);
		int sum = calc.add(fNumber, sNumber);
		System.out.println(fNumber + "+" + sNumber + "=" + result);
		assertEquals(sum, result);

	}

}
