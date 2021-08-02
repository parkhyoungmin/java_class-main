package _01review;

import java.util.Scanner;

public class QuizPractice {
	
	/*
	 문제입력
	 
	 */
	
	public static void main(String[] args) {
		substring();
	}
	
	public static void substring() {
		
		String str = "hello";
		boolean ret = str.toUpperCase().equals("HELLO");
		System.out.println(ret);
		str = str.replace('H', 'h');
		System.out.println(str);
		
	}
	
}












