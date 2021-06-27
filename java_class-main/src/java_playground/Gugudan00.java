package java_playground;

import java.util.Scanner;

public class Gugudan00 {

	public static void main(String[] args) {
		
		//2단
		System.out.println("2 * 1");
		System.out.println(2 * 1);
//		...
		
		//3단
		System.out.println("3 * 1");
		System.out.println(3 * 1);
//		...
		
		//4단
		System.out.println("4 * 1");
		int result = 4 * 1;
		System.out.println(result);
		System.out.println("4 * 2");
		result = 4 * 2;
		System.out.println(result);
//		...
		
		//5단
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("5단출력 프로그램(5만입력하기)");
		System.out.println(number * 1);
		System.out.println(number * 2);
//		...
		
		//6단
		int i = 1;
		System.out.println("6단");
		while(i<10) {
			System.out.println(6 * i);
			i++;
		}
		
		//7단
		System.out.println("7단");
		for(int a = 1; a<10; a++) {
			System.out.println(7 * a);
		}
		
	}

}



















