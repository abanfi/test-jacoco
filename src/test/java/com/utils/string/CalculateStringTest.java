package com.utils.string;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateStringTest {

	@Test
	public void testConcatenate() {
		CalculateStringUtils myUnit = new CalculateStringUtils();

		String result = myUnit.concatenate("one", "two");

		assertEquals("onetwo", result);

	}

}
