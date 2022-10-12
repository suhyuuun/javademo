package java006_class.part05;

public class Java069_class {

	public static void main(String[] args) {
		MemberVar mv= new MemberVar();
		System.out.printf("var_byte=%d\n", mv.var_byte);
		System.out.printf("var_short=%d\n", mv.var_short);
		System.out.printf("var_int=%d\n", mv.var_int);
		System.out.printf("var_long=%d\n", mv.var_long);
		System.out.printf("var_float=%.1f\n", mv.var_float);
		System.out.printf("var_double=%.1f\n", mv.var_double);
		System.out.printf("var_boolean=%b\n", mv.var_boolean);
		System.out.printf("var_char=%c\n", mv.var_char);
		System.out.printf("var_string=%s\n", mv.var_string);
		System.out.printf("var_arr=%s\n", mv.var_arr);

		//지역변수는 기본값을 제공하지 않는다.
		//The local variable num may not have been initialized
		//int num;
		//System.out.printf("num: ",num);
	}

}
