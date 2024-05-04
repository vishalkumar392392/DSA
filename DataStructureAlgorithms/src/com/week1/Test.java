package com.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		SongInfo songs = new SongInfo(3);
		songs.addElement("Siya Ram");
		songs.addElement("Priyamuthunam");
		songs.addElement("Urike Urike");
		songs.addElement("Inthandham");
		songs.addElement("Tere Vasthe");


		songs.list.forEach(System.out::println);
		
		String name = "vishal";
		
		char[] charArray = name.toCharArray();
		Arrays.sort(charArray);
		int count[] = new int[200];
		System.out.println((int)name.charAt(0));
		count[name.charAt(0)]++;
		System.out.println(count[118]);
		System.out.println((char)(0+'a'));
	
	}
		

}

class SongInfo {

	int size;
	ArrayList<String> list = null;

	SongInfo(int size) {
		this.size = size;
		this.list = new ArrayList<>(size);
	}

	public void addElement(String record) {
		if (list.size() <= this.size - 1) {
			list.add(record);
		} else {
			list.remove(0);
			list.add(record);
		}
	}

}
