package java_01;

public class MainClass {

	public static void main(String[] args) {
		
		GetterSetter gs = new GetterSetter();
		gs.setAge(1000); //입력오류
		gs.setAge(-10); //음수오류
		gs.setAge(10); //10
		
	}

}








