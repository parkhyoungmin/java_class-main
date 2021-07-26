package _01review;

public class ReverseStar {

	public static void main(String[] args) {
//		1. "*" 출력(역피라미드로 출력)
		int num = 5;
		for (int i = num; i > 0; i--) {
			for (int j = num - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = i * 2 - 1; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
