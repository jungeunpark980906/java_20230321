package day14;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class LocalDateTime01 {

	public static void main(String[] args) {
		
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		System.out.println(today.getYear());//get을 이용하여 원하는 부분 출력 가능!
		
		String curr = today.toString();
		System.out.println(curr);
		
		//curr의 날짜만 분리시켜 추출
		System.out.println(curr.substring(0, curr.indexOf("T")));
		System.out.println(curr.substring(curr.indexOf("T")+1,(curr.indexOf("."))));
		
		//DateTimeFormatter : 내가 원하는 모양을 지정해 만들어놓기
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println(dtf.format(today));
		
		//LocalDateTime.of()
		LocalDateTime sDate = LocalDateTime.of(1998, 9, 6, 9, 7);
		System.out.println(sDate);
		System.out.println(sDate.format(dtf)); //format(dtf)를 이용하여 yyyy/MM/dd 모양으로 출력

	}

}
