package java017_collection;
/*
 * 선형리스트(Linear List)
 * 1. 순서리스트(Ordered List)
 * 2. 자료들 간에 순서를 갖는 리스트
 * 3. 선형 리스트에서 원소를 나열한 순서는 원소들의 순서가 된다.
 */
public class UserList {
	private Object[] sale = new Object[3];
	private int pointer = 0;
	
	public UserList() {
		
	}
	
	public void add(Object element) {
		
		sale[pointer++]=element;
		
	}
	
	
}
