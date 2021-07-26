package _01review;

public class Seq {
	public static void main(String[] args) {
        int i = 0; 
        int j = 1;
        int sum = 1;
        while (i < 10)
        {
            i = i + 1;
            j = j + i;
            sum = sum + j;
        } 
        System.out.println("총 합 sum : " + sum);
    }
}
