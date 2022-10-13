package java008_static_access.part07;

public class MemberDAO {
	private static MemberDAO dao = new MemberDAO();//정의된 객체 내부에서 선언
	private MemberDAO() {
	
	}//private으로 다른 클래스에서 사용불가
	
	public static MemberDAO getInstance() {
		return dao;
	}
	
//	public static MemberDAO getInstance() {
//		return new MemberDAO();
//	} //생성할 때마다 새로운 것 생성됨 이렇게 사용하면 안되용
	
	public void display() {
		System.out.println("display");
	}
}

