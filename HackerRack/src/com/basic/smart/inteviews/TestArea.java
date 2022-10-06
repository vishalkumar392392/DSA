package com.basic.smart.inteviews;

public class TestArea {

	public static void main(String[] args) {

		String fulldate = "2022-08-11 22:18:31.0";
		String[] split = fulldate.split(" ");
		String date = split[0];
		String[] split2 = date.split("-");
		String modifiedDate = split2[1] + "/" + split2[2] + "/" + split2[0];
		String time = split[1];
		String[] timeSplit = time.split(":");
		int parseInt = Integer.parseInt(timeSplit[0]);

		String modifiedTime = "";
		if (parseInt > 12) {
			modifiedTime = getHour(parseInt) + ":" + timeSplit[1] + ":" + timeSplit[2] + " PM";
		} else {
			modifiedTime = String.valueOf(parseInt) + ":" + timeSplit[1] + ":" + timeSplit[2] + " AM";
		}
		System.out.println(fulldate);
		System.out.println(modifiedDate + " " + modifiedTime.replace(".0", ""));

	}

	public static String getHour(int hour) {

		int time = hour - 12;

		String modifiedHour = "";

		if (time != 10 && time != 11 && time != 12) {
			modifiedHour = ("0" + time);
		} else {
			modifiedHour = "" + time;
		}

		return modifiedHour;
	}

}
