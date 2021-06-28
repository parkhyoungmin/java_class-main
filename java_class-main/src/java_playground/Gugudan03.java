package java_playground;

public class Gugudan03 {

	// 구구단 결과 메서드
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for(int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		return result;
	}
	
	// 구구단 결과 메서드
	public static void print(int[] result) {
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}







