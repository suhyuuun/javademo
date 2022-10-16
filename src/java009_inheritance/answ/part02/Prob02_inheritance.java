package java009_inheritance.answ.part02;

/*
 * [주의]테스트를 할때 main( )메소드의 주석을 해제하세요.
 * 
  [main메소드와 Human클래스는 수정하지 마세요]
 1 Human 클래스를 상속 받은 StudentExam 클래스를 구현하시오.
 2 3개의 StudentExam 객체를 생성 하여 배열에 셋팅 한 후 각각의 
   객체의 나이, 신장 출력 한다.

 [출력결과]
 name	나이	신장	 몸무게	학번
 홍길동	15	171	 81	   201101
 정길동	13	183	 72	   201102
 박길동	16	175	 65	   201103
 */

public class Prob02_inheritance {
	public static void main(String args[]) {
		//테스트를 할때 아래 주석을 해제하세요.
		
		
		StudentExam se[]=new StudentExam[3];
		se[0]=new StudentExam("홍길동",15,171, 81, "201101");
		se[1]=new StudentExam("정길동",13,183, 72, "201102");
		se[2]=new StudentExam("박길동",16,175, 65, "201103");		
		
		System.out.printf("%4s %5s %8s %8s %8s\n","name","나이","신장","몸무게","학번");
		
		for(StudentExam sm : se)
		System.out.println(sm.toString());
		
	}//end main()
}//end class






