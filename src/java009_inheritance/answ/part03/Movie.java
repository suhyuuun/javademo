package java009_inheritance.answ.part03;

public class Movie {
	String title; // 영화제목 - 멤버변수
	int director; // 감독점수 - 멤버변수
	int acter; // 배우점수 - 멤버변수

	public Movie(String title, int director, int acter) {
		this.title = title;
		this.director = director;
		this.acter = acter;
	}

	void display() {
		// 여기를 구현하세요.
		int total = director + acter;
		String result = "";
		System.out.printf("영화제목:%s\n", title);
		System.out.printf("감독 : %d, 배우 : %d\n", director, acter);
		System.out.printf("영화총점 :%d\n", total);
		if (total >= 15)
			result = "☆☆☆☆☆";
		else if (total >= 12)
			result = "☆☆☆☆";
		else if (total >= 10)
			result = "☆☆☆";
		else
			result = "☆☆";
		System.out.println("영화평점 : " + result);
	}
}
