package day05;

public class ArrayEx01 {
	
	public static void main(String[] args) {
	// 6개의 값을 가지는 배열을 생성한 후, 1~45사이의 랜덤 값을 저장 출력 (랜덤 로또번호)
		
	int size = 6;
	int[] arr = new int[size];
	int dice = 0;
	
	
	for (int i=0; i<arr.length; i++) { //for배열의 index 탐색
		dice=(int)(Math.random()*45)+1; 
		arr[i] = dice; //랜덤값 배열에 지정
		System.out.print(arr[i]+" ");
		
		
		
		
	}
	
	
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
	
