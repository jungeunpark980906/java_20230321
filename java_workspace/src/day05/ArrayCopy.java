package day05;

public class ArrayCopy {

	public static void main(String[] args) {
		/* 3개의 값을 담을 수 있는 String배열 생성 후
		 * 국어, 영어, 수학이라는 글자를 담은 후 출력.
		 * 
		 * 배열은 길이를 가지고 있음.
		 * 한번 정해진 길이는 추가/삭제가 불가능.
		 * 배열의 길이를 늘리거나, 줄이고 싶은 경우 배열복사 ArrayCopy를 이용
		 * */
		
		
		int size = 3;
		String arr[] = new String[size];
		arr[0] = "국어";
		arr[1] = "영어";
		arr[2] = "수학";
		
		
		for(String tmp : arr) { //향상된 for문
			System.out.print(tmp + " ");
		}
	
//사회, 과학 추가하고 싶어요!
		
//		String arr2[] = arr; //하나의 객체를 공류
//		System.out.println(arr);
//		System.out.println(arr2); //주소가 동일
		
		System.out.println( );
		
		String arr2[] = new String[6];
		for ( String tmp : arr2) {
			System.out.print(tmp+ " ");
		}
		//옮기기 전, 결과: null null null null null 		
		
		
		System.out.println( );
		for(int i=0; i<arr.length; i++) {
			arr2[i] = arr[i];
					
		}
		
		for ( String tmp : arr2) {
			System.out.print(tmp+ " ");
		}
		//옮긴 후, 결과: 국어 영어 수학 null null null
		
		
		
//arraycopy이용하는 방법
		
		System.out.println( );
		String arr3[] = new String[arr.length*2];//길이를 모르는 경우 사용
		
		//System.arraycopy(복사할 배열, 시작번지, 새배열, 시작번지, 개수);
		System.arraycopy(arr, 0, arr3, 1, arr.length); 
		//arr에 있는 0번지 정보부터 전부넣는데, arr3의 1번지부터 넣어주세요.
		//결과: null 국어 영어 수학 null null 
		
		for ( String tmp : arr3) {
			System.out.print(tmp+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
