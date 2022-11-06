package jdbc_project;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Jdbc_project {

	public static void main(String[] args) {
		ConcertController cController = new ConcertController();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.printf("1 리스트  2 콘서트일정 삽입  3 콘서트일정 수정  4 콘서트일정 삭제  0 종료 : ");
			int input = Integer.parseInt(sc.nextLine());
			
			if(input == 1) {
				System.out.println("번호      연주자     악기     연주일정        티켓값   프로그램작곡가");
				listCall(cController);
			}else if(input == 2) {
				insertCall(cController, sc);
				System.out.println("번호      연주자     악기     연주일정        티켓값   프로그램작곡가");
				listCall(cController);
			}else if(input == 3) {
				updateCall(cController, sc);
				System.out.println("번호      연주자     악기     연주일정        티켓값   프로그램작곡가");
				listCall(cController);
			}else if(input == 4) {
				deleteCall(cController, sc);
				System.out.println("번호      연주자     악기     연주일정        티켓값   프로그램작곡가");
				listCall(cController);
			}else if(input == 0) {
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
			}else {
				System.out.println("0 ~ 4 중 하나의 숫자를 입력해주세요.");
			}
		}//while문
	}//end main()

	private static void listCall(ConcertController cController) {
		List<ConcertDTO> aList = cController.listProcess();
		for(ConcertDTO dto : aList)
			System.out.printf("%d %10s %7s %10d %10d %6s\n", dto.getNum(), dto.getName(), dto.getInstrument(), dto.getDay(), dto.getPrice(), dto.getProgramComposer());
	}//end listCall()
	
	private static void insertCall(ConcertController cController,Scanner sc) {
		System.out.printf("이름입력 : ");
		String name = sc.nextLine();
		
		System.out.printf("악기입력 : ");
		String instrument = sc.nextLine();
		
		System.out.printf("날짜입력 : ");
		int day = Integer.parseInt(sc.nextLine());
		
		System.out.printf("가격 입력 : ");
		int price = Integer.parseInt(sc.nextLine());
		
		System.out.printf("프로그램 작곡가 입력 : ");
		String programComposer = sc.nextLine();
		
		ConcertDTO dto = new ConcertDTO(name, instrument, day, price, programComposer);
		int chk = cController.insertProcess(dto);
		if(chk > 0)
			System.out.printf("%d개 삽입\n", chk);
		else
			System.out.println("삽입 실패");
	}//end insertCall()
	
	private static void updateCall(ConcertController cController, Scanner sc) {
		HashMap<String, Object> hmap = new HashMap<String, Object>();
		System.out.printf("번호입력: ");
		hmap.put("num", Integer.parseInt(sc.nextLine()));
		
		System.out.printf("수정할 날짜 입력: ");
		hmap.put("day", Integer.parseInt(sc.nextLine()));
		
		int chk = cController.updateProcess(hmap);
		if(chk >= 0)
			System.out.printf("%d개 수정\n",chk);
		else
			System.out.println("수정 실패");
	}//end updateCall()
	
	private static void deleteCall(ConcertController cController, Scanner sc) {
		System.out.printf("티켓값 입력: ");
		int price = Integer.parseInt(sc.nextLine());
		int chk = cController.deleteProcess(price);
		if(chk >= 0)
			System.out.printf("%d개 삭제\n", chk);
		else
			System.out.println("삭제 실패");
	}
}//end class 

