package java005_method;
/*
 * [출력결과]
 * java test
 * tset avaj
 * java test
 * */
public class Java064_method {

	public static void main(String[] args) {
		char[]arr = {'j','a','v','a',' ','t','e','s','t'};
		System.out.println(arr);
		System.out.println(reverse(arr));
		System.out.println(arr);
	}//end main()

	//shallow copy : 주소 복사
	//deep copy : 요소 복사
	public static char[] reverse(char[] data) {
		//data의 요소 앞뒤를 바꿔서 리턴하는 프로그램 구현
		char[] arr = new char[data.length];
		for(int i=0;i<data.length;i++) {
			arr[i]=data[data.length-1-i];
		}
		return arr;
	}
}//end class
