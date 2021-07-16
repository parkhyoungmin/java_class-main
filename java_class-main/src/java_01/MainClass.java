package java_01;

public class MainClass {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; ++i) {
			System.out.printf("===========================바깥 반복문 %d\n", i);
			for (int j = 0; j < 5; ++j) {
				System.out.printf("--------------------안쪽 반복문 %d-%d\n", i, j);				
				for (int k = 0; k < 2; ++k) {
					System.out.printf("+++++++++제일 안쪽 반복문 %d-%d-%d\n", i, j, k);
				}				
			}			
		}
		
	}

}








