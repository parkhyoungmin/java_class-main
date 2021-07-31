package java_01;

enum Gender {MAN, WOMAN}

public class Shose {
	
	public static void main(String[] args) {
		String name;
		int size;
		Type type;
		Gender gender;
		
		name = "나이키";
		size = 270;
		type = Type.WALKING;
		gender = Gender.WOMAN;
		for (Type t : Type.values()) {
			System.out.println(t + " ");
			/*
			WALKING 
			RUNING 
			TRACKING 
			HICKING  
			 */
		}
		System.out.println(type.HICKING.ordinal()); // 3
	}

}
