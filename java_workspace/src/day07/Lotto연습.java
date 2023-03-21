package day07;

public class Lotto연습 {

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
		
		
		System.out.println(randomMaker());
		
		
		
		
	}	

	//1. 메서드: 번호를 랜덤으로 생성해주는 기능 (자동으로 발생되는 당첨번호 7개) -> 랜덤번호 1개 생성
	//리턴: int / 매개변수: x / 메서드명: randomMaker
	 public static int randomMaker( ) {
		 return (int)(Math.random()*10)+1;
	 }
	
	
	//2. 메서드: 랜덤 번호를 배열에 담아주는 기능 -> 배열을 랜덤번호로 완성
	//리턴 : void /  매개변수 : int / 메서드명: randomArr
	 public static void randomArr( int arr[] ) {
		 for(int i=0; i<arr.length; i++) {
			 arr[i]=randomMaker();
		 }
	 }
	
	
	
	
	
	
	//3. 메서드: 정수 배열을 콘솔에 출력하는 기능
	//리턴: void / 매개변수: 배열[] / 메서드명: randomPrint


	
	
	
	
	
	
	//4. 메서드: 중복 당첨번호를 제거 (배열에 생성한 랜덤값이 있는지 확인: 있다true, 없다false)
	//리턴: 제거한 당첨번호 제외한 배열[] / 매개변수: 배열[] = int lotto[]  / 메서드명: isContain
	
	
	
	
	
	

	

	
	//5. 메서드: 등수를 확인하는 기능 (배열에 생성한 랜덤값이 있는지 확인: 있다true, 없다false)
	//리턴: int  => 등수 / 매개변수: int lotto[] , int user[] / 메서드명:lottoRank
	//6개 일치 = 1등, 5개 일치 + 보너스 = 2등, 5개 일치 = 3등, 4개 일치 = 4등, 3개 일치 = 5등 / 꽝 = -1
	

			
		
		
		
		
	
	
	
	

}
