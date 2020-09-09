package java_lang;

import java.lang.String;
import java.lang.System;

public class Java_lang_1 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println(str1.hashCode()); 
		System.out.println(str2.hashCode()); // String 클래스는 문자열 내용 같으면 해시코드 동일하도록 오버라이딩 되어 있음.
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2)); //하지만 얘는 객체의 주소값으로 해시코드 생성하기 때문에 두 개 값이 달라짐.
	}
}
