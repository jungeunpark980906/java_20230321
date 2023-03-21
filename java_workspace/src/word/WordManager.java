package word;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class WordManager implements Program{
	
	ArrayList<Word> words = new ArrayList<>();
	//Map<String, ArrayList<String>> map = new HashMap<>();
	
	//이거는 하나의 영어에 여러가지의 뜻을 넣는 경우 사용!

	Scanner sc = new Scanner(System.in);
	@Override
	public void addWord() {
		System.out.println("영단어를 입력하세요: ");
		String word = sc.next();
		System.out.println(word + "의 뜻을 입력하세요: ");
		String mean = sc.next();
		//nextLine(): 공백을 포함하는 장문의 단어
		Word a = new Word(word, mean);
		words.add(a);
		
		
	}

	

	@Override
	public void printWord() {
//		//정렬
//		Collections.sort(words);
//			for(Word tmp : words) {
//			System.out.print(tmp.getWord() + tmp.getMean());
//			System.out.println();
//		}
//	}
	//정렬
	Collections.sort(words, new Comparator<Word>() {
	
		public int compare(Word o1, Word o2) {
			return o1.getWord().compareTo(o2.getWord());
		}
	} );
	
	//출력
	for(int i=0; i<words.size(); i++) {
		System.out.println(words.get(i));
	}

}
	

	@Override
	public void searchWord() {
		System.out.println("찾으실 영단어를 입력하세요: ");
		String word = sc.next();
		boolean b = false;
		for(int i = 0; i < words.size(); i++) {
			if(words.get(i).getWord().equals(word)) {
				String a = words.get(i).getWord();
				String c = words.get(i).getMean();
				System.out.println(a + c);
				b = true;
			}
		}
		if(b == false) {
			System.out.println("찾으시는 단어가 없습니다.");
		}
	}

	@Override
	public void updateWord() {
		System.out.println("수정할 영단어를 입력하세요: ");
		String word = sc.next();
		boolean b = false;
		for(int i = 0; i < words.size(); i++) {
			if(words.get(i).getWord().equals(word)) {
				System.out.println("업데이트할 영단어를 입력하세요: ");
				String newWord = sc.next();
				System.out.println("수정할 영단어의 뜻을 입력하세요: ");
				String newMean = sc.next();
				Word w = new Word(newWord, newMean);
				words.set(i, w);
				b = true;
			}
		}
		if(b == false) {
			System.out.println("입력하신 단어가 리스트에 없습니다.");
		}
	}

	@Override
	public void deleteWord() {
		System.out.println("삭제할 영단어를 입력하세요: ");
		String word = sc.next();
		boolean b = false;
		for(int i = 0; i < words.size(); i++) {
			if(words.get(i).getWord().equals(word)) {
				words.remove(i);
				b = true;
			}
		}
		if(b == false) {
			System.out.println("입력하신 단어가 리스트에 없습니다.");
		}
		
	}



	@Override
	public void printFile() throws IOException {
		
		
		FileWriter fw = new FileWriter("단어장.txt"); //true사용시 6번을 누를때마다 계속 저장
		
		for(int i=0; i<words.size(); i++) {
			fw.write(words.get(i).getWord()+" "+words.get(i).getMean()+"\r\n");
		}
		fw.close();
		
		BufferedReader br = new BufferedReader(new FileReader("단어장.txt"));

		while(true) {
			String line = br.readLine();
			if(line==null) break;
			System.out.println(line);
		}
		br.close();
	}


}
