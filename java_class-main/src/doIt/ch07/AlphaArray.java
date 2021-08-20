package doIt.ch07;

public class AlphaArray {

	public static void main(String[] args) {
		
		char[][] arr = new char[13][2];
		char a = 'a';
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = a;
				System.out.print(arr[i][j] + " ");
				a++;
			}
			System.out.println();
		}
		
	}
	
}
