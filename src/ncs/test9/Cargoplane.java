package ncs.test9;

public class Cargoplane extends Plane{

	public Cargoplane() {
		
	}
	
	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	@Override
	public void flight(int distance) {
		System.out.printf("%s          %d\n", getPlanName(),getFuelSize() - distance*5);

	}
}
