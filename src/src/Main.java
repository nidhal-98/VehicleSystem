package src;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Car newCar = new Car();
		Truck newTruck = new Truck();
		ElectricVehicle tesla = new ElectricVehicle();

		newCar.start();
		newCar.honk();
		newCar.drive(25);
		System.out.println("Enter Car Engine Type");
		String engineType = sc.next();
		newCar.setEngine(engineType);
		newCar.getEngine();
		newCar.stop();
		
		newTruck.start();
		newTruck.honk();
		newTruck.drive(70);
		newTruck.setEngine("Deisel");
		newTruck.getEngine();
		newTruck.stop();

		tesla.start();
		tesla.charge();
		tesla.drive(90);
		tesla.stop();

	}

}