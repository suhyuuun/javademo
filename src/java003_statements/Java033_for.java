package java003_statements;
/*
 * 반복문에서 특정 위치로 이동(continue)을 하거나 빠져나올 때 (break)
 * 반복문에서 label을 선언하고 호출하면 된다.
 * */
public class Java033_for {

	public static void main(String[] args) {
		move: //label 선언 
			for (int k = 1; k < 5; k++) {
				go: // label 선언
			for (int i = 1; i <= 3; i++) {
				for (int j = 1; j <= 2; j++) {
					//break move; //move라고 이름지어진 반복문을 빠져나옴
					//continue move; //move라고 이름지어진 반복문으로 이동
					//break go;//go라고 이름지어진 반복문을 break
					break;//반복문을 완전히 빠져나옴
				}
				System.out.printf("i=%d\n", i);
			}
			System.out.println("kkk");
		}
		System.out.println("program end");
	}// end main()

}// end class
