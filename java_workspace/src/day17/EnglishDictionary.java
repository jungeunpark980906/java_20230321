package day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Word{
	private Map<String, ArrayList<String>> words = new HashMap<>();
	//하나의 영어 + 여러가지의 뜻을 넣는 사전 만들기
	//예) hello : 안녕, 아침인사, 반가움 등
	
	//단어 입력 메소드
	public void makeWord(Scanner sc){
		//y: 단어를 입력 n:종료
		//같은 단어는 등록x => 메시지 "이미 있는 단어입니다"
		char user = 'a'; 
		
		System.out.println("<< 단어등록을 시작합니다. >>");
		a:
		do{
			System.out.println("영단어를 입력하세요: ");
			String word = sc.next();
			for(String tmp : words.keySet()) {
				if(word.equals(tmp)) {
					System.out.println("이미 있는 단어입니다.");
					System.out.println("다른 단어를 입력하시겠습니까?");
					System.out.println("네 = 아무키 / 아니요 = n");
					user = sc.next().charAt(0);
					break a;
				}
			}
			
			System.out.println(word + "의 뜻을 입력하세요: ");
			String mean = sc.next();
			ArrayList<String> meanList = new ArrayList<>();
			meanList.add(mean);
			words.put(word, meanList);
			
			System.out.println("=== 단어가 등록되었습니다 ===");
			print();
			
			//=================의미 추가받을래?======================================
			
			System.out.println(word+"의 뜻을 더 추가 하시겠습니까?(y/n)");
			char is = sc.next().charAt(0);
			while(is != 'n'){
				if(is != 'y' && is != 'n'){
					System.out.println("y 또는 n을 입력해주세요.");
					is = sc.next().charAt(0);
					continue;
				} else if(is == 'y') {
					System.out.println(word + "의 뜻을 입력하세요: ");
					mean = sc.next();
					meanList.add(mean);
					System.out.println("=== 단어의 뜻이 등록되었습니다 ===");
					print();
					
					System.out.println(word+"의 뜻을 더 추가 하시겠습니까?(y/n)");
					is = sc.next().charAt(0);
					continue;
				}
			}
			
			//========================다른 영단어 추가할래?============================
			System.out.println();
			System.out.println("다른 영단어를 추가 하시겠습니까?");
			System.out.println("네=아무키 입력/ 아니요=n입력");
			user = sc.next().charAt(0);	
			
		} while (user != 'n');
	
	}
	
	//단어 출력 메소드
	public void print() {
		System.out.println("< 현재 등록된 단어 >");
		for(String tmp : words.keySet()) {
			System.out.println(tmp+ ": "+words.get(tmp));	
		}
		System.out.println("------------------------------");
	}
}