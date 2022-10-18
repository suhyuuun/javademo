package java011_casting.answ.part03;
/*
 * [데이타]
 * 이름       부서     구분        급여          수당         근무일         일당
 * 홍길동    영업부   정직원   450000  1000
 * 갑동이    기획부   계약직                                    20     10000
 * 
 * [출력결과]
 * 홍길동  총급여  451000
 * 갑동이  총급여  200000
 * 
 * 위의 [데이타]를 참조하여 [출력결과]가 나오도록 프로그램을 구현하세요.
 */




public class Prob003_binding {
	public static void main(String[] args) {
		Regular rman = new Regular("홍길동", "영업부", "정직원", 450000, 1000);
		display(rman);
		Worker wman = new Worker("갑동이", "기획부", "계약직", 20, 10000);
		display(wman);
				
	}// end main()

	public static void display(Employment emp) {
		System.out.printf("%s 총급여:%d\n", emp.getName(), emp.count());
	}
}// end class
