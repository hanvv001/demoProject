package com.spring.JunitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void test() {
		Calculator c = new Calculator();
		double res = c.sum(10, 20);
		// 기대값, 결과값, 허용오차(시간도 가능)
		assertEquals(30, res, 0);
	}
}
