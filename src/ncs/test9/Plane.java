package ncs.test9;

public abstract class Plane {
	protected String planeName;
	protected int fuelSize;
	
	public Plane() {
		super();
	}
	
	public Plane(String planeName, int fuelSize) {
		super();
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	
	public void refuel(int fuel) {//주유
		this.fuelSize += fuel;
		System.out.println(fuelSize);
	}
	
	 public abstract void flight(int distance); //운항 

	public String getPlaneName() {
		return planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
		
	
}
