package com.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import com.utils.CalculateUtils;

public class CalculateTest {

	CalculateUtils calculation = new CalculateUtils();
	float sum = calculation.sum(2f, 5f);
	float testSum = 7f;

	@Test
	public void testSum() {
		System.out.println("@Test sum(): " + sum + " = " + testSum);
		//assertEquals(sum, testSum);
	}
	
	@Test
	public void testMinus() {
		float minus = calculation.minus(10f, 5f);
		//assertEquals(minus, 5f);
	}
	
	@Test
	public void testCompute() {
		float compute = calculation.compute("*", 5f, 5f);
		//assertEquals(compute, 5f);
	}

}