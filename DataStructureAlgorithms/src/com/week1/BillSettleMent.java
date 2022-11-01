package com.week1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BillSettleMent {

	public static void main(String[] args) {

//		settle3v2(265, 965, 4040);
		// vishal, balu, venky, manoj
		settle(10, 20, 30, 40, 50);
		System.out.println("=====");

		settle(300, 200, 500, 400, 600);
		System.out.println("=====");

		settle(80, 30, 70, 110, 60);
		System.out.println("=====");


	}

	public static void settle3v2(float vishal, float balu, float venky) {
		float total = (vishal + balu + venky) / 3;

		Map<String, Float> map = new LinkedHashMap<>();
		map.put("Balu", (total - balu));
		map.put("vishal", (total - vishal));
		map.put("venky", (total - venky));

		for (Entry<String, Float> e : map.entrySet()) {
			for (Entry<String, Float> m : map.entrySet()) {

				if (!e.getKey().equals(m.getKey()) && m.getValue() < 0) {
					System.out.println(e.getKey() + " should settle " + e.getValue() + " ₹ to " + m.getKey());
				}
			}
		}
	}

	public static void settle(float balu, float vishal, float venky, float manoj, float sam) {
		Map<String, Float> map = new LinkedHashMap<>();
		float total = (vishal + balu + venky + manoj + sam) / 5;
		map.put("Balu", (total - balu));
		map.put("vishal", (total - vishal));
		map.put("venky", (total - venky));
		map.put("manoj", (total - manoj));
		map.put("sam", (total - sam));
		

		for (Entry<String, Float> h : map.entrySet()) {
			System.out.println(h.getKey() + ": ->" + h.getValue());
		}
		System.out.println("=====");

		for (Entry<String, Float> e : map.entrySet()) {
			for (Entry<String, Float> m : map.entrySet()) {

				if (e.getKey() != m.getKey() && e.getValue() > 0 && m.getValue() < 0) {

					float cal = e.getValue() + m.getValue();
					if (cal > 0.0f) {
						System.out.println(e.getKey() + " should settle " + Math.abs(m.getValue()) + " ₹ to " + m.getKey());
						map.put(e.getKey(), cal);
						map.put(m.getKey(), 0f);
					} else if (cal < 0.0f) {
						System.out.println(e.getKey() + " should settle " + Math.abs(e.getValue()) + " ₹ to " + m.getKey());
						map.put(e.getKey(), 0f);
						map.put(m.getKey(), cal);
					} else if (cal == 0.0f) {
						System.out.println(e.getKey() + " should settle " + e.getValue() + " ₹ to " + m.getKey());
						map.put(e.getKey(), cal);
						map.put(m.getKey(), cal);
					}

				}

			}
		}
	}



}
