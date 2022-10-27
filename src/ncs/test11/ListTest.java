package ncs.test11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		// 명시한 사용 데이터를 list에 기록한다.
		while (list.size() < 10) {
			Random ran = new Random();
			list.add(ran.nextInt(100) + 1);
		}
		// list의 데이터를 내림차순 정렬한다.
		// display()메소드를 호출한다.
		display(list);
	}// end main()

	public static void display(List list) {
		System.out.println("정렬전 : " + list.toString());
		list.sort(new Decending());
		System.out.println("정렬후 : " + list.toString());
	}
}
