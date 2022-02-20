package kr.green.datetime.book;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Ex13_Contains {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		String pattern = "yyyy-MM-dd(E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		List<Date> holidays = new ArrayList<Date>();
		holidays.add(new Date(121,9,1));
		holidays.add(new Date(121,9,3));
		holidays.add(new Date(121,9,4));
		holidays.add(new Date(121,9,11));
		
		for(Date date : holidays) System.out.println(sdf.format(date));
		System.out.println();
		
		Calendar cal = Calendar.getInstance();
		cal.set(2021, 9, 1);
		int last = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		for(int i=1;i<=last;i++) {
			cal.set(Calendar.DATE, i);// 일 변경
			Date date = cal.getTime();
			System.out.println(sdf.format(date) + " : " + holidays.contains(date)+ ", " + isContains(holidays, date));
		}
	}
	private static boolean isContains(List<Date> list, Date date) {
		String pattern = "yyyyMMdd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		for(Date d : list) {
			if(sdf.format(date).equals(sdf.format(d))) return true;
		}
		return false;
	}

}
