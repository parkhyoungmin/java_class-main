package java_renew_inflearn;

public class InterfaceClass implements InterfaceA, InterfaceB {

	public InterfaceClass() {
		System.out.println("InterfaceClass()");
	}
	
	@Override
	public void funA() {
		System.out.println("funA()");
	}

	@Override
	public void funB() {
		System.out.println("funB()");
	}

}
