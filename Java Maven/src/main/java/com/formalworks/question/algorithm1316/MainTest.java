/**
 * FileName : {@link MainTest}.java
 * Created : 2018. 4. 26. 오후 1:41:29
 * Author : jeonghyun.kum
 * Summary :
 * Copyright (C) 2018 Formal Works Inc. All rights reserved.
 * 이 문서의 모든 저작권 및 지적 재산권은 (주)포멀웍스에게 있습니다.
 * 이 문서의 어떠한 부분도 허가 없이 복제 또는 수정 하거나, 전송할 수 없습니다.
 */
package com.formalworks.question.algorithm1316;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

	@Test
	public void test11() {

		Assert.assertTrue(new Main().isGroup("happy"));
	}

	@Test
	public void test18() {

		Assert.assertTrue(new Main().isGroup("new"));
	}

	@Test
	public void test4() {

		Assert.assertTrue(new Main().isGroup("year"));
	}

	@Test
	public void test6() {

		Assert.assertFalse(new Main().isGroup("aba"));
	}

	@Test
	public void test9() {

		Assert.assertFalse(new Main().isGroup("abab"));
	}

	@Test
	public void test10() {

		Assert.assertFalse(new Main().isGroup("abcabc"));
	}

	@Test
	public void test12() {

		Assert.assertTrue(new Main().isGroup("a"));
	}

}
