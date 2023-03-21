package day04;

public class 배열1 {

	public static void main(String[] args) {
		/* 배열: 같은 타입, 같은 의미를 가지는 변수들의 집합 (참조변수)
		 * - 배열선언방법
		 * 타입[] 배열이름; //이름 선언
		 * 타입 배열이름[];
		 * 
		 * - 선언 &초기화
		 * 타입[] 배열이름 = new 타입[길이]; // 가장 일반적인 방법
		 * (아무것도 없는 경우, 숫자는 0 글자는 공백으로 세팅해서 넣어져있음)
		 * 
		 * 타입[] 배열이름 = new 타입[]{값, 값, 값, 값, 값};
		 * ([]안에 길이를 정하지 않고, 바로 값을 넣어서 지정하는 경우 사용)
		 * 
		 * 타입[] 배열이름 = {값, 값, 값, 값, 값} ;
		 * (선언과 동시에 초기화가 가능한 경우=바로 사용하는 경우 사용)
		 * 
		 * - 배열의 시작번지는 0 !!! (인덱스는 0부터 시작)
		 *  배열[3] => 0 1 2
		 *  
		 * -배열의 길이는 무조건 0 이상!! (-는 안됌)
		 * 
		 * -배열 사용 이유
		 * 1. 반복문을 이용할 수 있기 때문에 편리
		 * 2. 관리가 용이
		 * 
		 * -배열의 마지막 번지 = 총길이-1 (배열이 0부터 시작)
		 * -배열의 총 길이를 구하는 메서드 : .length
		 *  
		 * */

		int arr1[];
		arr1 = new int[3];
		
		int[] arr2;
		arr2 = new int[3]; //초기 값 0
		
		int arr3[] = new int[5]; //5개의 영역이 생성
		
		int arr4[]= new int[] {1,2,3,4,5}; //초기값 1,2,3,4,5
		
//		int arr5[];
//		arr5 = {1,2,3,4,5}; (x)오류
		
		int arr6[] = {1,2,3,4,5};
		
		System.out.println(arr4); //arr4의 주소가 출력
		
		System.out.println(arr4[0]); //arr4의 0번지인 1이 출력
		System.out.println(arr4[1]); 
		System.out.println(arr4[2]); 
		System.out.println(arr4[3]); 
		System.out.println(arr4[4]); 
		
		for (int i=0; i<arr4.length; i++) {
			System.out.print(arr4[i] + " ");
		}
		
		
		
		System.out.println("arr3 출력");
		System.out.println(arr3[0]+" "); //[0]번지의 값은 0
		arr3[0] = 10; //arr3의 0번지의 값을 변경(담아라)
		System.out.println(arr3[0]+" "); //[0]번지의 값이 0->10으로 변경
		
		
		for (int i=0; i<arr3.length; i++) {
			arr3[i]=i+10;
			System.out.println(arr3[i]);
		}
		
		
		//arr1배열에 1,2,3을 저장하고 출력하시오
		for (int i=0; i<arr1.length; i++) { 
			// int i=0; i<arr1.length;인 이유: arr1.lengh가 0부터 ~ 실제길이-1까지이므로
			arr1[i] = i +1 ;
			System.out.print(arr1[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
