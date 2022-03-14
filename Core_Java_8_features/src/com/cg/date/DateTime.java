package com.cg.date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class DateTime {
	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println(d);
		LocalDate d1 = LocalDate.of(1999,Month.FEBRUARY,12);
		System.out.println(d1);
		LocalTime t = LocalTime.now();
		System.out.println(t);
		

	}

}
