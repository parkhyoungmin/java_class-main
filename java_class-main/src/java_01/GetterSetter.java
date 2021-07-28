package java_01;

public class GetterSetter {

	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age < 0) {
			System.out.println("음수오류");
			return;
		}
		if (age > 100) {
			System.out.println("입력오류");
			return;
		}
		this.age = age;
		System.out.println(age);
	}
}
