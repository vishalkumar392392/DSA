package com.array.problem;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Maptest {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int size = sc.nextInt();
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			list.add(sc.nextInt());
		}

		Map<Integer, Long> collect = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		int qSize = sc.nextInt();

		for (int i = 0; i < qSize; i++) {
			Long res = collect.get(sc.nextInt());
			if(res == null) {
				System.out.println(0);
				bw.write(0 + "\n");
			}else {
				System.out.println(res);
				bw.write(res + "\n");
			}

		}
		bw.flush();

		sc.close();
	}

}
