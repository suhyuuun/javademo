package java020_thread.prob;
/*
 * [출력화면]
생산자 : 음료수 No. 1 자판기에 넣기
소비자 : 음료수 No. 1 꺼내먹음
 
생산자 : 음료수 No. 2 자판기에 넣기
소비자 : 음료수 No. 2 꺼내먹음

생산자 : 음료수 No. 3 자판기에 넣기
소비자 : 음료수 No. 3 꺼내먹음
        :
        
생산자 : 음료수 No. 10 자판기에 넣기
소비자 : 음료수 No. 10 꺼내먹음 
 */
public class Prob001_thread {

	public static void main(String[] args) {		
		VendingMachine vm = new VendingMachine();
		
		//Producer p = new Producer(vm);
		//Consumer c = new Consmer(vm);
		
		//Thread t1 = new Thread(p, "생산자");
		//Thread t2 = new Thread(c, "소비자");
		
		//t1.start();
		//t2.start();
	}//end main()

}//end class
