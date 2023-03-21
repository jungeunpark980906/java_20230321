package day05;

public class String01 {

	public static void main(String[] args) {
		/* String 클래스= 문자열을 다루는 클래스
		 * String str = new String();
		 * String str = "가나다"; // 일반 자료형처럼 사용 가능.
		 * */
		
		String str = "Hello World~!";
		System.out.println(str);
		
		//1. charAt(index) : index번지(index번째)에 있는 문자열을 변환
		System.out.println("----charAt----");
		System.out.println(str.charAt(2));
		
		
		//2. length : 전체글자의 길이
		System.out.println("----length----");
		System.out.println(str.length());
		
		
		//3. compareTo(str) : str문자와 비교하여  같으면 0, 사전순으로 str보다 앞이면 -1, 뒤면 1
		System.out.println("----compareTo----");
		System.out.println("b".compareTo("a")); //결과: 1
		
		
		//4. concat(str) : 이어붙이기 (+연산자와 같은 의미)
		System.out.println("----concat----");
		System.out.println("abc".concat("def"));
		System.out.println("abc"+"def");
		
		
		//5. equals(str) : 두 문자열이 같은 지 확인 (대소문자 구분)
		System.out.println("----equals----");
		System.out.println("abc".equals("abc"));
		System.out.println("abc".equals("def"));
		System.out.println("abc" == "abc"); //단순 글자 비교에만 사용. equals를 사용하셈.
		
		
		//6. indexOf(str)/lastIndexOf(str) : 문자의 위치를 찾아주는 기능 (앞에서부터/뒤에서부터)
		System.out.println("----indexOf----");
		System.out.println("abc".indexOf("b")); //몇 번지에 있는지 확인
		System.out.println("abc".indexOf("d")); //문자가 없는 경우 -1
		
		String email = "a120871@naver.co.kr";
		System.out.println(email.indexOf("@")); //7번지에 위치
		System.out.println(email.indexOf(".")); //가장 처음에 발견한 값이 출력
		System.out.println(email.lastIndexOf(".")); //가장 뒤에서부터 발견할 값이 출력
		
		
		//7. substring : 문자열 추출
		System.out.println("----substring----");
		System.out.println(email.substring(1)); //시작 인덱스번지부터 모두 추출
		System.out.println(email.substring(1, 7)); //1번지 인덱스 부터~ (7-1)번지 인덱스를 추출
		
		
			//email에서 아이디만 추출하려면,
			System.out.println(email.indexOf("@"));
			System.out.println(email.substring(0, 7));
			System.out.println(email.substring(0, email.indexOf("@")));
			
			//email에서 naver.co.kr만 추출하려면,
			System.out.println(email.substring(email.indexOf("@")+1));
			
			
		//8. trim : 불필요한 공백 삭제
		System.out.println("----trim-----");
		System.out.println("    hello    ".trim());
		
		
		//9. replace : 글자 치환
		System.out.println("----replace----");
		System.out.println("Hello World".replace("W", "w"));//대문자 W를 모두 소문자 w로 치환
		System.out.println("Hello World".replace("World", "JAVA")); //단어를 변경
		
		
		//10. split : 특정 값을 기준으로 나누기
		System.out.println("----split----");
		String str1 = "dog,cat,tiger";
		String[] arr = str1.split(","); // ,를 기준으로 나눠서 배열화
		
		for (String tmp : arr) {
			System.out.println(tmp+ " ");
		} 
		
		
		
		String num1 = "1";
		String num2 = "2";
		String sum = num1 + num2;
		System.out.println(sum); // 문자열 연결
		
		
		//11. parseInt : 문자를 숫자로 변환
		int num3 = Integer.parseInt(num1); //Integer는 문자를 숫자로 변환하는데 사용
		System.out.println(num3);
		int num4 = Integer.parseInt(num2);
		System.out.println(num4);
		
		int sum1 = num3 + num4;
		System.out.println(sum1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
