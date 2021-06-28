package java_playground;

import java.util.Scanner;

public class GugudanMain01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("구구단을 입력해주세요 예)6,4");
		String inputValue = scanner.nextLine(); //문자열 입력받음
		
		String[] splitedValue = inputValue.split(","); // ,를 기준으로 문자분리
		
		int first = Integer.parseInt(splitedValue[0]); // 문자 int로 변환
		int second = Integer.parseInt(splitedValue[1]);
		
		for (int i = 2; i <= first; i++) { // 이중 for문으로 구구단
			for (int j = 1; j <= second; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
		}
		
	}
	
}
