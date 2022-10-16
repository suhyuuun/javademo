package java009_inheritance.answ.part04;

/*
 문제)
 사람의 신장(H)와 몸무게(W)를 입력받아 비만도(B)를 계산하는 프로그램작성
 표준체중:SW=(H-100)*0.9
 비만도: B(%)=(W-SW)/SW*100

 HealthRate 클래스에 아래 사항을 추가합니다.
 1 표준체중 계산하는 메소드를 정의한다. 
 2 비만도를 계산하는 메소드를 정의한다.
 비만도가 10% 이내이면 정상, 10%이상 20%이면 과체중, 20% 이상은 비만

 
 3 출력결과
 홍길동님의 신장 168 , 몸무게 45  정상입니다.
박둘이님의 신장 168 , 몸무게 90  비만입니다.
 */

class Prob04_inheritance {
	public static void main(String[] args) {

		HealthRate hr = new HealthRate("홍길동", 168, 45);
		hr.prn();
		
		HealthRate hr2 = new HealthRate("박둘이", 168, 90);
		hr2.prn();
	}//end main()
}//end class








