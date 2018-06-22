package com.formalworks.question.algorithm1157;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

	private Main target = new Main();

	@Test
	public void test1() {
		Assert.assertEquals('?', target.calculate("Mississipi"));
	}

	@Test
	public void test2() {
		Assert.assertEquals('Z', target.calculate("zZa"));
	}

	@Test
	public void test3() {
		Assert.assertEquals('Z', target.calculate("z"));
	}

	@Test
	public void test4() {
		Assert.assertEquals('A', target.calculate("baaa"));
	}

}
