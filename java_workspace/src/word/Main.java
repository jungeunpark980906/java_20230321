package word;
import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		WordManager wm = new WordManager();
		do {
			System.out.println();
			System.out.println("메뉴를 입력해주세요.");
			System.out.println("1. 단어추가");
			System.out.println("2. 단어출력(추가된 모든 단어)");
			System.out.println("3. 단어검색");
			System.out.println("4. 단어수정");
			System.out.println("5. 단어삭제");
			System.out.println("6. 파일로 출력");
			System.out.println("7. 종료");
			System.out.print("메뉴 입력: \n");			
			System.out.println();
			menu = sc.nextInt();
		
			switch(menu) {
			case 1: wm.addWord(); break;
			case 2: wm.printWord(); break;
			case 3: wm.searchWord(); break;
			case 4:	wm.updateWord(); break;
			case 5: wm.deleteWord(); break;
			case 6: wm.printFile(); break;
			case 7: System.out.println("종료합니다"); break;
			default: System.out.println("잘못된 값을 입력하셨습니다"); break;
			}
		} while(menu !=7);		
	}
}
