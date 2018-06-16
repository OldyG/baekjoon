/**
 * FileName : {@link MainTest}.java
 * Created : 2018. 4. 26. 오후 1:41:29
 * Author : jeonghyun.kum
 * Summary :
 * Copyright (C) 2018 Formal Works Inc. All rights reserved.
 * 이 문서의 모든 저작권 및 지적 재산권은 (주)포멀웍스에게 있습니다.
 * 이 문서의 어떠한 부분도 허가 없이 복제 또는 수정 하거나, 전송할 수 없습니다.
 */
package com.formalworks.question.algorithm2839;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

	@Test
	public void test11() {

		Assert.assertEquals(new Main().calculate(11), 3);
	}

	@Test
	public void test18() {

		Assert.assertEquals(new Main().calculate(18), 4);
	}

	@Test
	public void test4() {

		Assert.assertEquals(new Main().calculate(4), -1);
	}

	@Test
	public void test6() {

		Assert.assertEquals(new Main().calculate(6), 2);
	}

	@Test
	public void test9() {

		Assert.assertEquals(new Main().calculate(9), 3);
	}

}
