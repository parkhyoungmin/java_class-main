package doIt.ch06.singleton;

public class Company {

	private static Company instance = new Company(); // 유일하게 사용될 인스턴스, 함부로 값을 바꿀수 x
	
	private Company() {};
	
	// 가져다 쓰기 위해 메서드 생성
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
