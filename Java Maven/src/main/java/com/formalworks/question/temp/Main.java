/**
 * FileName : {@link Main}.java
 * Created : 2018. 4. 18. 오후 1:18:48
 * Author : jeonghyun.kum
 * Summary :
 * Copyright (C) 2018 Formal Works Inc. All rights reserved.
 * 이 문서의 모든 저작권 및 지적 재산권은 (주)포멀웍스에게 있습니다.
 * 이 문서의 어떠한 부분도 허가 없이 복제 또는 수정 하거나, 전송할 수 없습니다.
 */
package com.formalworks.question.temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {

		try (InputStreamReader isr = new InputStreamReader(System.in)) {
			try (BufferedReader reader = new BufferedReader(isr)) {
				int input = Integer.parseInt(reader.readLine());
				Main main = new Main(input);
				int result = main.calculate();
				System.out.println(result);
			}
		}
	}

	private final int valid;

	public Main(int valid) {
		this.valid = valid;
	}

	private int calculate() {

		int ten = this.get10의자리(this.valid);
		int one = this.get1의자리(this.valid);

		return this.calculate2(0, ten, one);
	}

	private int calculate2(int count, int ten, int one) {

		if ((this.valid == ((ten * 10) + one)) && (count != 0)) {
			return count;
		}

		int a = ten + one;
		System.out.println(String.format("%d + %d = %d", ten, one, a));
		int newOne = this.get1의자리(a);

		return this.calculate2(count + 1, one, newOne);
	}

	private int get10의자리(int input) {

		return input / 10;
	}

	private int get1의자리(int input) {

		return input % 10;
	}
}