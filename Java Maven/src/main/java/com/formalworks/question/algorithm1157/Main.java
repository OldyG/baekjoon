/**
 * FileName : {@link Main}.java
 * Created : 2018. 4. 26. 오후 1:22:33
 * Author : jeonghyun.kum
 * Summary :
 * Copyright (C) 2018 Formal Works Inc. All rights reserved.
 * 이 문서의 모든 저작권 및 지적 재산권은 (주)포멀웍스에게 있습니다.
 * 이 문서의 어떠한 부분도 허가 없이 복제 또는 수정 하거나, 전송할 수 없습니다.
 */
package com.formalworks.question.algorithm1157;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		try (InputStreamReader isr = new InputStreamReader(System.in); BufferedReader br = new BufferedReader(isr);) {

			try (OutputStreamWriter osw = new OutputStreamWriter(System.out);
					BufferedWriter bw = new BufferedWriter(osw);) {

				StringTokenizer tokenizer = new StringTokenizer(br.readLine());
				String input = tokenizer.nextToken();

				char result = new Main().calculate(input);

				bw.write(result);
				bw.newLine();
				bw.flush();
			}
		}
	}

	public char calculate(String input) {
		char[] charArray = input.toLowerCase().toCharArray();
		Map<Character, Integer> rr = new HashMap<>();
		for (char c : charArray) {
			Integer integer = rr.getOrDefault(c, 0);
			rr.put(c, integer + 1);
		}

		Entry<Character, Integer> best = null;
		for (Entry<Character, Integer> entry : rr.entrySet()) {
			if (best == null || best.getValue() < entry.getValue()) {
				best = entry;
			}
		}

		if (best == null) {
			return '?';
		}

		for (Entry<Character, Integer> entry : rr.entrySet()) {
			if (best.getKey() != entry.getKey()) {
				if (best.getValue() == entry.getValue()) {
					return '?';
				}
			}
		}

		return Character.toUpperCase(best.getKey());
	}

}