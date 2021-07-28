package _01review;

import java.util.Scanner;

public class QuizPractice {
	
	/*
	 문제입력
	 1. 사용자로부터 올해의 년도와 태어난 년도를 입력받으면 한국 나이를 계산하여 몇 살인지 알려주는 프로그램을 만들어보세요
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("올해년도 입력 > ");
		int thisYear = sc.nextInt();
		System.out.println("생일년도 입력 > ");
		int birthYear = sc.nextInt();
		
		System.out.println("나이: " + (thisYear - birthYear + 1));
	}
	
}
