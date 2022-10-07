package java003_statements;
/*
 * do{
 * 	 반복 수행 문장;
 * }while(조건식);
 * 
 * do~while문은 ;(세미클론)을 찍어줘야 문장이 끝남
 * 
 * */
public class Java036_do_while {

	public static void main(String[] args) {
		char chk = 'n';
		do {
			System.out.println("주문하시겠습니까?(y/n)");
		}while(chk=='n'); //자바에서는 논리값을 작성해주어야 함
		
	}//end main()

}//end class
