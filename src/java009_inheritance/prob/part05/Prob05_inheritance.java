package java009_inheritance.prob.part05;


/*
 *문제
 *[main()메소드와 Book은 수정하지 마세요]
 *SecondHandRate()에서 중고책의 등급을 매기는 로직을 구현하세요. -> Grade()
 *SecondHandRate()에서 등급에 따라 중고책 매입값을 구하는 로직을 구현하세요. -> SecondHandPrice()
 *
 *[출력결과]
 *책이름         작가명        등급        매입가격
 *다정소감        김혼비         최상      13500원
 *지구에서한아뿐        정세랑          상       9100원
 *꼭대기의수줍음        유계영          중       7000원
 *므레모사        김초엽          중       6500원
 *밤의여행자들        윤고은       매입불가          0원
 */
public class Prob05_inheritance {

	public static void main(String[] args) {
		SecondHandRate[]sh = new SecondHandRate[6];	
		sh[0] = new SecondHandRate("다정소감", "김혼비",15000,3,3,3);
		sh[1] = new SecondHandRate("지구에서한아뿐", "정세랑",13000,3,2,1);
		sh[2] = new SecondHandRate("꼭대기의수줍음", "유계영",14000,2,2,1);
		sh[3] = new SecondHandRate("므레모사", "김초엽",13000,2,1,1);
		sh[4] = new SecondHandRate("밤의여행자들", "윤고은",13000,1,1,1);
		
		
		System.out.println("책이름         작가명        등급        매입가격");
		sh[0].display();
		sh[1].display();
		sh[2].display();
		sh[3].display();
		sh[4].display();


	}

}
