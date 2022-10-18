package java012_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java125_RegEx {

	public static void main(String[] args) {
		String sn = "12345";
		String sb = "2bsba5";
		String st = "aetwef";
		
		//a-zA-Z_*$가 sn변수에 포함이 되어 있으면 true 아니면 false를 리턴한다.
		System.out.println(sn.matches(".*[a-zA-Z_*$].*")); //false

		//sn변수에 숫자 0-9가 포함되어 있으면 true 아니면 false을 리턴한다.
		System.out.println(sn.matches(".*[0-9].*")); //true
		System.out.println(sn.matches(".*[\\d].*")); //true \d -> 숫자 0-9를 의미
		System.out.println(sn.matches(".*\\d.*")); //true => 3개 다 같은 의미로 사용
		
		//sn변수에 숫자 0-9가 포함되어 있지 않으면 true 아니면 false을 리턴한다.
		System.out.println(sn.matches(".*[^0-9].*")); //대괄호 안에서 ^의 의미는 not, 대괄호안에서 첫번째로 사용해야 한다.
		System.out.println(sn.matches(".*[\\D].*"));
		
		//sb변수에 저장된 값이 2로 시작되면 true 아니면 false를 리턴한다.
		System.out.println(sb.matches("2.*"));

		//sb변수에 저장된 값이 2로 시작하고 5로 끝나면 true 아니면 false를 리턴한다.
		System.out.println(sb.matches("2.*5"));
		
		//st변수에 저장된 값이 a이거나 b로 시작하고 임의문자가 5개이면 true 아니면 false를 리턴
		System.out.println(st.matches("[ab].{5}"));
		
		//st변수에 저장된 값이 a이나 b로 시작하고 임의문자가 1~5개이며 cc로 끝나면 true 아니면 false 리턴
		st = "aetwdfcc";
		System.out.println(st.matches("[ab].{1,5}cc"));
		/////////////////////////////////////////////////////////////////////////////////////
		/*
		 * Pattern.matcher() : 빠르게 어떠한 text(String)이 주어진 Pattern에있는지를 확인한다.
		 * Pattern.compile(): 여러개의 텍스트를 재사용 가능한 Pattern 인스턴스로 컴파일 한다.
		 * find() : 최초의 패턴 위치로 이동한 뒤 True 반환, 없으면 false 
		 * find(int start) : start 위치 부터 find 
		 * start() : 매칭되는 패턴의 시작 인덱스 반환 
		 * start(int group) : group이 매칭되는 시작 인덱스 반환
		 * end() : 매칭된 패턴 한칸 뒤 인덱스 반환 
		 * end(int group) : 지정되 그룹이 매칭되는 한칸 뒤 인덱스 반환 
		 * group() : 최초로 그룹 매칭된 패턴을 반환 group(int group) : 그룹 매칭된 부분중 group번째 패턴을 반환 
		 * groupCount() : 패턴내 그룹핑(괄호로 묶은 패턴들)의 갯수 반환
		 * matches() : 패턴이 전체 문자열과 일치하면 True
		 */
		
		// \\d : 숫자 \\w: 숫자 , 영문 (소문자 긍정, 대문자 부정)
		String input1 = "3absfa";
		//input1 = "12";
		System.out.println(input1.matches("\\d")); // \\d는 숫자 하나를 의미 숫자, \\d일 때 변수가 숫자 1개이면 true 숫자 2개이상이면 false
		Pattern pn = Pattern.compile("\\d"); //클래스로 정규식을 저장후 여러군데에서 사용가능
		Matcher mc = pn.matcher(input1);
		System.out.println(mc); //java.util.regex.Matcher[pattern=\d region=0,6 lastmatch=]
		System.out.println(mc.find());
		System.out.println(mc.find(0));
		
		//아래 두개는 똑같은 의미
		System.out.println(Pattern.compile("\\d").matcher(input1).find());
		System.out.println(Pattern.compile("\\d").matcher(input1).find(0));
		
		//조건: 데이터 길이: 5~10, 숫자와 영문 포함
		input1 = "wwfwfg3";
		System.out.println(input1.matches("[\\w]{5,10}")
				&& Pattern.compile("[0-9]").matcher(input1).find()
				&& Pattern.compile("[a-zA-Z]").matcher(input1).find());
		
		/*
		Pattern 플래그 값 사용(상수)
		Pattern.CANON_EQ : None표준화된 매칭 모드를 활성화합니다.
		Pattern.CASE_INSENSITIVE : 대소문자를 구분하지 않습니다. 
		Pattern.COMMENTS : 공백과 #으로 시작하는 주석이 무시됩니다. (라인의 끝까지).
		Pattern.MULTILINE : 수식 '^' 는 라인의 시작과, '$' 는 라인의 끝과 match 됩니다.
		Pattern.DOTALL : 수식 '.'과 모든 문자와 match 되고 '\n' 도 match 에 포함됩니다.
		Pattern.UNICODE_CASE : 유니코드를 기준으로 대소문자 구분 없이 match 시킵니다.
		Pattern.UNIX_LINES : 수식 '.' 과 '^' 및 '$'의 match시에 한 라인의 끝을 의미하는 '\n'만 인식됩니다.
        */
		
		String str = "The BEst things in best life are best free";
		boolean res = Pattern.compile("best").matcher(str).find();
		System.out.println(res);
		
		Pattern pt = Pattern.compile("best",Pattern.CASE_INSENSITIVE);
		Matcher mh = pt.matcher(str); //java.util.regex.Matcher[pattern=best region=0,42 lastmatch=]
		System.out.println(mh);
		int i = 1;
		while(mh.find())
			System.out.printf("%d번째 %d~%d %s\n", i++, mh.start(), mh.end(), mh.group());
		

		///////////////////////////////////////////////////////////////////////////////////////
		str = "The BEst10 things in best20 life are best30 free";
		pt = Pattern.compile("(best)(10|20|30)",Pattern.CASE_INSENSITIVE);
		mh = pt.matcher(str);
		i = 1;
		while(mh.find())
			System.out.printf("%d번째 %d~%d %s\n", i++, mh.start(), mh.end(), mh.group());
	}//end main()

}//end class
