package day14;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx02 {

	public static void main(String[] args) {
		
		int[] score = {80, 98, 45, 95, 62, 57, 90};
		TreeSet<Integer> set = new TreeSet<>(); 
		
		//점수들 중 가장 큰 점수와 가장 작은 점수 출력
		
		for(int i=0; i<score.length; i++) {
			set.add(score[i]);
		}
		
		System.out.println(set);
		System.out.println("가장 작은 점수: "+set.first()); // 가장 앞에 있는 값
		System.out.println("가장 큰 점수: "+set.last()); // 가장 뒤에 있는 값
		
		System.out.println("==================================");
		//headSet : 지정된 객체보다 작은 값 출력, tailSet: 지정된 객체보다 큰값 출력
		System.out.println(set.tailSet(80));//80보다 큰 값 (뒤에 있는 값)
		System.out.println(set.headSet(80));//80보다 작은 값(앞에 있는 값)
	
		//subSet(a,b) : a포함,b미포함! 두 수의 범위 안에 있는 값
		System.out.println(set.subSet(70, 90)); //70~89사이의 값
		
		//<내림차순 Set>
		NavigableSet<Integer> desSet = set.descendingSet();
		System.out.println(desSet);
		
		
	}

}
