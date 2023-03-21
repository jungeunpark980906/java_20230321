package day14;

import java.util.Calendar;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		/* 날짜,시간 클래스
		 * Calendar class => 추상 클래스
		 * 직접 객체를 생성 할 수 없음 = new연산자를 통해 객체 구현이 x
		 * getInstance() 를 이용하여 구현한 클래스를 통해 인스턴스를 얻어옴
		 * 
		 * month : 0월~11월 => 무조건 +1필요
		 * week : 1 = 일요일, 2 = 월요일..
		 * am_pm : am =0, pm=1
		 * */
	
		//1.Date class
//		Date d = new Date();
//		d.getDate(); //depercated : 비권장
//		System.out.println(d.getDate());
		
		//2.Calendar class
		
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR); //년
		System.out.println(year);
		int month = now.get(Calendar.MONTH)+1; //월 (단,+1필요!!)
		System.out.println(month);
		int day = now.get(Calendar.DAY_OF_MONTH); //일
		System.out.println(day);
		int week = now.get(Calendar.DAY_OF_WEEK); //주
		System.out.println(week); //=> 오늘은 금요일이라서 6출력
		
		System.out.println(year + "-" + month + "-" + day);
		
		//hour, minute, second
		int hour = now.get(Calendar.HOUR);
		System.out.println(hour);
		int minute = now.get(Calendar.MINUTE);
		System.out.println(minute);
		int second = now.get(Calendar.SECOND);
		System.out.println(second);
		
		System.out.println(hour + ":" + minute + ":" + second);
		
		//<출력>
		//2023-2-17(금)
		//오후 3:10 
		String weekStr=null;
		String am_pm;
		
		switch (week){
			case 2: weekStr="월"; break;
			case 3: weekStr="화"; break;
			case 4: weekStr="수"; break;
			case 5: weekStr="목"; break;
			case 6: weekStr="금"; break;
			case 7: weekStr="토"; break;
			default: weekStr="일"; break;
		}
		if(Calendar.AM_PM == 0) {
			am_pm = "오전";
		} else {
			am_pm = "오후";
		}
		//System.out.println((Calendar.AM_PM == 0)? "오전":"오후");

		System.out.println(year+"-"+month+"-"+day+"("+weekStr+")");
		System.out.println(am_pm + " " +hour+ ":" +minute);
		
	


	}
}
