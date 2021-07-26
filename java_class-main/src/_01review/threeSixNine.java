package _01review;

import java.util.Scanner;

public class threeSixNine {

	public static void main(String[] args) {
		/*
		 2. 3,6,9 게임 (3,6,9 들어가면 박수 한번/ 33,66,99 이렇게 2번들어갈때는 박수 두번), 
		 숫자 1~100까지할 때, 총 박수는 몇번 치는가?
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 > ");
		int user = sc.nextInt();
		int clap = 0;
		
		for (int i = 1; i <= user; ++i) {
			String check = "" + i;	
			int len = check.length();
			
			for (int j = 0; j < len; ++j) {
				if (check.charAt(j) == '3' || 
						check.charAt(j) == '6' || 
						check.charAt(j) == '9') {
					++clap;					
				}				
			}
		}		
		System.out.println(clap + "회");
	}

}
