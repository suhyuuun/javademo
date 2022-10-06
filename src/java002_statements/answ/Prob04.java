package java002_statements.answ;

/* 
[문제] 중첩if를 이용하여 프로그램을 작성하시오
3과목의 점수를 입력받아서 합격이지 불합력인지 출력하시오
3개의 과목이 전부 40이상이어야 하고 평균이 60이어야 "합격" 출력
평균이 60이 넘지만 1개의 과목이라도 40 미만이면 "과락으로 불합격" 출력
평균이 60미만이면 "불합격" 출력

[실행결과1]
국어점수입력 : 75  
영어점수입력 : 80  
수학점수입력 : 100
 합격을 축하합니다.


[실행결과2]
국어점수입력 : 95  
영어점수입력 : 80  
수학점수입력 : 38
과락으로 불합격입니다.

[실행결과3]
국어점수입력 : 32  
영어점수입력 : 40  
수학점수입력 : 22
불합격입니다.
*/
import java.io.*;

class Prob04 {
	public static void main(String[] args) throws IOException {

		int kor = 35;
		int eng = 40;
		int mat = 22;
		int tot = 0;
		double avg;

		System.out.printf("국어점수입력 : %d\n", kor);
		System.out.printf("영어점수입력 : %d\n", eng);
		System.out.printf("수학점수입력 : %d\n", mat);

		tot = kor + eng + mat;
		avg = tot / 3.0;

		// 여기에 구현하시오.

		if (avg >= 60.0) {
			if (!(kor >= 40 && eng >= 40 && mat >= 40)) {
				System.out.println("과락으로 불합격");
			} else {
				System.out.println("합격");
			}
		} else {
			System.out.println("불합격");
		}

	}// end main()
}// end class
