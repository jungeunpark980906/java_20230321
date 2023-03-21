package day18;

import java.io.IOException;
import java.util.Scanner;

import day18.WordManager;

public class WordMain {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int menu = -1;
		WordManager wm = new WordManager();
		wm.addWord();
		do {
			wm.printMenu();
			menu=sc.nextInt();
			
			switch(menu) {
			case 1: wm.insertWord(); break;
			case 2: wm.searchWord(); break;
			case 3: wm.modifyWord(); break;
			case 4: wm.printWord(); break;
			case 5: wm.fileWord(); break;
			case 6: wm.deletWord(); break;
			case 7:  break;
			default : System.out.println("잘못입력하셨습니다."); continue;
			}
			
			
		
			
		} while(menu !=7);		
		System.out.println("프로그램 종료");
	}

	

}
