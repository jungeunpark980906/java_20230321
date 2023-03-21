package day15;

import java.util.Scanner;

import product.ProductManager1;

public class ProgramMain {

	public static void main(String[] args) {
		ProgramManager pm = new ProgramManager();
	
		 
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		do {
			System.out.println();
			System.out.println("메뉴를 입력해주세요.");
			System.out.println("1. 학생등록");
			System.out.println("2. 학생확인(리스트)");
			System.out.println("3. 학생검색(한명)");
			System.out.println("4. 수강신청");
			System.out.println("5. 수강철회");
			System.out.println("6. 종료");
			System.out.println();
			
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: pm.insertStudent(scan); break;
			case 2: pm.printStudent(); break;
			case 3: pm.searchStudent(scan); break;
			case 4: pm.reisterSubject(scan); break;
			case 5: pm.deleteSubject(scan); break;
			case 6: System.out.println("종료합니다"); break;
			default: System.out.println("잘못된 값을 입력하셨습니다"); break;

			}
			

		}while(menu!=6);

	}

}
