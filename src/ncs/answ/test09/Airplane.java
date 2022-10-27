package ncs.answ.test09;

public class Airplane extends Plane{
	
	public Airplane(){}
	
	public Airplane(String planeName, int fuelSize){
		super(planeName, fuelSize);
	}
	
	public void flight(int distance){
		
		super.fuelSize -= distance*3;
		System.out.println(super.fuelSize);
	}	
}
