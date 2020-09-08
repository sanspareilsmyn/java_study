package exception;

import java.io.*;
import java.util.*;

public class Exception3 {

	public static void main(String[] args) {
		PrintStream ps = null;
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("error.log", true);
			ps = new PrintStream(fos);
			System.setErr(ps); // err의 출력을 화면이 아닌 error.log로 변경한다.
			
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (Exception ae) {
			System.err.println("-----------------");
			System.err.println("예외발생시간 : " + new Date());
			ae.printStackTrace(System.err);
			System.err.println("예외메시지 : " + ae.getMessage());
			System.err.println("-----------------");
		}
		System.out.println(6);	
	}
}
