package java002_statements.answ;

/*
 * 직급에 따른 수령 월급
 * 과장 - 250
 * 대리 - 200
 * 사원 - 150
 * 
 * 초과수당 (시간단위, 소숫점은 버린다) - 
 * 총 20시간 이상은 20
 * 총 10시간 이상 20시간 미만은 10
 * 10시간 미만은 0
 * 
 * 직급구분은 switch~case, 초과수당은 if~else문 사용
 * 
 * 예) 직급이 대리이면 200만원의 월급을 수령한다. 초과근무는 1시간 근무 수행.
 * 
 * [출력 결과]
 * 직급은 대리이며, 이번달 초과근무는 총 13시간을 하셨습니다. 
 * 수령하실 월급은 210만원입니다.
 */

public class Prob06 {

	public static void main(String[] args) {
		String grade = "대리"; // 직급
		int overtime = 13; // 총 초과근무시간
		int money = 0; // 수령 월급

		/////////// 여기에서 구현하세요. /////////

		switch (grade) {
		case "과장":
			money = 250;
			break;
		case "대리":
			money = 200;
			break;
		case "사원":
			money = 150;
		}
		
		
		if (overtime >= 20) {
			money += 20;
		} else if (overtime < 10) {
		} else {
			money += 10;
		}

		//////////////////////////////////////

		System.out.printf("직급은 %s이며, 이번달 초과근무는 총 %d시간을 하셨습니다.\n", grade, overtime);
		System.out.printf("수령하실 월급은 %d만원입니다.\n", money);
	}// end
		// main()

}// end class
