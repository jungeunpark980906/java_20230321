package day05;

import java.util.Scanner;

public class StringEx01 {

	public static void main(String[] args) {
		/* 5개의 파일명이 주어졌을떄, 원하는 단어를 입력하면 입력한 단어가 있는 
		 * 파일들을 출력하도록 코드를 작성.
		 * 
		 * ex) java =>  java가 포함된 java의 정석.txt, 이것이 java다.jpg, java의 정석 표시.jpg
		 * */
		
		
		String[] fileName = {"java의 정석.txt", "이것이 java다.jpg", "String 메서드.txt", 
				"String 함수.jpg", "java의 정석 표시.jpg"};
		

		Scanner scan =  new Scanner(System.in);
		
		System.out.println("검색할 단어를 입력해주세요.: ");
		String word = scan.next();
		System.out.println("---검색 값 : " + word + "---");
		int cnt = 0;
		
//		for (int i=0; i<fileName.length; i++) {
//			if (fileName[i].contains(word)) {
//				System.out.println(fileName[i]);
//				cnt++;
//			} 
		for (String tmp : fileName) {
			if (tmp.contains(word)) {
				System.out.println(tmp);
				cnt++;
		}
			
		
		}
		if (cnt == 0) {
			System.out.println("찾으시는 단어를 포함한 파일이 없습니다.");
		}
		
		

		
		scan.close();
		
		
		
		
		
		
		
		
	}

}
