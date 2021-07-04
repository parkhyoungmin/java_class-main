package java_renew_inflearn;

public class ObjectClass {
	
	public int x;
	public int y;
	
	public ObjectClass(int x, int y) {
		this.x = x; // this.x -> ObjectClass로 부터 만들어진 객체(public int x), x -> 생성자로 전달된 지역변수 ObjectClass(int x)
		this.y = y;
	}
	
}
