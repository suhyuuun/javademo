package java018_collection;

import java.util.LinkedList;

/*Queue(큐)
 * 1.FIFO(First in First Out) : 제일 먼저 저장한 요소를 제일 먼저 꺼내온다.
 * 2. 최근사용문서, 인쇄작업대기목록, 버퍼 등
 */

public class Java191_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> nQueue = new LinkedList<String>();
		
		//append
		nQueue.offer(new String("java"));
		
	}//end main()

}//end class
