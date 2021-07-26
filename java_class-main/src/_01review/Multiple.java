package _01review;

public class Multiple {
	public static void main(String[] args) {
		int sum = 0;
		for (int j = 1; j <= 100; j++) {
			if(j%3 ==0) {
				sum += j;
			}
		}
		System.out.println("1~100까지 중 3의 배수의 합 = " + sum);
	}
}
