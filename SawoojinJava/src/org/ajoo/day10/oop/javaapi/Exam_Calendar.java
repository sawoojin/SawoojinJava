package org.ajoo.day10.oop.javaapi;

import java.util.Calendar;

public class Exam_Calendar {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar openDate = Calendar.getInstance();
		Calendar closeDate = Calendar.getInstance();
		
//		System.out.println(today);
//		System.out.println(today.get(Calendar.YEAR));
//		System.out.println(today.get(Calendar.MONTH+1));
//		System.out.println(today.get(Calendar.DAY_OF_MONTH));
//		System.out.println(today.get(Calendar.HOUR_OF_DAY));
//		System.out.println(today.get(Calendar.HOUR));
//		System.out.println(today.get(Calendar.AM_PM));
//		System.out.println(today.get(Calendar.MINUTE) + "분");
//		System.out.println(today.get(Calendar.SECOND) + "초");
//		System.out.println(today.get(Calendar.MILLISECOND));
		
		Exam_Calendar pCal = new Exam_Calendar();

		openDate.clear();
		openDate.set(2023, 10, 13, 9, 0);
		pCal.printCalendar("개강일", openDate);
//		System.out.println(openDate.get(Calendar.YEAR) + "년"
//			+ (openDate.get(Calendar.MONTH)) + "월"
//			+ openDate.get(Calendar.DAY_OF_MONTH) + "일"
//			+ openDate.get(Calendar.HOUR_OF_DAY) + "시"
//			+ openDate.get(Calendar.MINUTE) + "분"
//			+ openDate.get(Calendar.SECOND) + "초"
//			+ openDate.get(Calendar.MILLISECOND));
		
		closeDate.clear();
		closeDate.set(2024, 3, 25, 18, 0);
		pCal.printCalendar("종강일", closeDate);
//		System.out.println(closeDate.get(Calendar.YEAR) + "년"
//			+ (closeDate.get(Calendar.MONTH)) + "월"
//			+ closeDate.get(Calendar.DAY_OF_MONTH) + "일"
//			+ closeDate.get(Calendar.HOUR_OF_DAY) + "시"
//			+ closeDate.get(Calendar.MINUTE) + "분"
//			+ closeDate.get(Calendar.SECOND) + "초"
//			+ closeDate.get(Calendar.MILLISECOND));
	}
	public void printDate(String title, Calendar cal) {
		System.out.print(title + " ");
		System.out.println(cal.get(Calendar.YEAR) + "년"
				+ (cal.get(Calendar.MONTH)) + "월"
				+ cal.get(Calendar.DAY_OF_MONTH) + "일"
				+ cal.get(Calendar.HOUR_OF_DAY) + "시"
				+ cal.get(Calendar.MINUTE) + "분"
				+ cal.get(Calendar.SECOND) + "초"
				+ cal.get(Calendar.MILLISECOND));
	}
	public void printCalendar(String title, Calendar cal) {
	    int year           = cal.get(Calendar.YEAR);
	    int month           = cal.get(Calendar.MONTH)+1;
	    int day           = cal.get(Calendar.DAY_OF_MONTH);
	    int dayOfWeek     = cal.get(Calendar.DAY_OF_WEEK);
	    int hourOfDay     = cal.get(Calendar.HOUR_OF_DAY);
	    int ampm           = cal.get(Calendar.AM_PM);
	    int hour           = cal.get(Calendar.HOUR);
	    int minute        = cal.get(Calendar.MINUTE);
	    int second        = cal.get(Calendar.SECOND);
	    int millisecond = cal.get(Calendar.MILLISECOND);
	    System.out.print(title + " ");
	    System.out.print(year + "/"+ month + "/" + day);
	    
	    System.out.print("/");
	    switch(dayOfWeek) {
	        case Calendar.SUNDAY :       System.out.print("일요일"); break;
	        case Calendar.MONDAY :    System.out.print("월요일"); break;
	        case Calendar.TUESDAY :   System.out.print("화요일"); break;
	        case Calendar.WEDNESDAY : System.out.print("수요일"); break;
	        case Calendar.THURSDAY :  System.out.print("목요일"); break;
	        case Calendar.FRIDAY :    System.out.print("금요일"); break;
	        case Calendar.SATURDAY :  System.out.print("토요일"); break;
	    }
	    System.out.print("(" + hourOfDay+"시) ");
	    if(ampm == Calendar.AM) System.out.print("오전 ");
	    else System.out.print("오후 ");
	    System.out.print(hour + "시 " + minute + "분 " + second + "초 " + millisecond + "밀리초");
	    System.out.println();
	}
}
