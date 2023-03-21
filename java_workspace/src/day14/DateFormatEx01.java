package day14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx01 {

	public static void main(String[] args) throws ParseException {
		/* 날짜를 문자열로 format 설정
		 * 
		 * SimpleDateFormat의 형식(패턴) => p.543
		 * */
		
		//날짜를 문자열로 변환!
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E)");
		
		String dateString = sdf.format(date);
		System.out.println(dateString);
		
		//문자열을 날짜로 변환!
		String dateStr = "1998-09-06 09:07";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		Date date2 = sdf2.parse(dateStr); 
		System.out.println(date2);
	}

}
