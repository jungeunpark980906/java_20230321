package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class 과제1_1 {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		
		int size = 5;
		
		
		while(map.size() < size) {
			System.out.println("단어: ");
			String word = scan.next();
			System.out.println("뜻: ");
			String mean = scan.next();
			//private로 선언된 경우, ex.getMap.keySet().iterator();로 실행
			
			map.put(word, mean); //map.size() 증가
			
		}
		
		for(String tmp: map.keySet()) {
			System.out.println(tmp + ": "+map.get(tmp));
		}
		
		//<자료형>을 안한 경우, 아래에 (자료형)변환 필요!
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			String word = (String)it.next();//key값 반환
			String mean = map.get(word);//value값 반환
			System.out.println("단어: "+word+"의미: "+mean);
		}
		

	}

}
