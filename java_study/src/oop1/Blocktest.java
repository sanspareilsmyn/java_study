package oop1;

public class Blocktest {

	static {
		System.out.println("static { }"); // Ŭ���� �ʱ�ȭ ��
	}
	{
		System.out.println("{ }"); // �ν��Ͻ� �ʱ�ȭ ��
	}
	
	public Blocktest() {
		System.out.println("������");
	}
	
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new Blocktest();");
		Blocktest bt = new Blocktest();

		System.out.println("BlockTest bt2 = new Blocktest();");
		Blocktest bt2 = new Blocktest();
	}
}
