package java008_static_access.prob.part04;
/*
[출력]
홍길동의 점수는 258 이며, 평균은 86.0이고 학점은 B입니다

이름:민들래
국어:90
수학:75
영어:88
총점:253
평균:84.33
학점:B
*/
public class Prob04_class {

	public static void main(String[] args) {
		/*Student st = new Student();
		st.setName("홍길동");
		st.setKor(75);
		st.setMat(88);
		st.setEng(95);
		System.out.println(st.toString()); */

	    //인자 4개를 받는 생성자를 통해 객체를 생성한후 민들래,90,75,88를 
	    //대입한후 getter를 이용하여 출력
		/*Student ss = new Student("민들래",90,75,88);
		System.out.println("이름:" + ss.getName());
		System.out.println("국어:" + ss.getKor());
		System.out.println("수학:" + ss.getMat());
		System.out.println("영어:" + ss.getEng());
		System.out.println("총점:" + ss.getTotal());
		System.out.printf("평균: %.2f\n" , ss.getAvg());
		System.out.println("학점:" + ss.getGrade());*/
	}
}
