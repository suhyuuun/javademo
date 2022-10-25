package ncs.test6;

public class InvalidException extends Calculator{
	String message;
	
	public InvalidException(String message) {
		System.out.println("입력값에 오류가 있습니다.");
	}

	
	
}
