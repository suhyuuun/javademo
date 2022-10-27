package ncs.answ.test09;

public class Cargoplane extends Plane{
	public Cargoplane(){}
	
	public Cargoplane(String planeName, int fuelSize){
		super(planeName, fuelSize);
	}
	
	public void flight(int distance){
		super.fuelSize -= distance*5;
		System.out.println(super.fuelSize);
	}
}
	
