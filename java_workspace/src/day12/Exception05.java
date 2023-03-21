package day12;

public class Exception05 {

	public static void main(String[] args) {
		//try
		int arr[] = null; // null의 상태
		int max=10, min=1, size=5;
		Exception05 ex05 = new Exception05();
		
		try {
			int arr1[] = ex05.createArr(max, min, size);
			ex05.createArr2(max, min, arr);
			
			
			
				
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("계산종료");
		
		
		
		
		
	}

	//메서드 생성
	//기능: 배열의 길이가 주어지면 주어진 길이만큼 배열을 생성해서 배열을 돌려주는 메서드
	//값은 random으로 반환
	//random의 범위는 max, min으로 결정 (매개변수 max, min)
	//예외발생 : 사이즈가 0보다 작다면 예외발생 , max가 0보다 작다면 예외발생
	//throw
	
	public static int[] createArr(int max, int min, int size) {//static을 안붙이면 인스턴스 메서드임
		
		int arr[] = new int[size];
		
		if(size <= 0 ) {
			throw new RuntimeException ("size는 0보다 작을 수 없습니다.");	
		}
		if(max <= 0) {
			throw new RuntimeException ("랜덤 범위가 0보다 작을수 없습니다.");
		}
		
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*(max-min+1))+1;
		}
		

		return arr;
	}
	

	
	//배열을 받아서 배열에 랜덤값을 체우는 메서드 (배열은 main에서 주어짐)
	//예외발생: 배열의 길이가 null일 경우, 0보다 작은 경우는 예외
	//random의 범위는 max, min
	
	public static void createArr2(int max, int min, int[] arr) {
		
		
		if(arr == null) {
			throw new RuntimeException ("배열의 길이가 null입니다");	
		}
		if((arr.length) < 0 ) {
			throw new RuntimeException("배열의 길이가 0입니다.");
		}
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*(max-min+1))+1;
		}

	}
	
	
	
	
	
	
}
