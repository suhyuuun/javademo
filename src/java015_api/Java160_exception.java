package java015_api;

public class Java160_exception {

	public static void main(String[] args) {
		int data = 8;
		try {
		if(data<10)
			throw new UserException("10이상만 입력하세요.");
		
		System.out.println(data);
		}catch(UserException ex) {
			System.out.println(ex.toString());
		}
	}//end main()

}//end class
