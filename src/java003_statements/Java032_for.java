package java003_statements;
/*
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * */
public class Java032_for {

	public static void main(String[] args) {
		//int data = 1;
		for(int row=0;row<=3;row++) {
			//data=1;
			for(int col=1;col<=5;col++) {
				System.out.printf("%4d",col /*data++*/);
			}
			System.out.println();
		}
	}//end main()

}//end class
