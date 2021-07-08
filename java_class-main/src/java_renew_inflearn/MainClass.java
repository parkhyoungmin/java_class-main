package java_renew_inflearn;

public class MainClass {

	public static void main(String[] args) {
		
//		String str = "JAVA";
		String str = new String("JAVA");
		System.out.println("str : " + str);
		
		str = str + "_JAVA";
		System.out.println("str : " + str);
		
		//StringBuffer
		StringBuffer sf = new StringBuffer("JAVA");
		System.out.println("sf : " + sf);
		sf.append("world"); // 문자열 추가
		System.out.println("sf : " + sf);
		System.out.println("sf.length() : " + sf.length());
		sf.insert(sf.length(), "~~~~"); // 문자열끝에 추가하겠다.
		System.out.println("sf : " + sf);
		
		sf.delete(4, 9); // 4부터 8위치까지 삭제
		System.out.println("sf : " + sf);
		
		StringBuffer sb = new StringBuffer("HelloWorld");
		System.out.println("sb : " + sb);
		
	}

}








