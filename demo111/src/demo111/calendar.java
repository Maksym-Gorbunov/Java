package demo111;

import java.util.Scanner;

public class calendar {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Choose month");
		String month = s.nextLine();
		if(month.equals("mars") || month.equals("maj") || month.equals("july") ||
		   month.equals("august") || month.equals("october") || month.equals("december")) {
			System.out.println("31 days");
		} else if(month.equals("april") || month.equals("june") || month.equals("september") || month.equals("november")) {
			System.out.println("30 days");
		}else if(month.equals("february")) {
			System.out.println("Common year?   yes/no");
			if(s.nextLine().equals("yes")) {
				System.out.println("28 days");
			} else {
				System.out.println("29 days");
			}
		} else {
			System.out.println("Wrong input!!!");
		}
	}
}


/*
January - 31 days
February - 28 days in a common year and 29 days in leap years
March - 31 days
April - 30 days
May - 31 days
June - 30 days
July - 31 days
August - 31 days
September - 30 days
October - 31 days
November - 30 days
December - 31 days
*/