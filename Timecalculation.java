package com.time;

public class Timecalculation {
	public static void main(String[]args) {
		System.out.println(Calculation(23,56));
	}
	public static String Calculation(long minutes,long seconds) {
		if(minutes<0 || seconds<0 || seconds>59) {
		return "Invalid value";
	}
		long hours = minutes/60;
		long remMinutes = minutes % 60;
		return hours + "h" + remMinutes + "m" + seconds + "s";
	}

}
