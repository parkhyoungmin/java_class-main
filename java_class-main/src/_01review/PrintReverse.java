package _01review;

import java.util.Scanner;

public class PrintReverse {

	// 3. 문자열 거꾸로 (reverse() 함수쓰지말고!!)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문장 > ");
		String sentence = sc.nextLine();
		
		StringBuilder reverse = new StringBuilder();
		for (int i = sentence.length() - 1; i >= 0; --i) {
			reverse.append(sentence.charAt(i));
		}
		System.out.println(reverse);
	}
	
}