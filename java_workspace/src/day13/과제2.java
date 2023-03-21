package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class 과제2 {

	public static void main(String[] args) {
		/* 과목과 점수를 입력받아 출력,합계,평균출력
		 * 종료키워드가 나올떄까지 반복
		 * 
		 * 국어89
		 * 수학97
		 * n 은 종료
		 * 
		 * 입력받은 map출력후,
		 * 합계=
		 * 평균=
		 * 
		 * 
		 * */

		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		
		String sub;
		int score;
		char ch='a';
		
		int sum=0;
		int cnt = 0;
		//cnt말고 map.size()이용가능!
		
		
		while (true) {
			if(ch == 'n') {
				break;
			} else if(ch != 'n') {
				System.out.println("과목을 입력해주세요 >");
				sub = scan.next();
				System.out.println("해당 과목의 점수를 입력해주세요 >");
				score = scan.nextInt();
				
				map.put(sub, score);
				cnt++;
				
				System.out.println("종료 = n, 계속 입력 = 아무 문자입력");
				ch = scan.next().charAt(0);
			}

		}
//		System.out.println("종료되었습니다!");
//		System.out.println("입력하신 과목과 점수: ");
//		for(String tmp : map.keySet()) {
//			System.out.print(tmp + ": " + map.get(tmp));
//		}
//		for(String tmp : map.keySet()) {
//			sum += map.get(tmp);
//		}
//		System.out.printf("전과목 합계: %d, 전과목 평균: %.2f",sum,(double)(sum/cnt));

		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String sub1 = it.next();
			score = map.get(sub1);
			sum += score;
			System.out.println(sub1+": "+score);
		}
		
		
		
	}

}
