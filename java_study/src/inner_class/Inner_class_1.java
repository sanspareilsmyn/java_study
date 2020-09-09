package inner_class;

public class Inner_class_1 {
	class InstanceInner{
		int iv = 100;
		// static int cv = 100; // �� �� �ǳ�? static ���� ������ �� ����! Ŭ������ static�� �ƴ��ݾ�.
		final static int CONST = 100; // ��� �ȴ�. ����ϱ�.
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 200;
	}
	
	void myMethod() {
		class LocalInner{
			int iv = 300;
			// static int cv = 300; // ����
			final static int CONST = 300;
		}
	}	

	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}

}
