package java_playground.Calendar;

import java.util.Scanner;

public class Calendar00 {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		} else {
			return MAX_DAYS[month - 1];
		}
	}
	
	public void printCalendar(int year, int month, int weekday) {
		System.out.printf("    <<%4d년%3d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");

		for(int i = 0; i < weekday; i++) {
			
		}
		
		int maxDay = getMaxDaysOfMonth(year, month);
		
		for(int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d",i);
			if(i % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Scanner scanner = new Scanner(System.in);
//		Calendar00 cal = new Calendar00();
//		
//		System.out.println("반복횟수를 입력해주세요.");
//		int repeat = scanner.nextInt();
//		
//		for (int i = 0; i < repeat; i++) {
//			System.out.println("월을 입력해주세요.");
//			int month = scanner.nextInt();
//			System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));
//		}
//		System.out.println("입력종료");
//		scanner.close();
		
		String prompt = "cal> ";
		Calendar00 cal = new Calendar00();
		
		int month = 1;
		
		while (true) {
			System.out.println("달을 입력하세요");
			System.out.println(prompt);
			month = scanner.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue;
			}
		}
		System.out.println("입력종료");
		scanner.close();
		
	}

}













