package day02;

public class Switch문2 {

	public static void main(String[] args) {
		/* 주사위 값을 출력하는 예제
		 * 주사위는 1~6까지의 랜덤 수로 결정
		 * 주사위의 랜덤 수를 콘솔에 찍는 예제
		 * */
		int num = (int)(Math.random()*13)-6; 
		System.out.println("나온 수는 " + num + "입니다.");

		//if문을 이용하여 num의 수만큼 전진 또는 후진 (-6~6 : 13가지)
		if (num > 0) {
			System.out.println(num+"만큼 전진하세요");
		} else if (num == 0) {
			System.out.println("주사위를 다시 굴려주세요.(제자리)");
		} else {
			System.out.println(Math.abs(num)+"만큼 후진하세요.");
		}
		
		
	}

}
