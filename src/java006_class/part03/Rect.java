package java006_class.part03;
/*
 * [사각형 도형]
 * 가로   세로   색상   넓이   둘레
 * 5     3    레드   15    16
 * 7     4    블루   28    22
 * 
 * [객체 모델링 과정]
 * 객체의 특징 : 가로, 세로, 색상
 * 객체의 기능 : 넓이를 구한다. 둘레를 구한다.
 * */
public class Rect {
	int width;
	int height;
	String color;
	
	//넓이를 구한다.
	int area() {
		return width*height;
	}
	
	//둘레를 구한다.
	int girth() {
		return (width+height)*2;
	}
	
	void display() {
		System.out.println("가로: " + width);
		System.out.println("세로: " + height);
		System.out.println("색상: " + color);
		System.out.println("넓이: " + area());
		System.out.println("둘레: " + girth());
	}
}
