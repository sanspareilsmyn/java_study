package inner_class;

public class Inner_class_1 {
	class InstanceInner{
		int iv = 100;
		// static int cv = 100; // 왜 안 되냐? static 변수 선언할 수 없다! 클래스가 static이 아니잖아.
		final static int CONST = 100; // 얘는 된다. 상수니까.
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 200;
	}
	
	void myMethod() {
		class LocalInner{
			int iv = 300;
			// static int cv = 300; // 에러
			final static int CONST = 300;
		}
	}	

	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}

}
