package java003_statements;

public class Java035_while {

	public static void main(String[] args) {
		int cnt=1;
		//무한루프를 돌리고 싶을 때 true를 작성해준다.
		while(true) {
			System.out.println(cnt++);
			if(cnt==6) {
				break;
			}
		}

	}//end main()

}//end class
