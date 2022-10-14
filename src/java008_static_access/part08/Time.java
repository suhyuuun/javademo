package java008_static_access.part08;
/*
 * 캡슐화(encapsulation) : 추상화를 통해 정리된 데이터들과 기능을 하나로 묶어 관리하는 기법으로 데이터의 접근 제한을 원칙으로 한다.
 * 
 * 캡슐화 정의 방법
 * 1. 멤버변수의 접근제어자는 private으로 선언한다.
 * 2. setter메서드의 정의 방법
 * 		- 접근제어자 public으로 지정한다.
 * 		- 리턴 타입은 void으로 지정한다.
 * 		- 메소드명은 set으로 시작하고 멤버변수의 첫글자만 대문자로 지정하고 나머지는 같게 한다.
 * 		  private int num;
 * 		  public void setNum(int num){
 * 			 this.num(멤버변수) = num(매개변수);
 *  	  }
 * 3. getter메서드의 정의 방법
 * 		- 접근제어자 public으로 지정한다.
 * 		- 리턴타입은 멤버변수의 데이터 타입과 같게 한다.
 * 		- 메소드명은 get으로 시작하고 멤버변수의 첫글자만 대문자로 지정하고 나머지는 같게 한다.
 * 		  public int getNum(){
 * 			return num;
 * 		  }
 */
public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time() {
		
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	public String toString() {
		return String.format("%d:%d:%d", hour, minute, second);
	}

}


