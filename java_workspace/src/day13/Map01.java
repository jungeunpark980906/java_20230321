package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map01 {

	public static void main(String[] args) {
		/* Map
		 * - 값을 2개 저장  key/ value 값으로 저장
		 * - key는 중복불가, value는 중복가능
		 * - HashMap을 가장 많이 사용
		 * 
		 * HashMap<String, Integer> map = new HashMap<String, Interger>();
		 * Map운 값이 2개여서 Iterator를 사용할 수 없음
		 * Map = Set으로 변경 후 출력
		 * 
		 * 
		 *<추가방법>
		 * lisr, set=> .add();
		 * map=> .put();
		 * 
		 * <추출방법>
		 * getKey / getValue
		 * 
		 * 
		 * 
		 * 
		 * */
		HashMap<String, Integer> map = new HashMap<>();
		map.put("햄버거", 7000);
		map.put("피자", 15000);
		map.put("음료", 2000);
		map.put("과자", 2000);
		map.put("사탕", 500);
		map.put("사탕", 700);
		
		System.out.println(map); //순서x, key가 같으면 먼저있던 값 사라짐 (value는 상관x)
		System.out.println(map.keySet());//key값
		System.out.println(map.values());//value 값
		
		//key = 햄버거인 값 출력 (key값을 index라고 생각하셈!)
		System.out.println(map.get("햄버거"));
		
		//요소 출력(key기준) - key를 가지고 value에 접근
		System.out.println("=====Iterator=====");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+ ": " + map.get(key));
		}
		
		System.out.println("=====향상된 for문=====");
		for(String tmp : map.keySet()) {
			System.out.println(tmp+ ": "+ map.get(tmp));
		}
		
		//entrySet() : 대괄호로 map을 보여줌 (대괄호 = 2가지의 값을 가진 map임을 보여줌)
		System.out.println(map.entrySet());
		
		for(Map.Entry<String, Integer> tmp : map.entrySet()) {
			System.out.println(tmp.getKey()+ ": " + tmp.getValue());
		}
		
		
		//총가격 출력
		int sum = 0;
		for(String tmp : map.keySet()) {
			sum += map.get(tmp);
		}
		System.out.println("총 합계는 " + sum);
		
		
		

	}

}
