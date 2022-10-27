package project;

/*
 - 조성진
    - 피아노
    - 20221029
    - 쇼팽
    - 50000
- 양인모
    - 바이올린
    - 20221030
    - 파가니니
    - 50000
- 박규희
    - 클래식기타
    - 20221005
    - 구스타프말러
    - 50000
- 김한
    - 클라리넷
    - 20221106
    - 바흐
    - 50000
- 리처드용재오닐
    - 비올라
    - 20221112
    - 멘델스존
    - 50000
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Concert {

	public static void main(String[] args) {
		ArrayList<Player> recital = new ArrayList<Player>();
		Scanner sc = new Scanner(System.in);

		boolean ing = true;
		while (ing) {
			System.out.println("1: 연주자 추가 2: 리사이틀 정보입력 3: 연주자의 리사이틀 정보 4: 모든 리사이틀 정보 5: 종료 ");
			int num = Integer.parseInt(sc.nextLine());
			switch (num) {
			case 1:
				System.out.println("연주자 추가를 선택하셨습니다");
				System.out.print("연주자이름 :");
				String name = sc.next();
				System.out.print("악기 :");
				String instrument = sc.next();
				sc.nextLine();
				Player p = new Player();
				p.setName(name);
				p.setInstrument(instrument);
				recital.add(p);
				break;
				
			case 2:
				System.out.println("리사이틀 정보입력을 선택하셨습니다");
				System.out.print("연주자이름 :");
				name = sc.next();
				boolean noneplayer = false;
				for (int i = 0; i < recital.size(); i++) {
					p = recital.get(i);
					if (p.getName().equals(name)) {
						noneplayer = true;
						System.out.print("리사이틀 날짜 :");
						int day = sc.nextInt();
						System.out.print("리사이틀 프로그램 작곡가 :");
						String programComposer = sc.next();
						System.out.print("리사이틀 티켓값 :");
						int quantity = sc.nextInt();
						sc.nextLine();
						p.setDay(day);
						p.setProgramComposer(programComposer);
						p.setQuantity(quantity);
						break;
					} // end if
				}
				if (!noneplayer)
					System.out.println("연주자 정보가 없습니다.");
				break;
				
			case 3:
				System.out.println("연주자의 리사이틀 정보를 선택하셨습니다.");
				System.out.print("연주자이름 :");
				name = sc.next();
				boolean nonelist = false;
				for (int i = 0; i < recital.size(); i++) {
					p = recital.get(i);
					if (p.getName().equals(name)) {
						nonelist = true;
						System.out.println("연주자 이름 : " + p.getName() + " / 악기 : " + p.getInstrument() + " / 리사이틀 날짜 : " 
											+ p.getDay() + " / 리사이틀 프로그램 작곡가 : " + p.getProgramComposer() + " / 리사이틀 티켓값 : " + p.getQuantity());
						break;
					}//end if
				}//end for
				if (!nonelist)
					System.out.println("연주자 정보가 없습니다.");
				break;
				
			case 4:
				System.out.println("모든 리사이틀 정보를 선택하셨습니다.");
				for (int i = 0; i < recital.size(); i++) {
					System.out.printf("연주자 이름 : %s / 악기 : %s / 리사이틀 날짜 : %d / 리사이틀 프로그램 작곡가 : %s / 리사이틀 티겟값 : %s\n",
										recital.get(i).getName(), recital.get(i).getInstrument(),recital.get(i).getDay(),
										recital.get(i).getProgramComposer(), recital.get(i).getQuantity());
				}
				break;

			case 5:
				ing = false;
				System.out.println("종료합니다.");
				break;
				
			}//end switch
		} // end while
	}// end main()
}// end class
