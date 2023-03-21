package tmp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		ProgramManager pm = new ProgramManager();
		do {
			System.out.println();
			System.out.println("메뉴를 입력해주세요.");
			System.out.println("1. 전체 학생 출력");
			System.out.println("2. 학생등록");
			System.out.println("3. 학생정보찾기");
			System.out.println("4. 수강등록");
			System.out.println("5. 수강철회");
			System.out.println("6. 종료");		
			System.out.println();
			menu = scan.nextInt();
		
			switch(menu) {
			case 1: pm.printStudent(); break;
			case 2: pm.insertStudent(scan); break;
			case 3: pm.searchStudent(scan); break;
			case 4: pm.reisterSubject(scan); break;
			case 5: pm.deleteSubject(scan); break;
			case 6: System.out.println("종료합니다"); break;
			default: System.out.println("잘못된 값을 입력하셨습니다"); break;
			}
		} while(menu != 6);

	}

}
