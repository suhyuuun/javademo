package java007_class.part08;
/* <Javascript>
 * let num = {10, 20, 30, 40, 50};
 * for(let index in num){
 * 	console.log(index); //0 1 2 3 4
 * }
 * 
 * for(let element of num){
 *  console.log(element); //10 20 30 40 50 
 *  
 *  
 * */
public class Java081_for {

	public static void main(String[] args) {
		int[]num = {10, 20, 30, 40, 50};
		for(int i = 0; i<num.length;i++) {
			System.out.println(num[i]);
		}
		System.out.println("==========================");
		
		/*개선된 루프 = 확장된 루프 = 개선된 for문
		 for(데이터타입변수 변수 : 배열 or 컬렉션){
		 *  수행할 문장;
		 * }
		 *  
		 * for( int element : num){
		 *  System.out.pritnln(element); 
		 * } //10 20 30 40 50
		 * 
		 * */
		
		for(int element : num) {
			System.out.println(element);
		}
	}//end main()

}//end class
