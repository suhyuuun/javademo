package java008_static_access.part07;

public class Java090_singleton {
/*
 * 싱글톤 패턴(singleton pattern)
 * 1. 같은 형태의 객체를 생성할 때 사용한다.
 * 2. 하나의 객체만을 생성해서 참조하는 방법이다.
 * 3. 방법
 * 		- 클래스가 정의된 클래스에서 자신의 객체를 생성한다.
 * 		  private static MemberDAO dao = new MemberDAO();
 * 		- static 선언된 메소드에서 생성된 객체를 리턴한다.
 * 		  public static MemberDAO getInstance(){
 * 			return dao;
 * 		  }
 * 		- 생성자의 접근제어자는 private으로 선언한다.
 * 		  private MemberDAO() {
 * 		  }
 * 4. 장점 : 객체의 단일 생성을 위한 자원의 절약
 * 5. 단점 : 해제되는 시점을 알기 어려움
 */
	public static void main(String[] args) {
		MemberDAO mb = MemberDAO.getInstance();
		mb.display();
		
		MemberDAO mc = MemberDAO.getInstance();
		mc.display();
		
		System.out.println(mb==mc);
	}

}
