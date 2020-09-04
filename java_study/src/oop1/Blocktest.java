package oop1;

public class Blocktest {

	static {
		System.out.println("static { }"); // 클래스 초기화 블럭
	}
	{
		System.out.println("{ }"); // 인스턴스 초기화 블럭
	}
	
	public Blocktest() {
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new Blocktest();");
		Blocktest bt = new Blocktest();

		System.out.println("BlockTest bt2 = new Blocktest();");
		Blocktest bt2 = new Blocktest();
	}
}
