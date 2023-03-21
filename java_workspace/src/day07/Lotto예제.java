package day07;

public class Lotto예제 {

	public static void main(String[] args) {
		/* 로또번호를 생성 (1~45까지 랜덤으로 당첨 번호를 생성)
		 * 사용자번호 : 내가 찍는 1~45까지의 6개 숫자 (Scanner)
		 * 당첨번호 : 랜덤으로 되는 1~45까지의 7개의 숫자 = 기본 6개 + 2등 보너스 1개(마지막에 생성된 번호) (자동)
		 * 사용자번호,당첨번호 배열2개 필요
		 * 
		 * 사용자번호,당첨번호를 랜덤으로 발생시켜 로또의 등수를 확인
		 * 등수 : 1등~5등?
		 * (while문으로 횟수확인해보기)
		 * */

		
		//실제 배열은 main에서 생성 = 매개변수로 받아 채우기
		int lotto[] = new int[7]; //당첨번호
		int user[] = new int[6];
		
		
		
		
		
		randomArr(lotto);
		randomArr(user);
//		
		System.out.println("====당첨번호====");
		randomPrint(lotto);
		
		System.out.println();
		System.out.println("====유저번호====");
		randomPrint(user);
		
		System.out.println();
		int rank = lottoRank(lotto, user);
		if (rank == -1) {
			System.out.println("꽝");
		} else {
			System.out.println(rank+"등 당첨!");
		}
		
		

		
		
		
		
		
		
		
	}

	//1. 메서드: 번호를 랜덤으로 생성해주는 기능 (자동으로 발생되는 당첨번호 7개) -> 랜덤번호 1개 생성
	//리턴: int / 매개변수: x / 메서드명: randomMaker
	public static int randomMaker( ) {
	
		return (int)(Math.random()*10)+1;
		
	}
	

	
	
	//2. 메서드: 랜덤 번호를 배열에 담아주는 기능 -> 배열을 랜덤번호로 완성
	//리턴 : void /  매개변수 : int / 메서드명: randomArr
	public static void randomArr( int arr[] ) {
//		//중복상관없이 담기
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = randomMaker();
			//중복체크를 해서 이전에 담은 랜덤값이 중복되지 않았다면 채우기
			
//		}
		
//		for(int i=0; i<arr.length; i++) {
//			int r = randomMaker();
//			if(!isContain(arr, r)) {
//				arr[i] = r;
//			}else {
//				i--;
//			}
//		}
//		
//	}
	
		
	int i =0;
	while (i<arr.length) {
		int r = randomMaker();
		if(!isContain(arr, r)) {
			arr[i] = r;
			i++;
		}
	}	
}
		
		
		

	
	//3. 메서드: 정수 배열을 콘솔에 출력하는 기능
	//리턴: void / 매개변수: 배열[] / 메서드명: randomPrint
	
	public static void randomPrint ( int arr[] ) {
		for (int tmp : arr) {
			System.out.print(tmp+" ");
		}
	}
	
	

	
	//4. 메서드: 중복 당첨번호를 제거 (배열에 생성한 랜덤값이 있는지 확인: 있다true, 없다false)
	//리턴: 제거한 당첨번호 제외한 배열[] / 매개변수: 배열[] = int lotto[]  / 메서드명: isContain
	
	public static boolean isContain ( int[]arr, int random ) {
		for(int i=0; i<arr.length-1; i++) {
				if(arr[i] == random) { 
					return true;  
				}
		}		return false; 		
	}
		
//		for (int tmp : arr) {
//			if(tmp == random) {
//				return false;
//			}
//		}
//		return true;
//	}
	
	

	
	//5. 메서드: 등수를 확인하는 기능 (배열에 생성한 랜덤값이 있는지 확인: 있다true, 없다false)
	//리턴: int  => 등수 / 매개변수: int lotto[] , int user[] / 메서드명:lottoRank
	//6개 일치 = 1등, 5개 일치 + 보너스 = 2등, 5개 일치 = 3등, 4개 일치 = 4등, 3개 일치 = 5등 / 꽝 = -1
	
	public static int lottoRank ( int lotto[], int user[]) {
		//lotto배열과 user배열은 개수가 다름.
		//배열의 순서가 바뀌거나, 같은 배열을 넣었을 경우
		if (lotto.length <= user.length ) {
			return -1;
		}
		
		int cnt = 0; //당첨번호의 개수를 체크
		for(int i=0; i<user.length; i++) {
			//user 1 2 3 4 5 6
			//lotto 1 2 7 8 5 4 (9)
			if(isContain(user, lotto[i])) {
				cnt++; //보너스번호 제외 카운트
			}
		}	
		//swich문을 이용하여 랭크 결정
		switch(cnt) {
		case 6 : return 1; //return사용으로 break사용X
		case 5 : 
			if(isContain(user, lotto[lotto.length-1])) {
				return 2;
			} else {
				return 3;
			}
			//return ( isContain(user, lotto[lotto.length-1]))? 2 : 3 );
				
		case 4 : return 4;
		case 3 : return 5;
		default : return -1;
	
		}
			
			
			
			
		
		
		
		
	}
	
	
	
}
