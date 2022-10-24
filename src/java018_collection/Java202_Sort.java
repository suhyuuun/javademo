package java018_collection;

public class Java202_Sort {

	public static void main(String[] args) {
		String a = "ABCawser24";
		String b = "ABC";
		String d = "ABC";
		String e = "ab";

		//앞에 문자들이 같고 길이가 다르면 길이를 비교한다.
		System.out.println(a.compareTo(b)); // 7
		System.out.println(b.compareTo(a)); // -7

		System.out.println(b.compareTo(d)); // 0
		
		//길이가 같으면 유니코드값으로 비교한다.
		System.out.println(b.compareTo(e)); //65 - 97 = -32
		System.out.println(e.compareTo(b)); // 97 -65 = 32
	}

}
