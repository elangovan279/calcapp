package com.calc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.java.calc;

public class calctest {
	calc calc = null;

	@Before
	public void setup() {
		calc = new calc();
	}

	@Test
	public void add() {
		int a = 12;
		int b = 13;
		int actual = (int) calc.add(a, b);
		int expected = 25;
		Assert.assertEquals(expected, actual);
	}

}
