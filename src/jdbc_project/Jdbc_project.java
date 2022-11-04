package jdbc_project;

import java.util.List;
import java.util.Scanner;

public class Jdbc_project {
	public static void main(String[] args) {
		ConcertController cController = new ConcertController();
		Scanner sc = new Scanner(System.in);

		System.out.printf("1 리스트 2 연주일정 삽입 3 연주일정 수정 4 연주일정 삭제 0 시스템 종료 : ");
		int input = Integer.parseInt(sc.nextLine());

		if(input == 1){
			System.out.println("번호   연주자   악기     연주일정   프로그램작곡가   티켓값");
			listCall(cController);
		} else if (input == 2) {
			System.out.println("번호   연주자   악기     연주일정   프로그램작곡가   티켓값");
			listCall(cController);
		} else if (input == 3) {
			System.out.println("번호   연주자   악기     연주일정   프로그램작곡가   티켓값");
			listCall(cController);
		} else if (input == 4) {
			System.out.println("번호   연주자   악기     연주일정   프로그램작곡가   티켓값");
			listCall(cController);
		} else if (input == 0) {
			System.out.println("시스템 종료");
            System.exit(0);
		}
	}// end main()

	private static void listCall(ConcertController cController) {
		List<ConcertDTO> aList = cController.listProcess();
		for (ConcertDTO dto : aList)
			System.out.printf("%d %7s %5s %8d %6s %10d", dto.getNum(), dto.getName(), dto.getInstrument(), dto.getDay(),
					dto.getProgramComposer(), dto.getPrice());
	}//end listCall
}// end class
