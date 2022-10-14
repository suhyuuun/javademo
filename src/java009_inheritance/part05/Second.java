package java009_inheritance.part05;
//import java.lang.Override; 
//import java.lang.System;
//import java.lang.String;
//java.lang에서 제공되는 것들은 디폴트로 가지고 있어서 굳이 적어줄 필요없음

public class Second extends First {
	int b = 20;

	@Override
	void display() {
		System.out.println("b= " + b);

	}

	void superThisMethod() {
		super.display();
		this.display();
		// display(); -> this.display()와 같은 기능
	}
}
