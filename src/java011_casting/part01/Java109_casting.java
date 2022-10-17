package java011_casting.part01;
/*
 * 객체형변환 - 참조데이터 타입
 * 1. 상속관계일 때 형변환이 가능하다.(is a)
 * 2. 업캐스팅 발생된 후 다운캐스팅을 할 수 있다.
 * 		- 업캐스팅 : 부모객체로 자식객체를 참조하도록 형변환하는 기술
 * 		- 다운캐스팅 : 업캐스팅을 다시 원상복귀해주는 형변환하는 기술
 */
public class Java109_casting {

	public static void main(String[] args) {
		//SampleA sa = new SampleA();
		//SampleB sb = new SampleB();
		//sa = (SampleA)sb; //불가
		
		Parent p = new Parent();
		Child c = new Child();
		
		//Parent p = new Child(); => 업캐스팅
		p =c; //업캐스팅(up-casting)
		p.process(); //Child process, 오버라이딩된 메소드라 가능
		//p.call(); //직접적으로 자식클래스에 있는 메소드 불가
		
		//다운캐스팅(down-casting)
		Child d = (Child)p; 
	
		System.out.println("=====================================");

		//객체생성 및 업캐스팅
		Parent pt = new Child();
		pt.process();//Child process
		//pt.call(); //error
		
		//다운캐스팅
		Child cn = (Child)pt;
		cn.call();//Child Call
	}

}
