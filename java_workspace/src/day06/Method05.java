package day06;

public class Method05 {

	public static void main(String[] args) {
		// 2~100까지의 소수를 출력
		//Method는 소수가 맞는지 확인하는 메서드

		//for문을 돌려서 isPrime이 true면 출력
		
		
	
//
//		for(int num=2; num<=100; num++) {
//			if(isPrime(num)== true ){
//				System.out.print(num + " ");
//			}
//		}
		int sum = 0;
		for (int i=2; i<=100; i++) {
			if(isPrime(i)) {
				System.out.print(i +" ");
				sum+=i;
			}
		}
		System.out.println( );
		System.out.println("------소수의 합계------");
		System.out.println(sum);
		
		
	}

	//기능: 정수가 주어지면 정수가 소수인지 아닌지 판별 (소수면 true, 아니면 false)
	//리턴타입: 소수 - 1과 자기자신만을 약수로 가지는 수
	//매개변수: 숫자 => int num
	//메서드명:isPrime (무언가를 판별할경우 앞에 is)
	public static boolean isPrime (int num) {
		
	
		int cnt = 0;
		
		for(int i=1; i<=num; i++) {
			if((num % i) == 0) {
				cnt++; //약수의 개수
				
			}
		}
		if( cnt == 2 ) {
			return true;
		} else {
			return false;
		}
		//for문안에 return이 들어가 있는 경우 error
		// -> for문을 못타는 경우를 위해서 for문밖에 return false; 입력 필요
		
		
	}
		
	
	
}
