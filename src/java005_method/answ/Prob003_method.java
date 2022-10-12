package java005_method.answ;

public class Prob003_method {
	public static void main(String[] args) {
		char[] arr=new char[]{'j','a','v','a','_','j','s','p'};			
		System.out.println(process(arr)); //java jsp
		
		char[] loc=new char[]{'s','e','o','u','l','_','i','n','c','h','o','n'};
		System.out.println(process(loc));//seoul inchon

	}//end main()
	
	public static char[] process(char[] data){
		//data배열의 요소가 '_'이면 ' '으로 변경후 리턴하는
		//프로그램을 구현하시오.
		
		for(int i=0; i<data.length;i++){
			if(data[i]=='_')
				data[i]=' ';
		}
		return data;
	}//end process()

}//end class








