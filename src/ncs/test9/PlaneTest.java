package ncs.test9;

public class PlaneTest {

	public static void main(String[] args) {
		//Airplane과 Cargoplane 객체 생성
		Airplane air = new Airplane();
		air.setPlanName("L747");
		air.setFuelSize(1000);
		
		Cargoplane cargo = new Cargoplane();
		cargo.setPlanName("C40");
		cargo.setFuelSize(1000);
		
		//생성된 객체의 정보 출력
		System.out.println("Plane      fuelSize");
		System.out.println("--------------------");
		System.out.printf("%s         %d\n",air.getPlanName(),air.getFuelSize());
		System.out.printf("%s          %d\n",cargo.getPlanName(),cargo.getFuelSize());
		//Airplane과 Cargoplane 객체에 100씩 운항
		System.out.println("100 운항");
		System.out.println("Plane      fuelSize");
		System.out.println("--------------------");
		air.flight(100);
		cargo.flight(100);
		//Airplane과 Cargoplane 객체에 200씩 주유
		System.out.println("200 주유");
		System.out.println("Plane      fuelSize");
		System.out.println("--------------------");
		//200주유 후 객체 정보 출력
		air.refuel(200);
		cargo.refuel(200);
	}

}
