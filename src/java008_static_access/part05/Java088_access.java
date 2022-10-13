package java008_static_access.part05;
//package의 위치가 다르면 import 사용
public class Java088_access {

	public static void main(String[] args) {
		Java087_access p = new Java087_access();
		//System.out.printf("var_private:%d\n",p.var_private);
		//private은 다른 클래스에서 접근불가
		System.out.printf("var_default:%d\n",p.var_default);
		System.out.printf("var_protected:%d\n",p.var_protected);
		System.out.printf("var_public:%d\n",p.var_public);
	}

}
