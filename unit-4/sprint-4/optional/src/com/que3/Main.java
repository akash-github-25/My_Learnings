package com.que3;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		LocalDate addWeek = date.plusWeeks(1);
		LocalDate addMonth = date.plusMonths(1);
		LocalDate addYear=date.plusYears(1);
		LocalDate add10Years=date.plusYears(10);
		System.out.println("Weak Added: "+addWeek);
		System.out.println("Month Added: "+addMonth);
		System.out.println("1 Year Added: "+addYear);
		System.out.println("10 Year Added: "+add10Years);

	}

}
