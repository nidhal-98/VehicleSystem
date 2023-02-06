package src;

public class Truck extends Vehicle {
	
	int numberOfAxles;
	double capacityInTons;
	
	public static void load(double weight) {
		System.out.println("Loaded: " + weight + " tons");
	}
	
	
}
