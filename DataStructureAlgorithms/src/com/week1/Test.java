package com.week1;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		SongInfo songs = new SongInfo(3);
		songs.addElement("Siya Ram");
		songs.addElement("Priyamuthunam");
		songs.addElement("Urike Urike");
		songs.addElement("Inthandham");
		songs.addElement("Tere Vasthe");


		songs.list.forEach(System.out::println);
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
