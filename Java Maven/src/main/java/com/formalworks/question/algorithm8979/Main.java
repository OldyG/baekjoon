/**
 * FileName : {@link Main}.java
 * Created : 2018. 4. 17. 오전 11:24:22
 * Author : jeonghyun.kum
 * Summary :
 * Copyright (C) 2018 Formal Works Inc. All rights reserved.
 * 이 문서의 모든 저작권 및 지적 재산권은 (주)포멀웍스에게 있습니다.
 * 이 문서의 어떠한 부분도 허가 없이 복제 또는 수정 하거나, 전송할 수 없습니다.
 */
package com.formalworks.question.algorithm8979;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	private static List<Integer> convertIntegerList(String readLine, int validSize) {

		String[] split = readLine.split(" ");
		if (split.length != validSize) {
			throw new IllegalArgumentException();
		}

		List<Integer> result = new ArrayList<>();
		for (String string : split) {
			result.add(Integer.parseInt(string));
		}

		return result;
	}

	public static void main(String[] args) throws IOException {

		try (Reader isr = new InputStreamReader(System.in)) {
			try (BufferedReader reader = new BufferedReader(isr)) {
				List<Integer> first = convertIntegerList(reader.readLine(), 2);
				int countryCount = first.get(0);
				int countryNumber = first.get(1);
				first.clear();

				Main main = new Main();
				for (int i = 0; i < countryCount; i++) {
					List<Integer> a = convertIntegerList(reader.readLine(), 4);
					main.input(new int[] { a.get(0), a.get(1), a.get(2), a.get(3) });
					a.clear();
				}

				int result = main.findRank(countryNumber);
				System.out.println(result);
			}
		}
	}

	private final List<int[]> countrys = new LinkedList<>();

	private int findCountryIndex(int rank) {

		for (int[] list : this.countrys) {
			if (list[0] == rank) {
				return this.countrys.indexOf(list);
			}
		}
		throw new IllegalArgumentException();
	}

	public int findRank(int countryNum) {

		int countryIndex = this.findCountryIndex(countryNum);

		int[] countryMedals = this.countrys.get(countryIndex);

		int i = countryIndex;

		for (; i > 0; i--) {
			int[] topCountry = this.countrys.get(i - 1);
			boolean equals = true;
			for (int j = 1; j <= 3; j++) {
				if (countryMedals[j] != topCountry[j]) {
					equals = false;
					break;
				}
			}
			if (equals == false) {
				break;
			}
		}
		return i + 1;
	}

	public void input(int[] newMedals) {

		int index = 0;
		for (int[] medals : this.countrys) {

			boolean find = false;
			for (int i = 1; i < 4; i++) {

				int currentMedal = medals[i];
				int newMedal = newMedals[i];

				if (currentMedal > newMedal) {
					break;
				}

				if (currentMedal < newMedal) {
					find = true;
					break;
				}
			}

			if (find) {
				break;
			}
			index++;
		}
		this.countrys.add(index, newMedals);
	}
}
