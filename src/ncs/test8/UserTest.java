package ncs.test8;

public class UserTest {

	public static void main(String[] args) {
		User[] users = new User[3];
		// User 객체를 3개 생성하여 배열에 넣는다.
		// 배열에 있는 객체 정보를 모두 toString()으로 출력한다. (for문)
		users[0] = new User("user01", "pass01", "김철수", 32, 'M', "010-1234-5678");
		users[1] = new User("user02", "pass02", "이영희", 25, 'F', "010-5555-7777");
		users[2] = new User("user03", "pass03", "황진이", 20, 'F', "010-9874-5632");
		System.out.println("user list----------------------------------");
		for (int i = 0; i < users.length; i++) {
			System.out.println(users[i].toString());
		}
		User[] copyUsers = new User[users.length];
		// users가 참조하는 객체들의 복사본을 만든다. (for)
		User us = new User();
		for (int i = 0; i < users.length; i++) {
			copyUsers[i] = users[i];
		}
		System.out.println("copyUsers----------------------------------");
		// copyusers 의 객체 정보를 모두 출력한다. (for-each)
		for (User temp : copyUsers) 
				System.out.println(temp.toString());
	
		System.out.println("비교결과--------------------------------------");
		// users와copyUsers의 각 index별 객체의 값들이 일치하는지 확인 출력한다.
		for(int i = 0; i< users.length;i++) {
			System.out.println(users[i]==copyUsers[i]);
		}
	}

}
