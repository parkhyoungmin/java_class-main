package java_playground.Calendar;

import java.util.Scanner;

public class Prompt {
	
	public int parseDay(String week) {
		if (week == "su") {
			return 0;
		} else if (week == "mo") {
			return 1;
		} else if (week == "tu") {
			return 2;
		} else if (week == "we") {
			return 3;
		} else if (week == "th") {
			return 4;
		} else if (week == "fr") {
			return 5;
		} else if (week == "sa") {
			return 6;
		} else {
			return 0;
		}
	}
	
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar00 cal = new Calendar00();
		
		int month = 1;
		int year = 2021;
		int weekday = 0;
		
		while (true) {
			System.out.println("년도를 입력하세요");
			System.out.println("YEAR> ");
			year = scanner.nextInt();
			if (year == -1) {
				break;
			}
			System.out.println("달을 입력하세요");
			System.out.println("MONTH> ");
			month = scanner.nextInt();
			System.out.println("첫째 날의 요일을 입력하세요");
			System.out.println("WEEKDAY> ");
			String str_weekday = scanner.next();
			weekday = parseDay(str_weekday);
			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue;
			}
			cal.printCalendar(year, month, weekday);
		}
		System.out.println("입력종료");
		scanner.close();
	}

	public static void main(String[] args) {
		//셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}
	
}















