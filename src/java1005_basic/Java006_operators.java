package java1005_basic;
/*
 * 연산자 (operator) : 어떠한 기능을 수행하는 기호( +,-,*,/,%,>,<,>=,<=,==,!= ...)
 * 피연산자 (operand) : 연산자의 작업 대상(변수, 상수, 리터널, 수식...)
 * 
 * 연산자의 종류
 * 1. 산술연산자(이항연산자) : +, -, *, /, %
 * 2. 비교연산자(이항연산자) : >, <, >=, <=, ==, !=
 * 3. 논리연산자(이항연산자) : &&(and) ||(or) |(not)
 * 4. 조건연산자(삼항연산자) : 조건식? 참:거짓
 * 5. 대입연산자(이항연산자) : =, +=, *=, /=, >= ...
 * 6. 증감연산자(단항연산자) : ++(1씩 증가), --(1씩 감소)
 */
public class Java006_operators {

	public static void main(String[] args) {
		int numX = 10;
		int numY = 5;
		
		//int = int + int
		int res = numX + numY;
		System.out.println(res);
		
		double avg = 4.5;
				
		//double = int + double -> 큰 데이터타입을 따름
		double val = numX + avg;
		System.out.println(val);
		
		short a = 3;
		short b = 4;
		
		//int 이하의 데이터타입을 연산하면 int로 리턴한다.
		//Type mismatch: cannot convert from int to short
		//short c = a+b;
		int c = a+b;
		System.out.println(c);//7
		
		/*
		 * int = short + short
		 * int = byte + byte
		 * int = char + char
		 * int = short + byte
		 * int = byte + char
		 * int = int + byte
  		 */
		
		//자바에서 문자를 표현할때 유니코드를 사용한다.
		char data = '0'; //48
		char alpa = 'A'; //65
		int sum = data + alpa;
		System.out.println(sum);//113
		
		}

}
