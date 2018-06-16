/**
 * FileName : {@link Main}.java
 * Created : 2018. 4. 16. 오후 1:05:08
 * Author : jeonghyun.kum
 * Summary :
 * Copyright (C) 2018 Formal Works Inc. All rights reserved.
 * 이 문서의 모든 저작권 및 지적 재산권은 (주)포멀웍스에게 있습니다.
 * 이 문서의 어떠한 부분도 허가 없이 복제 또는 수정 하거나, 전송할 수 없습니다.
 */
package com.formalworks.question.algorithm9375;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

	public static class M {

		public String type;

		public String name;

		public M(String type, String name) {

			this.type = type;
			this.name = name;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		try (InputStreamReader isr = new InputStreamReader(System.in)) {
			try (BufferedReader reader = new BufferedReader(isr)) {

				int count = Integer.parseInt(reader.readLine());
				for (int i = 0; i < count; i++) {

					int count2 = Integer.parseInt(reader.readLine());
					Main main = new Main();
					for (int j = 0; j < count2; j++) {
						String readLine = reader.readLine();

						String[] split = readLine.split(" ");
						main.put(new M(split[1], split[0]));

					}
					int result = main.run();
					System.out.println(result);

				}
			}
		}
	}

	private final Map<String, Set<String>> map = new ConcurrentHashMap<>();

	public void put(M m) {

		if (this.map.containsKey(m.type) == false) {
			this.map.put(m.type, new HashSet<>());
		}

		this.map.get(m.type).add(m.name);
	}

	public int run() {

		try {

			int i = 1;
			for (Set<String> set : this.map.values()) {
				i *= set.size() + 1;
			}

			return i - 1;
		} finally {
			this.map.clear();
		}

	}
}
