package ncs.answ.test05;

public class BookArrayTest {

	public static void main(String[] args) {
		Book bArray[] = new Book[3];
		bArray[0] = new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.1);
		bArray[1] = new Book("열혈강의자바","구정은",29000,"프리렉",0.1);
		bArray[2] = new Book("객체지향 Java8", "금영욱", 30000, "북스홈", 0.1);
	
		for(int i=0; i<bArray.length;i++){
			System.out.printf("%s, %s, %s, %d, %d할인\n",
					bArray[i].getTitle(), bArray[i].getAuthor(),bArray[i].getPublisher() ,
					bArray[i].getPrice(),(int)(bArray[i].getDiscountRate()*100));
			System.out.printf("할인된 가격:%d원\n",(int)(bArray[i].getPrice()*(1-bArray[i].getDiscountRate())));
		}
	}
}
