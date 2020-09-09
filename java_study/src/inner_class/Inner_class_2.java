package inner_class;

public class Inner_class_2 {
	class InstanceInner{
		int iv = 100;
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 300;
	}
	
	void myMethod() {
		class LocalInner{
			int iv = 400;
		}
	}
	
	
	public static void main(String[] args) {
		Inner_class_2 oc = new Inner_class_2();
		Inner_class_2.InstanceInner ii = oc.new InstanceInner();
		
		Inner_class_2.StaticInner si = new Inner_class_2.StaticInner();
	}

}
