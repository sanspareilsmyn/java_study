package oop1;

public class constructor_this {

	public static void main(String[] args) {

	}

}

class Car {
	String color;
	String gearType;
	int door;
	
	Car(){
		this("White, "Auto", 4);
	}
	
	Car(Car c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}	
	
	Car(String color){
		this(color, "Auto", 4)
	}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}