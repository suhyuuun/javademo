package java012_api;
/*
 * 1. 기본자료형을 클래스로 정의해놓은 것을 Wrapper라 한다.
 * char     ->  Character
 * byte     ->  Byte
 * short    ->  Short
 * int      ->  Int
 * long     ->  Long
 * float    ->  Float
 * double   ->  Double
 * boolean  ->  Boolean
 * 
 * 2. 메모리에 저장된 값을 다른 자료형으로 변환해주는 메소드를 제공하기 위해서 Wrapper클래스를 제공한다.
 * 
 * 3. auto boxing과 auto unboxing은 jdk5.0에서 추가된 기능이다.
 * 	  auto boxing => 스택 => 힙영역에서 복사
 * 	  auto unboxing => 힙 => 스택영역에서 복사 
 * 
 */
public class Java144_Wrapper {

	public static void main(String[] args) {
		
		String data = "123";
		
		//Integer <- String
		Integer it = new Integer(data); //jdk9.0 deprecated
		
		//int  <- Integer
		int num = it.intValue();
		
		System.out.println(num);
		
		//Integer <- String
		Integer ig = Integer.valueOf(data);
		//int <- Integer
		int num2 = ig; //auto unboxing
		
		//double <- Integer
		double pro = it.doubleValue(); //구버전
		System.out.println(pro);
		
		double pro2 = it; //현버전 auto unboxing
		
		//long <- Integer
		long nn = it.longValue();
		System.out.println(nn);
		long nn2 = it; //auto unboxing
		System.out.println(nn2);
		
		Double db = new Double(data);
		Double de = Double.valueOf(data);
		int x = de.intValue();
		System.out.println(x);
		//기본데이터타입이 아닌 객체(de)이기 때문에 명시적 형변환 못함 -> auto unboxing 일어나지 않음
		//크기 차이로 auto unboxing이 안됨
		//int x2 = (int)de; 
		//System.out.println(x2);
		
		double y = de.doubleValue();
		System.out.println(y);
		double y2 = de; //auto unboxing
		System.out.println(y2);
		
		//int <- String
		int a = Integer.parseInt(data);
		System.out.println("a=" + a);
		
		//byte <- String
		byte b = Byte.parseByte(data);
		System.out.println("b=" + b);
		
		//double <- String
		double c = Double.parseDouble(data);
		System.out.println("c= " + c);
		
		boolean numBoolean = Boolean.parseBoolean(data);
		System.out.println("numBoolean= " + numBoolean); //false (논리값일때만 true)
		
		numBoolean = Boolean.parseBoolean("true");
		System.out.println("numBoolean= " + numBoolean); //true (이때만 true 나옴)
		
		numBoolean = Boolean.parseBoolean("false");
		System.out.println("numBoolean= " + numBoolean); //false
		
		String ss = String.valueOf(1);
		System.out.println(ss); //1
		Double da = Double.valueOf("1");
		System.out.println(da); //1.0
		//double dt = da.doubleValue(); //구버전
		double dt = da; //auto unboxing
		System.out.println(dt); //1.0
		
		int k = 10;
		Integer in = new Integer(k); //구버전
		Integer is = k; //auto boxing
		System.out.println(is); //10
		
		int m = is; //auto unboxing
		
		//////////////////////////////////////////////////////
		//*중요해용*//
		double dm = 5.4;
		Double valDouble = dm; //auto boxing
		double dn = valDouble; //auto unboxing
		
		String ko = "90";
		Double dp = Double.valueOf(ko); //Double <- String
		String kt = dp.toString();//String <- Double
		double kd = Double.parseDouble(ko);//double <- String
		
		
		
		
		
	}//end main()

}//end class


