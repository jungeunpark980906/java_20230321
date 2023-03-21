package day17;

import java.util.Scanner;

public class EnglishDictionaryMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Word w = new Word();
		int menu = 2;
		
		do {
		System.out.println("< 단어장 >");
		System.out.println("1.단어등록 | 2.단어출력 | 3.종료");
		System.out.println("메뉴를 선택해주세요.");
		menu = sc.nextInt();
		
		switch(menu) {
		case 1 : w.makeWord(sc); break;
		case 2: w.print(); break;
		case 3 : System.out.println("종료합니다."); break;
		default : System.out.println("1-3중 입력해주세요"); break;
		}
		
		} while (menu != 3);
	}

}
