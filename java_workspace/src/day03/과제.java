package day03;

public class 과제 {

	public static void main(String[] args) {
		// char: 유니코드표에 따라 글자의 코드별로 글자를 표시
		char ch = 'A';
		System.out.println(ch);
		System.out.println((int)ch); //A의 유니코드상의 값=65

		
	
		
		/* a
		 * ab
		 * abc
		 * abcd
		 * abcde
		 * abcde...z
		 * */
		
		for(char ch1 = 'a'; ch1<='z'; ch1++) {
			System.out.println( );
			//System.out.print(ch1+" ");
			for(char ch2 = 'a'; ch2 <= ch1 ; ch2++) {
				System.out.print(ch2+" ");
			}
		}
		
		
		
		
		
	}

}
