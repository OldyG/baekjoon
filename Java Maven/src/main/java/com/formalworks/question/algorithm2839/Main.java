/**
 * FileName : {@link Main}.java
 * Created : 2018. 4. 26. 오후 1:22:33
 * Author : jeonghyun.kum
 * Summary :
 * Copyright (C) 2018 Formal Works Inc. All rights reserved.
 * 이 문서의 모든 저작권 및 지적 재산권은 (주)포멀웍스에게 있습니다.
 * 이 문서의 어떠한 부분도 허가 없이 복제 또는 수정 하거나, 전송할 수 없습니다.
 */
package com.formalworks.question.algorithm2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		try (InputStreamReader isr = new InputStreamReader(System.in)) {
			try (BufferedReader reader = new BufferedReader(isr)) {
				int input = Integer.parseInt(reader.readLine());
				Main main = new Main();
				int result = main.calculate(input);
				System.out.println(result);
			}
		}
	}

	public int calculate(int kg) {

		int result = 0;

		int current = kg;
		while (true) {

			if ((current % 5) == 0) {
				result += current / 5;
				break;
			}
			current -= 3;
			result++;
			if (current < 0) {
				return -1;
			}

		}
		return result;
	}

}
