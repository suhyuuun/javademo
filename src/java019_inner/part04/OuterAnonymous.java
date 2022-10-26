package java019_inner.part04;

public class OuterAnonymous {
	private int x;

	// 정의를 하면서 바로 생성
	InnerAnonymous ta = new InnerAnonymous() {

		@Override
		void prn() {
			System.out.println("prn");
		}
	}; // 문장의 끝이기 때문에 ;(세미콜론)을 붙인다.

	public void display() {
		ta.prn();

		new InnerAnonymous() {
			@Override
			void prn() {
				System.out.println("prn2");
			}
		}.prn(); //prn을 호출하는 것
	}// end display()
}// end OuterAnonymous class
