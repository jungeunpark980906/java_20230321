package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class LambdaEx02 {

	public static void main(String[] args) {
		/* Stream(스트림) : 자료의 대상과 관계없이 동일한 연산을 수행할 수 있도록 해주는 반복자
		 * - 요소가 하나씩 흘러가는 형태로 처리
		 * - 스트림을 생성하여 연산을 수행하면 스트림이 소모가 됨 -> 재사용이 불가
		 * - 다른 연산을 사용하려면 스트림을 다시 생성
		 * 
		 * - number를 복제하여 사용 -> number에 영향을 주지 않음 ( 기존자료에 변경x )
		 * 
		 * - 중간연산 : filter(조건에 맞는 요소 추출)
		 * - 최종연산 : sum(), forEach()
		 * 
		 * */
		
		Stream<Integer> integerStream1 = Stream.of(1,2,3,4,5,6,7,8,9);
		
		int[] arr = {1,2,3,4,5};
		
		//count()
		long count = Arrays.stream(arr).count(); //리턴이 long
		System.out.println(count);
		
		//sum()
		int sum = Arrays.stream(arr).sum(); //리턴이 Integer
		System.out.println(sum);
		
		//average()
		OptionalDouble avg = Arrays.stream(arr).average(); //리턴이 OptionalDouble
		System.out.println(avg);
		
		
		//성적배열 a에서 70점 이상인 점수만 합계를 구하시오.
		int a[] = {10,20,30,40,50,60,70,80,90};
		int sum1 = 0;
		
		//java
		for(int i=0; i<a.length; i++) {
			if(a[i]>=70) {
				sum1 += a[i];
			}
		}
		System.out.println("java구현 sum: "+sum1);
		//Stream
		int sum2 = Arrays.stream(a).filter(b->b>=70).sum(); //매개변수 b를 가져와서 b는 70이상
		System.out.println("Stream구현 sum: "+sum2);
		
		
		//성적리스트에서 70점 이상인 점수만 합계구하기.
		List<Integer> aList = new ArrayList<>();
		for(Integer tmp : a) {
			aList.add(tmp);
		}
		int sum3 = 0;
		
		//Steam
		int listSum = aList.stream().filter(b->b>=70).mapToInt(n->n.intValue()).sum();
		System.out.println("list합계: ");
		System.out.println(listSum);
		
		Stream<Integer> s = aList.stream();
		s.filter(b->b>=70).forEach(System.out::println);
		
		Stream<Integer> s1 = aList.stream();
		int s1Sum = s1.mapToInt(n->n.intValue()).filter(b->b>=70).sum();
		System.out.println(s1Sum);
		
		
		
	}

}
