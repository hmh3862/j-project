package kr.green.datetime.book;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		String pattern = "yyyy-MM-dd(E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date date = new Date(121,9,1);
		Date date1 = new Date(121,9,1);
		
		System.out.println(sdf.format(date));
		System.out.println(sdf.format(date1));
		
		// 같은 Date객체 비교
		System.out.println(date.equals(date1));
		System.out.println(date.compareTo(date1)==0);
		System.out.println(sdf.format(date).equals(sdf.format(date1)));
		System.out.println();
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DATE, 1);
		System.out.println(sdf.format(calendar.getTime()));

		// Date와 Calendar를 비교
		System.out.println(date1.equals(calendar.getTime()));
		System.out.println(date1.compareTo(calendar.getTime())==0);
		System.out.println(sdf.format(date1).equals(sdf.format(calendar.getTime())));
		System.out.println();

		// Date와 Calendar를 Date로 바꿔서비교
		Date date2 = calendar.getTime();
		System.out.println(sdf.format(date2));
		System.out.println(date2.equals(date1));
		System.out.println(date2.compareTo(date1)==0);
		System.out.println(sdf.format(date1).equals(sdf.format(date2)));
		System.out.println();
	}
}
