package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx01 {

	
	//저장공간 1.멤버변수
	private HashMap<String, String> map = new HashMap<>();
	Scanner scan = new Scanner(System.in);
	private int size = 5; //생성할때 생성자로 붙이는 것이 좋긴함
	
	public static void main(String[] args) {
		//< 단어장 > -> 메서드로 변경

		//출력구문은 main에서
		//단어장을 입력받는 기능
		//1. 저장 공간을 어디에 둘것인지 생각
		//	-1) 멤버변수(class의 공용변수로 있는 형태)
		//	-2) main (외부메서드에서 매개변수로 받는 형태)
		//	-3) 메서드 내부에 생성하여 반환 (리턴을 해주는 형태)
		
		//2. 매개변수와 리턴타입, 메서드명을 결정 => interface 생성
		

		
		MapEx01 ex = new MapEx01(); //map이 static이 아닌 인스턴스변수(메서드)라서 객체를 반드시 생성해야 접근 가능
	//저장공간 1.멤버변수	
//		ex.make();
//		Iterator it = ex.map.keySet().iterator(); 	
//		while(it.hasNext()) {
//			String word = (String)it.next();//key값 반환
//			String mean =ex.map.get(word);//value값 반환
//			System.out.println("단어: "+word+"의미: "+mean);
//		}

	//저장공간 2.main
//		ex.make2(ex.map);
//		Iterator<String> it = ex.map.keySet().iterator();
//		while(it.hasNext()) {
//			String word = (String)it.next();//key값 반환
//			String mean = ex.map.get(word);//value값 반환
//			System.out.println("단어: "+word+"의미: "+mean);
//		}
		
		
	//저장공간 3.
		HashMap<String, String> map1 = ex.make3();
		Iterator<String> it = map1.keySet().iterator();
		while(it.hasNext()) {
			String word = (String)it.next();//key값 반환
			String mean =map1.get(word);//value값 반환
			System.out.println("단어: "+word+"의미: "+mean);
		}
		
		
		
	}
	
	//저장공간 3.메서드
	
	//<메서드>
	//1. 멤버변수로 map이 있는 형태 (map=공용)
	// => 리턴과 받을것이 없음
	
	public void make() { //static을 쓰면 class의 멤버변수 사용x
		while(map.size()<size) {
			System.out.println("단어: ");
			String word = scan.next();
			System.out.println("뜻: ");
			String mean = scan.next();
			
			map.put(word, mean);
		}
	}
	
	//2. 외부에 map이 있는 형태 (매개변수로 map을 가져오기)
	public void make2(HashMap<String, String> map) {
		while(map.size()<size) {
			System.out.println("단어: ");
			String word = scan.next();
			System.out.println("뜻: ");
			String mean = scan.next();
			
			map.put(word, mean);
		}
	}
	
	//3. 메서드 내부에서 map을 생성하는 형태 (리턴이 map의 형태)
	public HashMap<String, String> make3() {
		HashMap<String, String> map = new HashMap<String, String>();
		while(map.size()<size) {
			System.out.println("단어: ");
			String word = scan.next();
			System.out.println("뜻: ");
			String mean = scan.next();
			
			map.put(word, mean);
		}
		return map;
	}
}
