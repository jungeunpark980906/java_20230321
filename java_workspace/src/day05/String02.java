package day05;

public class String02 {

	public static void main(String[] args) {
		// 이것이자바다.txt 파일에서 파일명과 확장자를 분리하여 출력
		//파일명: 이것이자바다, 확장자: txt
		
		String str = "이것이자바다.txt";
		
		System.out.println("확장자: " + str.substring(str.indexOf(".")+1));
		System.out.println("파일명: " + str.substring(0, str.indexOf(".")));
		//System.out.println(srt.substring(srt.indexOf(".")));
		
		
		
		
		//contains(str) : 해당 글자가 포함되어 있는지를 확인 (boolean)
		System.out.println(str.contains("자바")); //있다면 true, 없다면 false
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
