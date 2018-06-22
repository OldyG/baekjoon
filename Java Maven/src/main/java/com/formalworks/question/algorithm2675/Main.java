/**
 * FileName : {@link Main}.java
 * Created : 2018. 4. 26. 오후 1:22:33
 * Author : jeonghyun.kum
 * Summary :
 * Copyright (C) 2018 Formal Works Inc. All rights reserved.
 * 이 문서의 모든 저작권 및 지적 재산권은 (주)포멀웍스에게 있습니다.
 * 이 문서의 어떠한 부분도 허가 없이 복제 또는 수정 하거나, 전송할 수 없습니다.
 */
package com.formalworks.question.algorithm2675;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		try (InputStreamReader isr = new InputStreamReader(System.in); BufferedReader br = new BufferedReader(isr);) {
			int inputCount = Integer.parseInt(br.readLine());

			try (OutputStreamWriter osw = new OutputStreamWriter(System.out);
					BufferedWriter bw = new BufferedWriter(osw);) {

				for (int i = 0; i < inputCount; i++) {

					StringTokenizer tokenizer = new StringTokenizer(br.readLine());
					int count = Integer.parseInt(tokenizer.nextToken());
					char[] str = tokenizer.nextToken().toCharArray();

					for (char c : str) {
						for (int j = 0; j < count; j++) {
							bw.write(c);
						}
					}
					bw.newLine();
					bw.flush();
				}
			}
		}
	}

}