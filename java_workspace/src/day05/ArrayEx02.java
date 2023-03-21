package day05;

public class ArrayEx02 {
	
	public static void main(String[] args) {
	
		//1~10까지 담고 있는 배열을 담아 출력
		
	int size = 10;
	int[] arr = new int[size];
	
	
	
	for (int i=0; i<arr.length; i++) {
		arr[i] = (i+1);
		System.out.print(arr[i]+" ");
				
	}
	
	//--------------------------------------랜덤하게 섞어보기--------------------------------
	
	
	
//	  int a = 10; 
//	  int b = 20; 
//	  int c = a; //임시로 c만들고
	  
//	  a = b;
//	  b = c; 
//	  System.out.println("a: " + a + ", b: " +b);
	 
	
	
	
	
//배열을 섞는 코드 : random이용
	System.out.println( );
	//실 데이터를 덮어쓰기 전, 데이터를 유지하기 위해 임시 번지 사용
	//방법 : 랜덤한 번지(0~arr.length)를 선택해서 다른 번지와 교환
	
	int min = 0;//시작번지
	int max = arr.length; //10개 (배열의 길이)
	int random = 0;
	
	
//배열 섞기
	for (int i=0; i<arr.length; i++) { //첫번째 교환 대상
		random = (int)(Math.random()*max)+min;
		int tmp = arr[i]; //0번지의 값이 tmp로 이동
		arr[i] = arr[random]; //랜덤 번지값이 0번지로 이동
		arr[random] = tmp; //랜덤 번지에 0번지의 값 이동 // 교환완료
	}
	
	System.out.println("----섞은 후----");
	
	for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	
	
//--------------------------------섞인 배열 정렬하기------------------------------------------
	
	
	
	// 오름차순 정렬 : 작은 수 부터 앞으로 오도록 정렬
	// 내림차순 정렬 : 큰 수 부터 앞으로 오도록 정렬
	
//1. 오름차순 
	//1번지 수와 0번지 수 비교 -> 0번지 수가 마지막 번지까지 순서대로 비교 (pass1) : 반복
	
	System.out.println( );
	
	for (int i=0; i<arr.length-1; i++) { //0~9번지 중 8번지까지 
		for (int j=i+1; j<arr.length; j++) { //0~9번지 중 9번지까지
			if( arr[i] > arr[j]) { //내림차순은 arr[i] < arr [j]
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				}
		}
	
	}
	System.out.println("----오름차순 정렬 후----");
	for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+ " ");
	}
	
	
//2. 내림차순
	System.out.println( );
	
	for (int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if( arr[i] < arr[j] ) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
	}
	System.out.println("----내림차순 정렬 후----");
	for (int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+ " ");
	}
	
	
//3.
	System.out.println( );
	System.out.println("----------------------------");
	for (int i=0; i<arr.length; i++) {
		arr[i] = (int)(Math.random()*45)+1;
		System.out.print(arr[i]+" ");
	}	
	for(int j=0; j<arr.length-1; j++) {
		for (int k=j+1; k<arr.length; k++) {
			if(arr[j] > arr[k]) {
				int tmp = arr[j];
				arr[j] = arr[k];
				arr[k] = tmp;
			}
		}
	}
	
	
	
	System.out.println( );
	System.out.println("섞고 정렬하면,");
	for (int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+ " ");
	}
	
	
//4. 향상된 for문
	System.out.println( );
	for (int tmp : arr) { //임시변수 tmp에 arr에 있는 하나씩 순서대로 변수를 넣는다
		System.out.print(tmp+" "); //arr에 하나씩 넣은 걸 순서대로 출력함
		
	}
	//무조건 0번지부터 마지막 번지까지 순차 탐색을 하는 동안 사용하여 출력.
	//int tmp이므로 arr도 int
	
	
	
	
	
	
	
	}
	
}
