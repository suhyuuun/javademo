package java009_inheritance.prob.part05;

public class SecondHandRate extends Book {
	int cover; // 표지상태
	int paper; // 속지변색
	int scribble; // 낙서유무

	public SecondHandRate(String bookName, String author, int price, int cover, int paper, int scribble) {
		super(bookName, author, price);
		this.cover = cover;
		this.paper = paper;
		this.scribble = scribble;
	}

	public String Grade() {
		// 중고책의 등급을 매기는 로직을 구현하세요
		// 최상: 9점, 상: 6점이상 9점미만 , 중: 4점이상 6점미만, 매입불가: 3점이하
		String grade = " ";
		double sum = cover + paper + scribble;
		if (sum == 9) {
			grade = "최상";
		} else if (sum >= 6 && sum < 9) {
			grade = "상";
		} else if (sum >= 4 && sum < 6) {
			grade = "중";
		} else {
			grade = "매입불가";
		}
		return grade;
	}

	public float SecondHandPrice() {
		// 중고책 값을 구하는 로직을 구현하세요
		// 최상 10%할인 상 30%할인 중 50%할인 매입불가 0원
		float shprice = 0;
		if (Grade() == "최상") {
			shprice = (float) (price * 0.9);
		} else if (Grade() == "상") {
			shprice = (float) (price * 0.7);
		} else if (Grade() == "중") {
			shprice = (float) (price * 0.5);
		} else {
			shprice = 0;
		}
		return shprice;
	}

	// display()메소드 오버라이딩
	@Override
	public void display() {
		System.out.printf("%s %10s %10s %10.0f\n원", bookName, author, Grade(), SecondHandPrice());
	}
}
