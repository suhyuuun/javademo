package ncs.answ.test09;

public class PlaneTest {

	public static void main(String[] args) {
		Airplane ap = new Airplane("L747", 1000);
		Cargoplane cp = new Cargoplane("C40", 1000);
		
		System.out.println("Plane \t fuelSize ");
		System.out.println("----------------------------- ");
		System.out.println(ap.getPlaneName() +"\t"+ ap.getFuelSize());
		System.out.println(cp.getPlaneName() + "\t"+ cp.getFuelSize());
		
		
		System.out.println("100 운항");
		System.out.println("Plane \t fuelSize ");
		System.out.println("----------------------------- ");
		System.out.print(ap.getPlaneName()+"\t");
		ap.flight(100);
		System.out.print(cp.getPlaneName()+"\t");
		cp.flight(100);
		
		
		System.out.println("200 주유");
		System.out.println("Plane \t fuelSize ");
		System.out.println("----------------------------- ");
		System.out.print(ap.getPlaneName()+"\t");
		ap.refuel(200);
		System.out.print(cp.getPlaneName()+"\t");
		cp.refuel(200);
	}
}