package java009_inheritance.prob.part04;

public class HealthRate extends Health {

	public HealthRate(String name, double height, double weight) {
		super(name, height, weight);
	}

	private double standardHealth() {
		// 표준체중 로직구현을 구현하세요.
		double standard = (height-100)*0.9;
		return standard;
	}

	private String rateCheck() {
		// 비만도를 로직구현을 구현하세요
		double bmi = (weight-standardHealth())/standardHealth()*100;
		String res;
		if( bmi < 10) {
			res = "정상";
		}else if(bmi>=10 && bmi<20) {
			res = "과체중";
		}else {res = "비만";}
		return res;
	}

	// prn()메소드 오버라이딩
	@Override
	public void prn() {
		System.out.printf("%s님의 신장 %.0f , 몸무게 %.0f  %s입니다.\n", name, height, weight, rateCheck());
	}

}// end HealthRate