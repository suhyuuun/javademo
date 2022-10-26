package java023;

import java.util.ArrayList;
import java.util.Scanner;

public class Score {
	private static ArrayList<Student> studentList = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생추가 | 2.학생삭제 | 3.학생조회 | 4.성적입력 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.println("선택>> ");
			int selectNum = Integer.parseInt(scanner.next());
			switch (selectNum) {
			case 1:
				createStudent();
				break;
			case 2:
				deleteStudent();
				break;
			case 3:
				searchStudent();
				break;
			case 4:
				score();
				break;
			default:
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

	private static void createStudent() {
		System.out.print("학생이름: ");
		String name = scanner.next();
		System.out.print("학생나이: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		Student s = new Student();
		s.setName(name);
		s.setAge(age);
		studentList.add(s);
	}

	private static void deleteStudent() {
		System.out.println("학생이름: ");
		String name = scanner.next();
		boolean noneResult = false;
		for (int i = 0; i < studentList.size(); i++) {
			Student s = studentList.get(i);
			if (s.getName().equals(name)) {
				noneResult = true;
				studentList.remove(i);
				System.out.println("삭제되었습니다.");
				break;
			}
		}
		if (!noneResult) {
			System.out.println("검색결과가 없습니다.");
		}
	}

	private static void searchStudent() {
		System.out.println("학생이름: ");
		String name = scanner.next();
		boolean noneResult = false;
		for (int i = 0; i < studentList.size(); i++) {
			Student s = studentList.get(i);
			if (s.getName().equals(name)) {
				noneResult = true;
				System.out.println("이름:" + s.getName() + " | 나이:" + s.getAge() + " | 영어:" + s.getEng() + " | 수학:"
						+ s.getMat() + " | 국어:" + s.getKor());
				break;
			}
		}
		if (!noneResult) {
			System.out.println("검색결과가 없습니다.");
		}
	}

	private static void score() {
		System.out.println("학생이름: ");
		String name = scanner.next();
		boolean noneResult = false;
		for (int i = 0; i < studentList.size(); i++) {
			Student s = studentList.get(i);
			if (s.getName().equals(name)) {
				noneResult = true;
				System.out.println("영어점수: ");
				int eng = scanner.nextInt();
				System.out.println("수학점수: ");
				int mat = scanner.nextInt();
				System.out.println("국어점수: ");
				int kor = scanner.nextInt();
				s.setEng(eng);
				s.setMat(mat);
				s.setKor(kor);
				break;
			}
		}
		if (!noneResult) {
			System.out.println("검색결과가 없습니다.");
		}
	}
}