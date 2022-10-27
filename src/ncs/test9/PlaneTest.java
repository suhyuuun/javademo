package ncs.test9;

public class PlaneTest {

	public static void main(String[] args) {
		//Airplane과 Cargoplane 객체 생성
		Airplane air = new Airplane("L747", 1000);
		Cargoplane cargo = new Cargoplane("C40", 1000);
		
		
		//생성된 객체의 정보 출력
		System.out.println("Plane \t fuelSize");
		System.out.println("-------------------------");
		System.out.printf("%s \t %d\n",air.getPlaneName(),air.getFuelSize());
		System.out.printf("%s \t %d\n",cargo.getPlaneName(),cargo.getFuelSize());
		
		//Airplane과 Cargoplane 객체에 100씩 운항
		System.out.println("100 운항");
		System.out.println("Plane \t fuelSize");
		System.out.println("-------------------------");
		System.out.print(air.getPlaneName()+"\t");
		air.flight(100);
		System.out.print(cargo.getPlaneName()+"\t");
		cargo.flight(100);
		
		//Airplane과 Cargoplane 객체에 200씩 주유
		System.out.println("200 주유");
		System.out.println("Plane \t fuelSize");
		System.out.println("-------------------------");
		
		//200주유 후 객체 정보 출력
		System.out.print(air.getPlaneName()+"\t");
		air.refuel(200);
		System.out.print(cargo.getPlaneName()+"\t");
		cargo.refuel(200);
	}

}
