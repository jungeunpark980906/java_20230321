package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class collection01 {

	public static void main(String[] args) {
		/* 컬렉션 프레임워크 : 표준화된 방식의 자료구조
		 * List, Set, Map
		 * 데이터를 묶어서 관리하는 경우 사용
		 * 주로 배열대신 사용
		 * 
		 * List : 배열과 동일 -> 인터페이스
		 * - 값을 하나씩 저장
		 * - 순서를 보장 
		 * - 중복을 허용
		 * - 가장 많이 사용
		 * - 배열 대신 가장많이 사용
		 * 
		 * Set
		 * - 값을 하나씩 저장
		 * - 순서를 보장하지x = index라는 번지가 없음
		 * - 중복 허용 X
		 * - 
		 * 
		 * Map
		 * - 값을 두개 저장, key/value  쌍으로 저장
		 * - key는 중복이 불가
		 * - value 는 중복가능
		 * - key가 중복되면 덮어쓰기가 됨
		 * - 아이디/ 패스워드처러 마하나의 자료로 저장해야 할 경우에 사용
		 * 
		 * int arr[]; : 배열은 기본자료형 사용 가능
		 * collection 에서는 어떤 클래스로 데이커를 관리할지 지정해야함!
		 * 
		 * 
		 * 자료형들은 첫글자만 대문자로 변환해서 클래스로 사용 : String, Byte, Boolean..
		 * but!! (int -> Integer)
		 * - 클래스를 지정하지 않으면 Object가 자동으로 들어감
		 * 
		 * 
		 * 
		 * */

		//List list = new List(); // error
		List list1 = new ArrayList(); //class를 지정하지 않아서 Object class가 자동지정되어있음
						//자식리스트
		ArrayList list2 = new ArrayList(); ///class를 지정하지 않아서 Object class가 자동지정
		
		//숫자만 가능한 ArrayList 생성
		ArrayList<Integer> list = new ArrayList<Integer>();
		//문자열만 가능한 ArrayList 생성
		ArrayList<String> list3 = new ArrayList<String>();
		
		
		//add() : 요소를 추가
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		System.out.println(list.toString());
		
		//size() : list의 총 개수
		System.out.println(list.size() + "개");
			
			//list3에 문자열을 10개 넣고 총 개수 확인해보기
			list3.add("가");
			list3.add("나");
			list3.add("다");
			list3.add("라");
			list3.add("마");
			list3.add("바");
			list3.add("사");
			list3.add("아");
			list3.add("자");
			list3.add("차");
			
			System.out.println(list3.size() + "개");
			
				
			//리스트 하나를 생성하고 1~10까지 저장한 후 출력
			//ArrayList<Integer> list5 = new ArrayList<Integer>();	
			ArrayList<Integer> list5 = new ArrayList<>(); //Integer을 생략해도 가능
			int size = 10;
			for(int i=0; i<=size; i++) {
				list5.add(i+1);
			}
			System.out.println(list5);
			//list는 넣는대로 늘어나기때문에 size을 넣어주는 것이 좋음
			
			for(int i=0; i<=size; i++) {
				list5.add(i+1);
			}
			System.out.println(list5);
			//배열처럼 덮어쓰기x , 넣은 그대로 그 뒤로 늘어나서 추가됨
			
			
	//==================================================================================		
			
		//get(index) : index번지의 값을 가져오기
		System.out.println(list5.get(1));
			
		//set(index,값) : index번지의 값을 넣어 바꾸세요(변경)
		System.out.println(list.set(2, 0));
		System.out.println(list.get(2));
		
		// list의 값 삭제하기
			//1) remove(index) : index 번지 값 삭제
			list5.remove(1); //1번지 삭제
			System.out.println(list5);
			
			//2) remove(object) : object 값으로 넣으면 값으로 삭제
			Integer a =10;
			list5.remove(a);	
			System.out.println(list5);
				
		//contains(Object) : list에 값이 있는지 검사 => 있는경우 true, 없는 경우 false	
		System.out.println(list5.contains(a));
				
			
		//clear() : list삭제
		list5.clear();
		System.out.println(list5);
			
		//isEmpty() : list가 비어있는지 확인 => 비어있는 경우 true
		System.out.println(list.isEmpty());
		
		
		
		for(int i=5; i>0; i--) {
			list5.add(i);
		}
		
		//list5에 for문으로 1~5까지만 입력
		//list5 요소출력
		for(int i=0; i<list5.size(); i++) {
			System.out.print(list5.get(i)+" ");
		}
		
		
		for(int tmp : list5) {
			System.out.print(tmp + " ");
		}
		
		System.out.println();
		
		//Iterator : 컬렉션을 출력하기 위해 사용
		/* list는 순서를 보장하기 떄문에 get(i)를 이용하여 원하는 번지에 접근이 가능
		 * set은 순서를 보장하지 않기 때문에 for문을 이용할 수 없음
		 * 향상된for, Iterator 처럼 순서와 상관이 없이 값을 가져올 수 있는 구문에서 출력이 가능
		 * 
		 * */
		
		
		//Iterator 출력방법
		Iterator<Integer> it = list5.iterator();
		while(it.hasNext()) { //다음요소가 있는지 체크, 값이 있으면 true
			Integer tmp = it.next(); //next()의 다음요소 가져오기
			System.out.print(tmp + " "); //출력
		}
		
		
		//indexOf(값) : 해당 값의 list index번지를 반환 / 없다면 -1리턴
		System.out.println();
		System.out.println("indexOf > ");
		
		Integer b = 5;
		System.out.println(list5.indexOf(b));
		
		
		//내림차순 /  오름차순
		
		//Collections.sort(); : 오름차순 정렬(작은수부터)
		//Collections.sort(list5);//오름차순 정렬만 가능
		//System.out.println(list5);
		
		//=========================================================
		
		//sort(객체)
		//- 객체: Comparator 인터페이스를 구현한 객체를 넣어야함 (익명클래스 사용)
		//- 비교:(Compare) 메서드를 사용하여 객체를 생성 
		
		//내림차순 이용시 사용!
		list5.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				//o1-o2 : 오름차순, o2-o1 : 내림차순
				return o1-o2; //+면 오름차순으로 -는 내림차순으로 이용
			}
		});
		System.out.println(list5);
	}
		
}
