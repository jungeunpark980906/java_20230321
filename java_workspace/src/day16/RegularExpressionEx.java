package day16;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionEx {

	public static void main(String[] args) {
		
		/* RegularExpression: 정규표현식
		 * 문자의 형식을 검증하는 형태
		 * 전화번호, 비밀번호
		 * [a-zA-Z]: 대소문자 1개 가능
		 * \d: 숫자 \w:[a-zA-Z0-9]: 대소문자, 숫자 1개만 가능
		 * .: 모든 문자중 한개의 문자
		 * ?: 없음 또는 1개
		 * *: 없음 또는 1개이상
		 * {3, }: 3자리 이상 
		 * (02 | 010) - \d{3, 4} - \d{4} => 010-111-1111, 02-111-1111
		 *  또는			3자리나 4자리	개수 4개
		 * */
		//배열중 b로 시작하는 단어 찾기
		String[] strArr = {"bat", "baby", "car", "cb", "date", "disk", "count", "apple", "banana"};
		Arrays.sort(strArr); // 배열 정렬
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
		System.out.println("---------------------------------");
		
		Pattern pattern = Pattern.compile("c[a-zA-Z]*");
		//b로시작하고 a~z, A~Z로 끝나며 개수는 상관없음
		for(String str : strArr) {
			Matcher matcher = pattern.matcher(str); 
			if(matcher.matches()) { //패턴이 일치가 되면 true를 반환
				System.out.print(str + " ");
			}
		}
	}

}
