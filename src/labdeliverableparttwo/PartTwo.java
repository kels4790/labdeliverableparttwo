package labdeliverableparttwo;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.util.Scanner;


public class PartTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);

		int year1, month1, day1, year2, month2, day2;

		//user input prompt for date1

		System.out.print("Enter year of the first date: ");

		year1 = scnr.nextInt();

		System.out.print("Enter month of the first date: ");

		month1 = scnr.nextInt();

		System.out.print("Enter day of the first date: ");

		day1 = scnr.nextInt();

		// input prompt for date2

		System.out.print("Enter year of the second date: ");

		year2 = scnr.nextInt();

		System.out.print("Enter month of the second date: ");

		month2 = scnr.nextInt();

		System.out.print("Enter day of the second date: ");

		day2 = scnr.nextInt();

		// convert to LocalDate 

		LocalDate date1 = LocalDate.of(year1, month1, day1);

		LocalDate date2 = LocalDate.of(year2, month2, day2);

		// calculate and print output

		System.out.print("Number of days differed are ");

		long days = ChronoUnit.DAYS.between(date1, date2);

		if(days < 0)

		days = days*-1;

		//int days = DAYS.between(date1, date2).getDays();

		System.out.println(days);

	}

}
