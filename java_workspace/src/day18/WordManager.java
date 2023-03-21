package day18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import word.Word;

public class WordManager {
	Scanner sc = new Scanner(System.in);
	
	private ArrayList<Word> list = new ArrayList<>();
	
	public void printMenu() {
		System.out.println("=============단어장============");
		System.out.println("1.단어등록 | 2.단어검색  | 3.단어수정");
		System.out.println("4.단어출력 | 5.파일로출력 | 6.단어삭제 ");
		System.out.println("=============================");
	
	}
	public void addWord() {
		list.add(new Word("hello","안녕"));
		list.add(new Word("hi","반가워"));
		list.add(new Word("bye","잘가"));
		list.add(new Word("haha","하하"));
		list.add(new Word("smile","웃음"));
	}
	
	public void insertWord() {
		System.out.println("단어입력: ");
		String word = sc.next();
		System.out.println("의미입력: ");
		String mean = sc.next();
		
		list.add(new Word(word,mean));
		
	}
	
	public void searchWord() {
		System.out.println("검색단어 입력: ");
		String word = sc.next();
		for(Word w:list) {
			if(w.getWord().equals(word)) {
				System.out.println("검색결과>");
				System.out.println(w);
				return;
			}
		}
		System.out.println("검색 결과가 없습니다.");
	}
	
	public void modifyWord() {
		System.out.println("수정단어 입력: ");
		String word = sc.next();
		for(Word w:list) {
			if(w.getWord().equals(word)) {
				System.out.println("수정할 의미: ");
				String mean = sc.next();
				w.setMean(mean);
				System.out.println("수정이 완료되었습니다"+w);
				return;
			}
		}
		System.out.println("단어가 없습니다.");
	}
	
	public void printWord() {
		System.out.println("단어출력");
		for(Word w:list) {
			System.out.println(w);	
		}
	}
	
	public void fileWord() throws IOException {
		FileWriter fw = new FileWriter("단어장.txt"); //true사용시 6번을 누를때마다 계속 저장
		BufferedWriter bw = new BufferedWriter(fw); //성능 향상을 위해 사용(큰단위 사용)

		StringBuffer sb = new StringBuffer(); //묶어서 보내야 부하가x (List처럼 한번에 모와보내기)
//		String data = null;
		int cnt = 0;
		while(cnt<list.size()) {
			sb.append(list.get(cnt));
			sb.append("\r\n");
			cnt++;
		}
//		data = sb.toString();
//		System.out.println(data);
		System.out.println(sb.toString());
//		fw.write(data);
		fw.close();
		bw.close();
		
	}
	
	public void deletWord() {
		System.out.println("삭제할 단어: ");
		String word = sc.next();
		boolean b = false;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getWord().equals(word)) {
				list.remove(i);
				b = true;
			}
		}
		if(b == false) {
			System.out.println("입력하신 단어가 리스트에 없습니다.");
		}
	}
	
	
	
	
}
