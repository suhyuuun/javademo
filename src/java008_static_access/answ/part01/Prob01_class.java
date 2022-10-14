package java008_static_access.answ.part01;

/*
이름은 이순신이고 개발부에 근무하며 급여는 1500000원 입사성적은 85.75입니다

사원이름 : 진달래
근무부서 : 경리부
받는급여 : 1200000원
입사점수 : 75.34점
*/
public class Prob01_class {
	public static void main(String[] args) {
		Employee  em=new Employee();		
		em.setName("이순신");
		em.setDept("개발부");
		em.setPay(1500000);
		em.setScore(85.75);
		System.out.println(em.toString());
		
		em.setEmployee("진달래","경리부",1200000,75.34);
		System.out.println("사원이름:" + em.getName());
		System.out.println("근무부서:" + em.getDept());
		System.out.println("받는급여:" + em.getPay()+"원");
		System.out.println("입사점수:" + em.getScore()+"점");		
	}
}
