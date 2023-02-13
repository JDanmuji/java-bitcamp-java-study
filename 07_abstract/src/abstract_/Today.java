package abstract_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Today {
	
	public static void main(String[] args) throws ParseException {
		Date date = new Date();  //시스템의 시간과 날짜
		
		SimpleDateFormat sdf = new SimpleDateFormat("y년 M월 h일 HH:mm:ss");
		System.out.println("오늘 날짜 : " + sdf.format(date));
		System.out.println();
		
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
		Date birth = input.parse("20001017182233");
		
		System.out.println(birth);
		System.out.println(sdf.format(birth));
		System.out.println();
		
		//Calendar cal = new Calendar(); - error
		
		Calendar cal_class = new GregorianCalendar();
		Calendar cal_method =	Calendar.getInstance();
		
		int year = cal_class.get(1); //int year = cal_class.get(Calendar.YEAR);
		int month = cal_class.get(2); //int month = cal_class.get(Calendar.MONTH);
		int day = cal_class.get(Calendar.DAY_OF_MONTH);
		int week = cal_class.get(Calendar.DAY_OF_WEEK);
		int i = Calendar.DAY_OF_MONTH;
	
		int hour = cal_class.get(Calendar.HOUR_OF_DAY);
		int minute = cal_class.get(Calendar.MINUTE);
		int second = cal_class.get(Calendar.SECOND);
		
		System.out.println(i);
		String dayOfWeek = null;
		
		switch(week) {
			case 1 : dayOfWeek = "일";
			break;
			case 2 : dayOfWeek = "월";
			break;
			case 3 : dayOfWeek = "화";
			break;
			case 4 : dayOfWeek = "수";
			break;
			case 5 : dayOfWeek = "목";
			break;
			case 6 : dayOfWeek = "금";
			break;
			case 7 : dayOfWeek = "토";
			break;
		}
		
		System.out.println(year + "년" + month + "월" + day + "일" + dayOfWeek + "요일" + hour + "시"+ minute+ "분" + second + "초");
		
		
	}

}
