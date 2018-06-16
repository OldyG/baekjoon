/**
 * FileName : {@link MainTest}.java
 * Created : 2018. 4. 16. 오후 1:24:53
 * Author : jeonghyun.kum
 * Summary :
 * Copyright (C) 2018 Formal Works Inc. All rights reserved.
 * 이 문서의 모든 저작권 및 지적 재산권은 (주)포멀웍스에게 있습니다.
 * 이 문서의 어떠한 부분도 허가 없이 복제 또는 수정 하거나, 전송할 수 없습니다.
 */
package com.formalworks.question.algorithm9375;

import org.junit.Assert;
import org.junit.Test;

import com.formalworks.question.algorithm9375.Main.M;

public class MainTest {

	@Test
	public void test1() {

		Main main = new Main();

		main.put(new M("headgear", "hat"));
		main.put(new M("eyewear", "sunglasses"));
		main.put(new M("headgear", "turban"));

		Assert.assertEquals(main.run(), 5);
	}

	@Test
	public void test2() {

		Main main = new Main();

		main.put(new M("face", "mask"));
		main.put(new M("face", "sunglasses"));
		main.put(new M("face", "makeup"));

		Assert.assertEquals(main.run(), 3);
	}

}
