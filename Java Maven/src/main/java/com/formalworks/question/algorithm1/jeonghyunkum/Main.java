/**
 * FileName : {@link MainFail}.java
 * Created : 2018. 3. 12. 오전 11:05:14
 * Author : jeonghyun.kum
 * Summary :
 * Copyright (C) 2018 Formal Works Inc. All rights reserved.
 * 이 문서의 모든 저작권 및 지적 재산권은 (주)포멀웍스에게 있습니다.
 * 이 문서의 어떠한 부분도 허가 없이 복제 또는 수정 하거나, 전송할 수 없습니다.
 */
package com.formalworks.question.algorithm1.jeonghyunkum;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	/**
	 * slf4j Logger
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {

		int argCount = args.length;

		Main main = new Main();
		switch (argCount) {
			case 1:
				main.runR1(args);
				break;
			case 2:
				main.runR2(args);
				break;
			default:
				throw new IllegalArgumentException("잘못된 입력입니다");
		}
	}

	private void runR1(String[] args) {

		Prime prime = new Prime();
		int target = prime.parseInt(args[0]);

		boolean result = prime.isPrime(target);
		LOGGER.info(Boolean.toString(result));
	}

	private void runR2(String[] args) {

		Prime prime = new Prime();

		int startIndex = prime.parseInt(args[0]);
		int endIndex = prime.parseInt(args[1]);

		List<Integer> result = prime.findPrimes(startIndex, endIndex);

		String stringResult = this.toStringForPrint(result);
		LOGGER.info(stringResult);
	}

	private String toStringForPrint(List<Integer> targets) {

		StringBuilder builder = new StringBuilder();

		String delim = "";
		for (int integer : targets) {
			builder.append(delim);
			if ("".equals(delim)) {
				delim = " ";
			}
			builder.append(integer);
		}

		return builder.toString();
	}
}
