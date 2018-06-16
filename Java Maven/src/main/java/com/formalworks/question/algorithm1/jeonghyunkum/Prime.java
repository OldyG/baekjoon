/**
 * FileName : {@link Prime}.java
 * Created : 2018. 3. 12. 오전 11:29:48
 * Author : jeonghyun.kum
 * Summary :
 * Copyright (C) 2018 Formal Works Inc. All rights reserved.
 * 이 문서의 모든 저작권 및 지적 재산권은 (주)포멀웍스에게 있습니다.
 * 이 문서의 어떠한 부분도 허가 없이 복제 또는 수정 하거나, 전송할 수 없습니다.
 */
package com.formalworks.question.algorithm1.jeonghyunkum;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Prime {

	/**
	 * {@link Prime} 클래스의 새 인스턴스를 초기화 합니다.
	 *
	 * @author 2018. 3. 12. 오후 1:18:18 jeonghyun.kum
	 */
	public Prime() {
		super();
	}

	private void checkRangeParameter(int startIndex, int endIndex) {

		if (startIndex > endIndex) {
			throw new IllegalArgumentException("첫번째 인자가 두번째 인자보다 큰 수가 들어올 수 없습니다.");
		}

		if (startIndex == endIndex) {
			throw new IllegalArgumentException("두 개의 인자가 동일합니다.");
		}

		if (startIndex <= 0) {
			throw new IllegalArgumentException("0 이하의 숫자를 입력 할 수 없습니다.");
		}

		if ((endIndex - startIndex) <= 1) {
			throw new IllegalArgumentException("두 수의 차는 2이상이어야합니다.");
		}

	}

	public List<Integer> findPrimes(int startIndex, int endIndex) {

		this.checkRangeParameter(startIndex, endIndex);

		List<Integer> result = new ArrayList<>();

		for (int i = startIndex + 1; i < endIndex; i++) {
			if (this.isPrime(i)) {
				result.add(i);
			}
		}

		return result;
	}

	public boolean isPrime(int target) {

		for (int i = 2; (2 * i) < target; i++) {
			if ((target % i) == 0) {
				return false;
			}
		}
		return true;
	}

	public int parseInt(String willInteger) {

		if (StringUtils.isEmpty(willInteger)) {
			throw new IllegalArgumentException("빈 문자열이 입력되었습니다.");
		}

		try {
			return Integer.parseInt(willInteger);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException(willInteger + "는 숫자로 변형 할 수 없습니다.", e);
		}
	}

}
