package kr.green.datetime.book;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Ex12_CompareTo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		String pattern = "yyyy-MM-dd(E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date date = new Date(121,9,1);
		Date date1 = new Date(121,9,1);
		Date date2 = new Date(121,9,3);
		Date date3 = new Date(121,9,5);
		Date date4 = new Date(121,9,11);
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DATE, 1);
		System.out.println(sdf.format(date));
		System.out.println(sdf.format(date1));
		System.out.println(sdf.format(calendar.getTime()));
		
		// 같은 Date객체 비교
		System.out.println(date.equals(date1));
		System.out.println(date.compareTo(date1)==0);
		System.out.println(sdf.format(date).equals(sdf.format(date1)));
		System.out.println();
		
		// Date와 Calendar를 비교
		System.out.println(date1.equals(calendar.getTime()));
		System.out.println(date1.compareTo(calendar.getTime())==0);
		System.out.println(sdf.format(date1).equals(sdf.format(calendar.getTime())));
		System.out.println();

		// Date와 Calendar를 Date로 바꿔서비교
		Date date5 = calendar.getTime();
		System.out.println(sdf.format(date5));
		System.out.println(date5.equals(date1));
		System.out.println(date5.compareTo(date1)==0);
		System.out.println(sdf.format(date1).equals(sdf.format(date5)));
		System.out.println();

		List<Date> list = new ArrayList<Date>();
		list.add(date1);
		list.add(date2);
		list.add(date3);
		list.add(date4);
		
		System.out.println(isContains(list, date1));
		System.out.println(isContains(list, date2));
		System.out.println(isContains(list, date3));
		System.out.println(isContains(list, date4));
		System.out.println(isContains(list, date5));
		System.out.println(isContains(list, new Date(121,9,12)));
	}
	
	// 날짜 리스트에 지정 날짜가 포함되었는지 비교
	private static boolean isContains(List<Date> list, Date date) {
		String pattern = "yyyyMMdd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		for(Date d : list) {
			if(sdf.format(date).equals(sdf.format(d))) return true;
		}
		return false;
	}
}
