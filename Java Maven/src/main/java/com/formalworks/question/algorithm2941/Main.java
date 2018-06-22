/**
 * FileName : {@link Main}.java
 * Created : 2018. 4. 26. 오후 1:22:33
 * Author : jeonghyun.kum
 * Summary :
 * Copyright (C) 2018 Formal Works Inc. All rights reserved.
 * 이 문서의 모든 저작권 및 지적 재산권은 (주)포멀웍스에게 있습니다.
 * 이 문서의 어떠한 부분도 허가 없이 복제 또는 수정 하거나, 전송할 수 없습니다.
 */
package com.formalworks.question.algorithm2941;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		try (InputStreamReader isr = new InputStreamReader(System.in); BufferedReader br = new BufferedReader(isr);) {

			try (OutputStreamWriter osw = new OutputStreamWriter(System.out);
					BufferedWriter bw = new BufferedWriter(osw);) {

				Main main = new Main();
				bw.write(Integer.toString(main.calculate(br.readLine())));
				bw.newLine();
				bw.flush();
			}

		}
	}

	List<String> z = Arrays.asList("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=");

	public int calculate(String str) {

		for (String string : z) {
			str = str.replaceAll(string, "1");
		}

		return str.length();
	}
}