/**
 * FileName : {@link MainTest}.java
 * Created : 2018. 4. 17. 오후 12:05:05
 * Author : jeonghyun.kum
 * Summary :
 * Copyright (C) 2018 Formal Works Inc. All rights reserved.
 * 이 문서의 모든 저작권 및 지적 재산권은 (주)포멀웍스에게 있습니다.
 * 이 문서의 어떠한 부분도 허가 없이 복제 또는 수정 하거나, 전송할 수 없습니다.
 */
package com.formalworks.question.algorithm8979;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

	@Test
	public void test1() {

		Main main = new Main();
		main.input(new int[] { 4, 0, 0, 1 });
		main.input(new int[] { 2, 0, 1, 0 });
		main.input(new int[] { 1, 1, 2, 0 });
		main.input(new int[] { 3, 0, 1, 0 });
		Assert.assertEquals(main.findRank(1), 1);
	}

	@Test
	public void test2() {

		Main main = new Main();
		main.input(new int[] { 1, 1, 2, 0 });
		main.input(new int[] { 2, 0, 1, 0 });
		main.input(new int[] { 4, 0, 0, 1 });
		main.input(new int[] { 3, 0, 1, 0 });
		Assert.assertEquals(main.findRank(2), 2);
	}

	@Test
	public void test3() {

		Main main = new Main();
		main.input(new int[] { 1, 1, 2, 0 });
		main.input(new int[] { 3, 0, 1, 0 });
		main.input(new int[] { 4, 0, 0, 1 });
		main.input(new int[] { 2, 0, 1, 0 });
		Assert.assertEquals(main.findRank(3), 2);
	}

	@Test
	public void test4() {

		Main main = new Main();
		main.input(new int[] { 1, 3, 2, 0 });
		main.input(new int[] { 2, 0, 1, 0 });
		main.input(new int[] { 3, 0, 0, 1 });
		main.input(new int[] { 4, 0, 0, 1 });
		main.input(new int[] { 5, 1, 0, 1 });
		main.input(new int[] { 7, 0, 5, 1 });
		main.input(new int[] { 19, 0, 100, 1 });
		Assert.assertEquals(main.findRank(4), 6);
	}

}
