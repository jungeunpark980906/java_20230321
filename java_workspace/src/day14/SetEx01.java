package day14;

import java.sql.Array;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetEx01 {

	public static void main(String[] args) {
		// 로또번호 출력 : Set이용(중복x,순서x)
		//random으로 생성 1~45 6개

		//Random 클래스 이용하는 방법
		//int a = new Random().nextInt(45)+1;
		Random r = new Random();
		
		
		TreeSet<Integer> set = new TreeSet<>();
		//TreeSet의 경우 : 자동 오름차순 정렬이 되어 출력
		
		while(set.size()<=6) {
			set.add(new Random().nextInt(45)+1);
		}
		System.out.println("로또번호 > ");
		System.out.println(set);
		
		//TreeSet<Integer> set = new TreeSet<>();으로 만들어 부모자리에 TreeSet넣어야 사용가능
		//TreeSet이용 -> 교재 p.665
		//첫번째 수 꺼내오기
		System.out.println(set.first());
		//첫번째 수 꺼내오고나서 소모(지우기) => 그 자리는 뒤의 수가 채우고 나머지는 공석
		System.out.println(set.pollFirst());
		System.out.println(set);
		//마지막 수 꺼내오기
		System.out.println(set.last());
		
		
//메소드에 하는 경우		
//		SetEx01 s = new SetEx01();
//		s.randomNum();
		

	}

	//번호를 랜덤으로 생성, 당첨번호 6개
	public void randomNum() {
		HashSet<Integer> set = new HashSet<>();
		while(set.size()<=6) {
			set.add(new Random().nextInt(45)+1);
		}
		System.out.println("로또번호 > ");
		for(Integer tmp: set) {
			System.out.print(tmp + " ");
		}
	}
	
	
	
	
}
