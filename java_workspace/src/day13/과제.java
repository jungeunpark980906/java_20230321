package day13;

import java.util.HashMap;
import java.util.Iterator;

public class 과제 {

	public static void main(String[] args) {
		/* 단어장 단어:의미 => hello:안녕
		 * 
		 * 5개의 단어를 입력하고, 단어장을 출력
		 * 
		 * */

		HashMap<String, String> map = new HashMap<>();
		map.put("hello", "반가워");
		map.put("bye", "잘가");
		map.put("nice", "멋져!");
		map.put("cool", "시크해!");
		map.put("cute", "귀여워!");
		
		System.out.println("<단어장>");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+ ": " + map.get(key));
		}
		
		
		
	}

}
