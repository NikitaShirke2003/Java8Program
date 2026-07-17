package com.csi.jdk8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateTimeAPIEx {
	
	public static void main(String[] args) {
		
		System.out.println("\n JDK 7 Date:"+ new Date());
		System.out.println("\nJDK 8 Local Date:"+ LocalDate.now());
		System.out.println("\nJDK 8 Local Date Time:"+ LocalDateTime.now());
		
		System.out.println(LocalDate.now().plusYears(1).isLeapYear());
		System.out.println(LocalDate.now().plusYears(1).getYear());
		System.out.println(LocalDate.now().getMonth());
		System.out.println(LocalDate.now().getMonthValue());
		System.out.println(LocalDate.now().getDayOfWeek());
		System.out.println(LocalDate.now().getDayOfMonth());
		System.out.println(LocalDateTime.now().getDayOfMonth());
	}

}
