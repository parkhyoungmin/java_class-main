package java_playground.Gugudan;

public class Gugudan02 {

	public static void main(String[] args) {

		int[] result = new int[9];
		for(int i = 0; i < result.length; i++) {
			result[i] = 2 * (i + 1);
		}
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		// 이중for문 사용
		int[] forResult = new int[72];
		int r = 0;
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				forResult[r] = i * j;
				r++;
			}
		}
		
		for(int i = 0; i < forResult.length; i++) {
			System.out.println(forResult[i]);
		}
		
	}

}











