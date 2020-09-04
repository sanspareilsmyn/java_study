package oop1;

public class primitive_reference2 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(Data d) {
		d.x = 1000;
		System.out.println("Change() : x = " + d.x);
	}
}
