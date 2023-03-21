package day17;

import java.util.Arrays;
import java.util.stream.Stream;

public class streamEx02 {

	public static void main(String[] args) {
		/* 배열에서 짝수만 출력(정렬)
		 * 중복되는 값은 삭제 
		 * */
		
		int[] arr = {1,2,3,4,5,6,7,8,9,1,2,3,4,5};
		
		System.out.println("--짝수만 출력--");
		Arrays.stream(arr).filter(n->(n%2==0)).forEach(System.out::print);
		
		System.out.println();
		System.out.println("--짝수 + 중복제거--");
		Arrays.stream(arr).filter(n->(n%2==0))
			.distinct().forEach(System.out::print);
		
		//짝수 배열로 담기
		int res[] = Arrays.stream(arr).filter(n->(n%2==0))
						.distinct().sorted().toArray();
		
		for(int tmp : res) {
			System.out.print(tmp+" ");
		}
		
		
		
		
		
	}

}
