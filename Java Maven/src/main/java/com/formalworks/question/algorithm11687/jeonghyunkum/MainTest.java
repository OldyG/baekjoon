/**
 * FileName : {@link MainFailTest}.java
 * Created : 2018. 4. 9. 오후 1:47:50
 * Author : jeonghyun.kum
 * Summary :
 * Copyright (C) 2018 Formal Works Inc. All rights reserved.
 * 이 문서의 모든 저작권 및 지적 재산권은 (주)포멀웍스에게 있습니다.
 * 이 문서의 어떠한 부분도 허가 없이 복제 또는 수정 하거나, 전송할 수 없습니다.
 */
package com.formalworks.question.algorithm11687.jeonghyunkum;

import java.text.MessageFormat;
import java.util.Date;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {

		long before = new Date().getTime();

		for (int i = 1; i < 1000; i++) {

			Main main = new Main(i);
			int result = main.run11687();

			System.out.println(MessageFormat.format("input : {0}, Output : {1}", i, result));
		}
		long after = new Date().getTime();

		long time = after - before;
		System.out.println(time / (double) 1000);
	}

	@Test
	public void test2() {

		Main main = new Main(500);
		int result = main.run11687();

		System.out.println(MessageFormat.format("input : {0}, Output : {1}", 500, result));
	}

}
