package com.Calculator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit; 
import java.util.Scanner;

public class DateDifferenceClaculator {
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first date (yyyy-MM-dd): ");
		String firstDateInput = scanner.nextLine();
		System.out.print("Enter the second date (yyyy-MM-dd): ");
		String secondDateInput = scanner.nextLine();
		LocalDate firstDate = LocalDate.parse(firstDateInput, DateTimeFormatter.ISO_LOCAL_DATE);
		LocalDate secondDate = LocalDate.parse(secondDateInput, DateTimeFormatter.ISO_LOCAL_DATE);
	    long daysBetween = ChronoUnit.DAYS.between(firstDate, secondDate);
	    System.out.println("Number of days between: " + daysBetween); scanner.close();
	}

}
