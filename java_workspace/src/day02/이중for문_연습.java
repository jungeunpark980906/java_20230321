package day02;

public class 이중for문_연습 {

	public static void main(String[] args) {
		
		
		for (int dan=2; dan<=9; dan++) {
			System.out.println(dan+"단");
			for (int times=1; times<=9; times++) {
				//System.out.println(dan + "*" + times + "=" + (dan*times));
				System.out.printf("%d * %d = %d\n", dan, times, (dan*times));
				
			}
			
		}
	}

}
