package java018_collection;

import java.util.LinkedList;

/*
 * stack(스택)
 * 1. LIFO(Last in First Out) : 마지막에 저장된 요소를 먼저 꺼낸다.
 * 2. 수식계산, 수식괄호검사, undo/redo, 뒤로/앞으로
 * 
 * push & pop : pop사용시 데이터 없어짐 (복사로 꺼내오는 것이 아닌 빼오는 것)
 */
public class Java190_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> nStack = new LinkedList<String>();

		// append
		nStack.push(new String("java"));
		nStack.push(new String("Jsp"));
		nStack.push(new String("spring"));

//		System.out.println(nStack.pop());
//		System.out.println(nStack.pop());
//		System.out.println(nStack.pop());
//		System.out.println(nStack.pop()); //error : java.util.NoSuchElementException
		
		while(!nStack.isEmpty())
			System.out.println(nStack.pop());
	}// end main()

}// end class
