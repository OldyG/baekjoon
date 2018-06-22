package com.formalworks.question.algorithm2941;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

	Main target = new Main();

	@Test
	public void testCalculate1() {
		Assert.assertEquals(6, target.calculate("ljes=njak"));
	}

	@Test
	public void testCalculate2() {
		Assert.assertEquals(3, target.calculate("ddz=z="));
	}

	@Test
	public void testCalculate3() {
		Assert.assertEquals(3, target.calculate("nljj"));
	}

	@Test
	public void testCalculate4() {
		Assert.assertEquals(2, target.calculate("c=c="));
	}

}
