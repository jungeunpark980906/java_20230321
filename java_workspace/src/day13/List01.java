package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List01 {

	public static void main(String[] args) {
		/* 하루 일과를 저장하는 list 생성
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */

		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("일어나기");
		list.add("도시락 준비하기");
		list.add("학원가기");
		list.add("수업듣기");
		list.add("점심먹기");
		list.add("수업듣기");
		list.add("하원하기");
		list.add("저녁먹기");
		list.add("도시락통 준비하기");
		list.add("복습하기");
		list.add("자기");
		
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp + " ");
		}
		
		System.out.println("==============================");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("==============================");
		
		for(String tmp : list) {
			System.out.println(tmp + " ");
		}
		
		System.out.println("==============================");
		
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("==============================");
		
		//외부 구현시,
		list.sort(new Test());
		System.out.println(list);
		
		
	}

}

class Test implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		//compareTo 메서그를 활용
		return o1.compareTo(o2); //오름차순
		//return o2.compareTo(o1); //내람차순
		
	}
	
	
}
