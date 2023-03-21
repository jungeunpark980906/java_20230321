package day13;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set01 {

	public static void main(String[] args) {
		/* Set 순서보장x 중복x
		 * HashSet 
		 * - 특징: index(번지)가 없음
		 * - get/set이 없음
		 * - 
		 * 
		 * 
		 * 
		 * */
		HashSet<String> set = new HashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("apple"); //순서가 없지만, 들어오는 순서에따라 같은 문자가 들어오면 먼저들어온 문자가 사라짐
		set.add("peach");
		set.add("홍길동");
		set.add("이순신");
		
		System.out.println(set);
		//출력시 순서없이 출력됨
		
		for(String tmp: set) {
			System.out.println(tmp + " ");
		}
		
		Iterator<String> it = set.iterator();
		while(it.hasNext());
			String tmp = it.next();
			System.out.println(tmp + " ");
		
	
	//set정렬 : 순서가 없어서 정렬이 안되기 때문에, set => list로 변환해서 정렬 -> 사용
	List<String> list = new ArrayList<String>(set);
	Collections.sort(list);
	
	System.out.println(list);
	
	//내림차순
	list.sort(new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			
			return o2.compareTo(o1);
		}
		
	});
	
	System.out.println(list);
	
	
	
	}
	
	
	
	
	
	
}
