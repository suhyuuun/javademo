package java001_basic;

/*
 * ctrl + Spacebar : 자동완성 
 * ctrl + / : 한 라인 주석 설정 및 해제
 * ctrl + shift + / : 여러라인 주석 설정
 * ctrl + shift + \ : 여러라인 주석 해제
 * ctrl + shift + F : 자동정렬 ( Windows > Preferences > General > Keys > Ctrl + Shift + F를 ctrl + f로 변경)
 * ctrl + f11 : Run
 */
public class Java004_casting {

	public static void main(String[] args) {

		byte bNum = 2; // -128 ~ 127까지
		short sNum = 4;
		int xNum = 5;
		long lNum = 6L; // L은 대소문자 상관없음
		float fNum = 2.5F;// F는 대소문자 상관없음
		double dNum = 7.4;// double로 인식 보통 정수는 int타입 실수는 double타입으로 인식
		char cData = 'a';// 문자는 한개만 사용가능
		boolean eNum = true; // true 또는 false 로만 사용가능

		System.out.println(lNum);
		System.out.println(fNum);

		// 형변환 (casting)
		// 묵시적 형변환 : 작은 데이터 타입을 큰 데이터 타입으로 변활할때 발생
		// 명시적 형변환 : 큰 데이터 타입을 작은 데이터 타입으로 변환할때 발생 (=강제 형변환), 데이터의 손실 가능성 있음ㅋ

		long gNum = 6; // 묵시적 형변환 : int -> long
		System.out.println(gNum);

		float tNum = (float) 2.5; // 명시적 형변환 : double -> float
		System.out.println(tNum);
		
		//데이터 손실이 발생되는 경우
		byte data = (byte)128;//받을 수 있는 값일때 형변환을 해야함
		System.out.println(data);//-128
	}// end main()
}// end class
