package ncs.test5;
/*
 * [실행결과]
 * 자바의 정석, 남궁성, 도우출판, 30000원, 10% 할인
 * 할인된 가격 : 27000원
 * 열혈강의 자바, 구정은, 29000원, 10% 할인
 * 할인된 가격 : 261000원
 * 객체지향 JAVA8, 금영욱, 30000원, 10% 할인
 * 할인된 가격 : 27000원
 */
public class BookArrayTest {

	public static void main(String[] args) {
		Book bArray [] = new Book[3];
		//Book 객체를 3개 생성하여 배열에 넣는다.
		//배열에 있는 객체 정보를 모두 getter로 출력한다. (for문 사용)
		//실행 결과와 같이 계산 출력
		bArray[0] = new Book("자바의 정석","남궁성",30000,"도우출판",0.1);
		bArray[1] = new Book("열혈강의 자바","구정은",29000,"프리렉",0.1);
		bArray[2] = new Book("객체지향 JAVA8","금영욱",30000,"북스홈",0.1);
		
		for(int i = 0;i<bArray.length;i++) {
			System.out.printf("%s, %s, %s, %d원, %.0f%%할인\n할인된 가격 : %.0f원\n",
								bArray[i].getTitle(),bArray[i].getAuthor(),bArray[i].getPublisher(), bArray[i].getPrice(),
								(double)(bArray[i].getDiscountRate())*100,
								bArray[i].getPrice() * (double)(1 - bArray[i].getDiscountRate()));
		}
				
		
		
		
		
		
	}

}
