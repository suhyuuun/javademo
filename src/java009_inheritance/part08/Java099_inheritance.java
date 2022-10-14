package java009_inheritance.part08;

public class Java099_inheritance {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		fe.setWater(10000);
		fe.setSpeed(100);
		fe.setColor("red");
		fe.waterSpread();
		System.out.println(fe.toString());
		
		System.out.println("=======================");
		
		OwnerEngine oe = new OwnerEngine();
		oe.setSeat(8);
		oe.information();
		oe.setSpeed(80);
		oe.setColor("black");
		System.out.println(oe.toString());

	}

}
