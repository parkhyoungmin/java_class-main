package quiz;

import java.util.Arrays;
import java.util.Random;

public class B13_lotto_quiz {

	// 1부터 45사이의 중복없는 랜덤 숫자 6개로 이루어진 배열을 생성해보세요
	
	// ※ 중복이 있으면 다시 뽑기
	// ※ 뽑았던 숫자는 기록해두기
	// ※ 1 ~ 45의 숫자를 무작위로 섞은 뒤 순서대로 6개 뽑기
	
	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] lotto = new int[6];		
		int[] number = new int[45];
		
		for (int i = 0; i < number.length; ++i) {
			number[i] = i + 1;
		}
		
		for (int i = 0 ; i < 5000; ++i) {
			int random_index = ran.nextInt(44) + 1;
			
			int temp = number[0];
			number[0] = number[random_index];
			number[random_index] = temp;			
		}
		
		for (int i = 0; i < 6; ++i) {
			System.out.println(i + "번째 당첨 번호 : " + number[i]);
		}
		
//		int i = 0;
//		
//		while (i != 6) {
//			int random_index = ran.nextInt(45);
//			
//			if (number[random_index] != -1) {
//				lotto[i] = number[random_index];
//				number[random_index] = -1;
//				++i;
//			}
//		}
//		System.out.println("숫자 상태 : " + Arrays.toString(number));
		
//		while (i != 6) {
//			boolean duple = false;
//			lotto[i] = (int)(Math.random() * 45 + 1);
//			
//			// 3까지 뽑았을 때 0, 1, 2와 비교를 해서 
//			// 똑같은 값이 있다면 i를 증가시키지 않는다
//			for (int j = 0; j < i; ++j) {				
//				if (lotto[i] == lotto[j]) {
//					duple = true;
//					break;
//				}				
//			}
//			
//			if (!duple) {
//				++i;
//			} 
//		}
		
//		System.out.println(Arrays.toString(lotto));
	}
}
