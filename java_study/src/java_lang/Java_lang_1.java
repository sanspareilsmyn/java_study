package java_lang;

import java.lang.String;
import java.lang.System;

public class Java_lang_1 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println(str1.hashCode()); 
		System.out.println(str2.hashCode()); // String Ŭ������ ���ڿ� ���� ������ �ؽ��ڵ� �����ϵ��� �������̵� �Ǿ� ����.
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2)); //������ ��� ��ü�� �ּҰ����� �ؽ��ڵ� �����ϱ� ������ �� �� ���� �޶���.
	}
}
