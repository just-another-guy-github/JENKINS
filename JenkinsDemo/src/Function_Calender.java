
import java.util.Scanner;

public class Function_Calender {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = sc.nextInt();
		System.out.println("Enter the month:");
		int month = sc.nextInt();
		// Given year is a leap year or not

		boolean leap_year = check_leap_year(year);

		int days = daysInMonth(month, leap_year);

		System.out.println("Year: " + year + " Month: " + month + " has " + days + " days.");
		sc.close();
	}

	private static boolean check_leap_year(int year) {
		return ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
	}

	private static int daysInMonth(int month, boolean leap_year) {
		int days = 0;
		if (month == 2) {
			if (leap_year == true)
				days = 29;
			else
				days = 28;
		}
		else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			days = 31;
		else if (month == 4 || month == 6 || month == 9 || month == 11)
			days = 30;
		
		return days;
	}

}


