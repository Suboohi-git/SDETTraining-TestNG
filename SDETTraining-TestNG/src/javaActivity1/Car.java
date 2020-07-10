package javaActivity1;

public class Car {
	
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	Car(){
		tyres=4;
		doors=4;
	}
	
	public void displayCharacteristics(){
		
		System.out.println("Color of Car is : ");
		System.out.println("Transmission of Car is : ");
		System.out.println("Numbers of tyres is : ");
		System.out.println("Number of doors is : ");
		System.out.println("Year model is : ");
		
	}
	
	public void accelarate() {
		
		System.out.println("Car is moving forward");
		
	}
	
	public void brake() {
		
		System.out.println("Car has stopped");
		
	}

}
