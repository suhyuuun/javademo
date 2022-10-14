package java009_inheritance.part02;

public class MyChild extends MyFather {
	public MyChild() { //2
		super();  //3 생성자는 가장 먼저 호출되어야 함, 자손에서 부모를 호출할때 사용가능
		System.out.println("MyChild");//11
	}//12
}
