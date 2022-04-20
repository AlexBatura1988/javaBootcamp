package javabootcamp.basic.user_input;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		System.out.println("please enter a num :");
//		int num = scanner.nextInt();
//		String result = (num % 12 == 0) ? "divide by 1,2,3,4 " : "NOT divide by 1,2,3,4";
//		System.out.println(result);

//		System.out.println("Enter first number ");
//		int numToCheck = scanner.nextInt();
//		System.out.println("Enter second number ");
//		int start = scanner.nextInt();
//		System.out.println("Enter third number ");
//		int end = scanner.nextInt();
//
//		if (start > end) {
//			int temp = end;
//			end = start;
//			start = temp;
//		}
//		String res = "";
//		if(numToCheck < start) {
//			res = "Smaller than ";
//		}else if(numToCheck > end){
//			res = "Greather than ";
//		}else {
//			res = " in ";
//		}
//		String finalRes = numToCheck + " is " + res + " the range " + start + " to " + end;
//		System.out.println(finalRes );

		int numberOfDaysInMonth = 0;
		String MonthOfName = "";
		System.out.print("Enter a year: ");
		int year = scanner.nextInt();
		if (year < 0) {
			System.out.println("invalid year");
			return;
		}

		System.out.print("Enter a month number: ");
		int month = scanner.nextInt();
		if (month > 13 || month < 0) {
			System.out.println("invalid month");
			return;
		}

		switch (month) {
		case 1:
			MonthOfName = "January";

			break;
		case 2:
			MonthOfName = "February";

			break;
		case 3:
			MonthOfName = "March";

			break;
		case 4:
			MonthOfName = "April";

			break;
		case 5:
			MonthOfName = "May";

			break;
		case 6:
			MonthOfName = "June";

			break;
		case 7:
			MonthOfName = "July";

			break;
		case 8:
			MonthOfName = "August";

			break;
		case 9:
			MonthOfName = "September";

			break;
		case 10:
			MonthOfName = "October";

			break;
		case 11:
			MonthOfName = "November";

			break;
		case 12:
			MonthOfName = "December";

		}
		switch (month) {
		case 1:
		case 10:
		case 3:
		case 5:
		case 8:
		case 12:

			numberOfDaysInMonth = 31;
			break;
		case 2:

			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				numberOfDaysInMonth = 29;
			} else {
				numberOfDaysInMonth = 28;
			}
			break;

		default:

			numberOfDaysInMonth = 30;
			break;

		}

		System.out.print(MonthOfName + " " + year + " has " + numberOfDaysInMonth + " days\n");
	}

}
