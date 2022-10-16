package java009_inheritance.answ.part03;

/*
 * 
 * Movie클래스를 상속받아 MovieWork클래스를 구현하세요.
 * MovieWork클래스에서 display( )메소드를 오버라이딩해서
 * 아래와 같이 구현하세요.
 * [출력결과]
 * 영화제목:추격자
* 감독 : 7, 배우 : 5
* 영화총점 :12
* 영화평점 : ☆☆☆☆
* ***********************************
* 영화제목:사도세자
* 감독:9, 배우:10, 작품성:10, 대중성:8, 대본:9
* 영화총점 : 46
* 영화평점 : ☆☆☆☆☆
 */

public class Prob03_inheritance {

	public static void main(String[] args) {
		Movie mv=new Movie("추격자",7,5);
		mv.display();
		
		System.out.println("***********************************");
		
		// 매개변수 4개인 생성자로 객체 생성
		MovieWork mk = new MovieWork("사도세자", 9, 10, 10,8,9);
		mk.display();
	}

}
