package java_playground.Calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT="cal> ";
	
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
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
			cal.printCalendar(2017, month);
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















