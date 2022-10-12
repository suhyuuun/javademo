package java006_class.part01;

public class Java065_class {

	public static void main(String[] args) {
		Person ps; //객체참조변수 선언
		ps = new Person(); //객체 생성
		
		ps.name = "홍길동";
		ps.age = 30;
		ps.gender = '남';
		ps.develop();
		ps.run(100);
		System.out.printf("%s %d %c\n", ps.name, ps.age, ps.gender);
		
		Person pn = new Person();
		pn.name = "김영희";
		pn.age = 28;
		pn.gender = '여';
		pn.develop();
		pn.run(200);
		System.out.printf("%s %d %c\n", pn.name, pn.age, pn.gender);
	}
}
