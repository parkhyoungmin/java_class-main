package java_01;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학번입력: ");
		String num = sc.nextLine();
		String k = "당신의 학번은: " + num;
		System.out.println(k);
		
		Pattern pattern = Pattern.compile("([0-9]{4})");
		Matcher matcher = pattern.matcher(k);
		if (matcher.find()) {
			System.out.println("인증완료");
			System.out.println(matcher.group(1));
		}
	}

}
