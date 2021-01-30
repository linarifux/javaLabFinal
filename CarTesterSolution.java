/*
Answer Q3
Name: Md Naimul Islam
ID: 2014000000038
*/

class Vehicle{ 
	private String type;
	Vehicle(){
		type = "uninitialized";
	}
	// write your code here
	Vehicle(String type){
		this.type = type;
	}
	public String getType(){
		return type;
	}
}

class Car extends Vehicle {
	int doorCount = 0;
	String carType;
	Car(String carType){
		super(carType);
	}
	Car(int doorCount){
		this.doorCount = doorCount;
	}
	Car(String carType, int doorCount){
		super(carType);
		this.doorCount = doorCount;
	}
	Car(Car a){
		super("Coupe");
		doorCount = a.doorCount;
	}
	Car(){

	}


	public String toString(){
		if ((getType() == "uninitialized") && (doorCount == 0) ) {
			return "This car object's TYPE and DOOR COUNT have not been initialized";
		}else if ((doorCount == 0) && getType() != "uninitialized") {
			return "This car object's DOOR COUNT has not been initialized";
		}
		else if ((doorCount != 0) && getType() == "uninitialized") {
			return "This car object's TYPE has not been initialized";
		}
		else
			return "A " + getType() + " has " + doorCount + " doors";
		
	}
}

public class CarTesterSolution{ 
	public static void main(String [] args){ 
		Car c1 = new Car();
		System.out.println(c1);

		Car c2 = new Car("SUV");
		System.out.println(c2);

		Car c3 = new Car(1);
		System.out.println(c3);

		Car c4 = new Car("Sedan", 4);
		System.out.println(c4);

		Car c5 = new Car("Coupe", 2);
		Car c6 = new Car(c5);
		System.out.println(c6);
	} 
}
