package java020_thread.part06;

import java.util.Scanner;

public class AccountNumber {
private long depositMoney = 100000; // 은행잔고
	private long balance; // 찾을 금액
	private Scanner sc = new Scanner(System.in); // 찾을 금액 입력
	
	synchronized public void input() {
		System.out.printf("%s 지점 입장\n", Thread.currentThread().getName()/* thread이름출력 */);
		try {
			System.out.print("출금금액입력:");
			balance = sc.nextLong();
		} catch (NumberFormatException ex) {
			System.out.println(ex.toString());
		}
	}

	// 잔액 계산
	public void withDraw() {
		if (depositMoney >= balance) {
			depositMoney = depositMoney - balance;
			System.out.printf("남은금액은 : %d입니다.\n", depositMoney);
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}// end withDraw()
	
}
