package ncs.test9;

abstract public class Plane {
	private String planName;
	private int fuelSize;
	
	public Plane() {
		
	}
	
	public Plane(String planeName, int fuelSize) {
		
	}
	
	public void refuel(int fuel) {//주유
		fuelSize = fuelSize + fuel;
		System.out.printf("%s         %d\n",planName, fuelSize);
	}
	
	abstract public void flight(int distance); //운항 

	public String getPlanName() {
		return planName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
		
	
}
