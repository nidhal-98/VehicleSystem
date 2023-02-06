package src;

public class ElectricVehicle extends Vehicle {

	double batteryCapacity;

	int chargeLevel;

	public void charge() {

		System.out.println("Car is going to charge");

	}

	@Override

	public void drive(double miles) {

		System.out.println("Electric vehicle driven " + miles + " miles");

	}

}