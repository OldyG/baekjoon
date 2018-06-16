/**
 * FileName : {@link MainFail}.java
 * Created : 2018. 4. 9. 오후 12:15:01
 * Author : jeonghyun.kum
 * Summary :
 * Copyright (C) 2018 Formal Works Inc. All rights reserved.
 * 이 문서의 모든 저작권 및 지적 재산권은 (주)포멀웍스에게 있습니다.
 * 이 문서의 어떠한 부분도 허가 없이 복제 또는 수정 하거나, 전송할 수 없습니다.
 */
package com.formalworks.question.algorithm11687.jeonghyunkum;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		Main main = new Main(n);
		System.out.println(main.run11687());
	}

	private final List<BigInteger> factorialCache = new ArrayList<>();

	private final String valid;

	private final String invalid;

	public Main(int n) {

		// if ((n < 1) || (n > 100_000_000)) {
		// throw new IllegalArgumentException("입력 제한 (1 ≤ M ≤ 100,000,000)");
		// }

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < n; i++) {
			builder.append('0');
		}
		this.valid = builder.toString();
		this.invalid = this.valid + '0';
		this.factorialCache.add(BigInteger.ONE);
	}

	private BigInteger factorial(int n) {

		BigInteger last = this.factorialCache.get(n - 2);
		BigInteger multiplied = last.multiply(BigInteger.valueOf(n));
		this.factorialCache.add(multiplied);
		return multiplied;
	}

	private boolean isOk(BigInteger target) {

		String ss = target.toString();

		if (ss.endsWith(this.valid)) {

			if (ss.endsWith(this.invalid)) {
				throw new IllegalArgumentException();
			}
			return true;

		}
		return false;
	}

	public int run11687() {

		return this.runrun(2);
	}

	private int runrun(int i) {

		BigInteger factorial = this.factorial(i);
		try {
			if (this.isOk(factorial)) {
				return i;
			}
		} catch (IllegalArgumentException e) {
			return -1;
		}

		i++;
		return this.runrun(i);
	}

}
