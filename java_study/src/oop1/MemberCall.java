package oop1;

class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv; // 에러. 클래스 변수는 인스턴스 변수 호출 못 함.
	static int cv2 = new MemberCall.iv; // 쓸 거면 이렇게 인스턴스를 생성하고 써야 됨.
	
	static void staticMethod1() {
	System.out.println(cv);
//	System.out.println(iv); // 에러. 클래스 메서드에서 인스턴스 변수 호출 못 함.
	MemberCall c = new MemberCall();
	System.out.println(c.iv);
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1(); // 에러. 클래스 메서드는 인스턴스 메서드 호출 못 함.
		MemberCall c = new MemberCall();
		c.instanceMethod1();
	}
	
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}	
}
