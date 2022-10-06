package java001_basic.answ;

/*
1  사과를 담는데 필요한 바구니의 수를 구하는 코드이다. 
2  만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면,
   13개의 바구니가 필요하다
   
3  [실행결과]
    필요한 바구니의 수 : 13
 */
public class Prob03 {

	public static void main(String[] args) {
	  //여기에 구현하세요.		
      int numOfApple = 123; //사과의 수
      int sizeOfBucket = 10; //하나의 바구니에 담는 사과수
      int numOfBucket; //필요한 바구니 수
      
      numOfBucket = numOfApple % sizeOfBucket == 0 ? numOfApple / sizeOfBucket : numOfApple / sizeOfBucket + 1;
      System.out.printf("필요한 바구니의 수 : %d\n", numOfBucket);
      
	}//end main()

}//end class














