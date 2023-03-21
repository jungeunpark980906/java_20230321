package day14;

import java.util.HashMap;
import java.util.Scanner;

public class Subject {
	static Scanner scan = new Scanner(System.in);
	HashMap<String, Integer> map = new HashMap<>();
	
	public static void main(String[] args) {
		/* map을 이용해서 성적관리 프로그램 생성
		 * >>menu
		 * 1.성적추가 (국어 97)
		 * 2.성적조회 (전체출력) : 합계/평균
		 * 3.성적조회(과목) : 서치 후 일치하는 과목 출력
		 * 4.과목수정 : 서치 후 수정
		 * 5.성적삭제
		 * 6.종료
		 * 
		 * 
		 * C(Create 생성)R(Read 읽기)U(Update 수정)D(Delete 삭제)
		 * */
		
		Subject s = new Subject();
		int order=0;
		

		while(true) {
			s.printMenu();
			order = scan.nextInt();
			if(order == 6) {
				break;
			}
			switch (order) {
			case 1: s.input(); break;
			case 2: s.printAll(); break;
			case 3: s.printSub(); break;
			case 4: s.corSub();	break;
			case 5: s.del(); break;
			default: System.out.println("메뉴를 잘못입력하셨습니다! 다시 입력하세유");
			}
						
		}		
		System.out.println("프로그램을 종료합니다~~!");

		
	}
	//<메서드>
	//메뉴 프린트
	public void printMenu() {
		System.out.println("======메뉴=======");
		System.out.println("1.성적추가");
		System.out.println("2.성적조회(전체)");
		System.out.println("3.성적조회(과목)");
		System.out.println("4.과목수정");
		System.out.println("5.성적삭제");
		System.out.println("6.종료");
		System.out.println("=================");
		System.out.println("메뉴를 선택해주세요 > ");
	}
	
	//성적추가
	public HashMap<String, Integer> input() {
		int i = 1;
		System.out.println("성적추가을 시작합니다!");
		while(true) {
			
			if(i == 0) {
				break;
			}
			System.out.println("과목명: ");
			String name = scan.next();
			System.out.println("해당과목의 성적: ");
			int price = scan.nextInt();
			
			map.put(name, price);
			
			System.out.println("(성적추가 종료:0, 지속:1)");
			i = scan.nextInt();
		}
		System.out.println("성적추가을 종료합니다!");
		return map;
	}
	
	//성적조회(전체)
	public void printAll() {
		int sum = 0;
		System.out.println("< 등록된 과목: 성적 >");
		for(String tmp : map.keySet()) {
			System.out.println(tmp+ ": "+map.get(tmp));	
			sum += map.get(tmp);
		}
		System.out.println("<전과목 합계>");
		System.out.println(sum);
		System.out.println("<전과목 평균>");
		System.out.println((double)sum/map.size());
	}
	
	//성적조회(과목)
	public void printSub() {
		System.out.println("성적조회 할 과목을 적어주세요: ");
		String sub = scan.next();
		Integer score1 = map.get(sub);
		if(score1 == null) {
			System.out.println(sub+"는 없는 과목입니다!");
		}else {
		System.out.println(sub+":"+score1);
		}
	}
	
	//과목수정
	public void corSub() {
		System.out.println("과목 수정할 과목을 적어주세요: ");
		String sub = scan.next();
		
		Integer score1 = map.get(sub);
		if(score1 == null) {
			System.out.println(sub+"는 없는 과목입니다!");
			return;
		}else{
			System.out.println("수정할 점수를 적어주세요!");
			int score = scan.nextInt();
			
			if(score < 0 || score > 100){
				System.out.println("잘못된 점수입니다!");
				return;
			} else {
				System.out.println("<수정된 현재과목>");
				map.put(sub, score);
				System.out.println(sub+":"+map.get(sub));
				System.out.println("수정완료!");
			}	
				
		}
	}
	
	//성적삭제
	public void del() {
		System.out.println("삭제할 과목을 입력해주세요: ");
		String sub = scan.next();
		if(map.get(sub)==null) {
			System.out.println(sub+"는 없는 과목입니다");
		} else {
			map.remove(sub);
			System.out.println("삭제함!");
		}

	}
}
