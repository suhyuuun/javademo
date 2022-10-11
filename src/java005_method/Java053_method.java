package java005_method;

/*
 * [출력결과]
 * 홍길동님은 회원입니다.
 * 3000포인트가 적립되었습니다.
 */
public class Java053_method {

	public static void main(String[] args) {             //1
		member("홍길동",true);                             //2 
		plus(3000);                                      //6
	}//end main                                          //10

	//회원여부
	public static void member(String name, boolean chk) { //3
		if(chk) {//3
			System.out.printf("%s님은 회원입니다.\n",name);    //4
		}else {
			System.out.printf("%s님은 비회원입니다.\n",name);
		}
	}//end member                                         //5
	
	public static void plus(int point) {                  //7
		System.out.printf("%d포인트가 적립되었습니다.\n",point); //8
	}//end plus                                           //9
	
}//end class
