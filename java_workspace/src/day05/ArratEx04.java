package day05;

public class ArratEx04 {

	public static void main(String[] args) {
		/* 2차원 배열
		 * 자료형 배열명[][] = new 자료형[길이][길이];
		 * */

		int arr[][] = new int[5][3];//행개수5개, 열개수3개
		int cnt = 1;
		
		//행
		for (int i=0; i<arr.length; i++) { //0번지~4번지 5개의 행
			for(int j=0; j<arr[0].length; j++) { //0번째 행에 있는 열의 개수
			arr[i][j] = cnt;
			cnt++;
			System.out.printf("%3d",arr[i][j]); //%3d는 3칸을 차지해서 넣어주세요
			}
			System.out.println( );
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
