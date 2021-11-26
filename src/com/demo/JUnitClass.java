package com.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class JUnitClass {
	@Test
	public void testAssert() {
		String str1 = new String("Ten");
		String str2 = "Ten";
		assertEquals(str1, str2);
		assertSame(str1, str2);
		Object obj1=new Object();
		Object obj2=new Object();
		assertSame(obj1, obj2);
		assertEquals(obj1, obj2);
	}
}
