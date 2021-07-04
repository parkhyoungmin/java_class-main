package _01review;

import java.util.Scanner;

public class review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아무거나 입력해보세요 > ");
		String word = sc.next();
		
		System.out.println(word);
		
		char a = word.charAt(0);
		System.out.println(a);
	}
	
}
