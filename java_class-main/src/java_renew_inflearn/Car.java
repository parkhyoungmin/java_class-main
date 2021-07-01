package java_renew_inflearn;

public class Car { // ※ 클래스 이름 일반적으로 대문자로 한다.

	public String color; // 멤버 변수(속성)
	
	public Car() {}; // 생성자
	
	public void run() { // 메서드(기능)
		System.out.println("running");
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.run();
	}
	
}
