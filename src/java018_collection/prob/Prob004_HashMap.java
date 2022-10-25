package java018_collection.prob;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
 * [출력결과]
 * 찾는 도서명을 입력 :java
 * 책이름 : java
 * 책저자 : kim
 * 페이지 : 100
 * 
 * 찾는 도서명을 입력 :jsp
 * 찾는 도서가 없습니다
 */
import java.util.Set;

public class Prob004_HashMap {
	public static void main(String[] args) {
		BookShop bk1 = new BookShop("java", "kim", 100);
		BookShop bk2 = new BookShop("c++", "lee", 250);
		BookShop bk3 = new BookShop("oracle", "park", 300);
		BookShop[] bs = new BookShop[3];
		bs[0] = bk1;
		bs[1] = bk2;
		bs[2] = bk3;
		display(bs);

	}// end main()

	public static void display(BookShop[] bs){
		Map<String,BookShop> map=new HashMap<String,BookShop>();
		map.put(bs[0].getTitle(), bs[0]);
		map.put(bs[1].getTitle(), bs[1]);
		map.put(bs[2].getTitle(), bs[2]);
		
		//출력결과를 참조하여 구현하세요.
		/*try(Scanner sc = new Scanner(System.in)){
			System.out.print("찾는 도서명을 입력 :");
			String userFind = sc.nextLine(); //도서명에 공백이 들어갈수 있으니까
			Set<String> set = map.keySet();
			boolean chk = false;
			for(String title : set) {
				if(userFind.equals(title)) {
					chk = true;
					BookShop bShop = map.get(title);
					System.out.printf("책이름:%s\n",bShop.getTitle());
					System.out.printf("책저자:%s\n",bShop.getAuthor());
					System.out.printf("페이지:%s\n",bShop.getPage());
					}
			}
			
			if(!chk)
				System.out.println("찾는 도서가 없습니다.");
		}catch(Exception ex) {	
			System.out.println(ex.toString());
		}*/
		
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("찾는 도서명을 입력: ");
			String userFind = sc.nextLine(); //도서명에 공백이 들어갈수 있으니까
					if(map.get(userFind)==null) {
						System.out.println("찾는 도서가 없습니다.");
					}else {
					BookShop bShop = map.get(userFind);
					System.out.printf("책이름:%s\n",map.get(userFind).getTitle());
					System.out.printf("책저자:%s\n",map.get(userFind).getAuthor());
					System.out.printf("페이지:%s\n",map.get(userFind).getPage());
					}
			
		}catch(Exception ex) {	
			System.out.println(ex.toString());
		}
			
	}//end display()
}
// end class
