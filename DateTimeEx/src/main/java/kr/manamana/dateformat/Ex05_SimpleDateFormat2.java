package kr.manamana.dateformat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Ex05_SimpleDateFormat2 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println("toString() : " + now);
		System.out.println();
		
		String pattern = "G y yy yyyy"; // G : 연호, y :연도
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		System.out.println(pattern + " : " + simpleDateFormat.format(now));
		
		pattern = "M MM MMM"; // M : 월
		simpleDateFormat = new SimpleDateFormat(pattern);
		System.out.println(pattern + " : " + simpleDateFormat.format(now));
		
		pattern = "d dd ddd"; // D : 일
		simpleDateFormat = new SimpleDateFormat(pattern);
		System.out.println(pattern + " : " + simpleDateFormat.format(now));

		pattern = "D DD DDD"; // 년 중의 일 : 1월 1일 부터의 일 수
		simpleDateFormat = new SimpleDateFormat(pattern);
		System.out.println(pattern + " : " + simpleDateFormat.format(now));

		pattern = "E EE EEEE"; // D : 요일
		simpleDateFormat = new SimpleDateFormat(pattern);
		System.out.println(pattern + " : " + simpleDateFormat.format(now));
		
		pattern = "h hh H HH k kk K KK KKK"; // 시간 : h(1~12), H(0~23), k(1~24), K(0~11)
		simpleDateFormat = new SimpleDateFormat(pattern);
		System.out.println(pattern + " : " + simpleDateFormat.format(now));

		pattern = "m s S mm ss SSS"; // m(분), s(초), S(밀리초)
		simpleDateFormat = new SimpleDateFormat(pattern);
		System.out.println(pattern + " : " + simpleDateFormat.format(now));
		
		pattern = "y-M-d F"; // F : 월의 몇번째 주
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DATE, 1);
		now = calendar.getTime();
		simpleDateFormat = new SimpleDateFormat(pattern);
		System.out.println(pattern + " : " + simpleDateFormat.format(now));
		calendar.set(Calendar.DATE, 20);
		now = calendar.getTime();
		System.out.println(pattern + " : " + simpleDateFormat.format(now));
		calendar.set(Calendar.DATE, 30);
		now = calendar.getTime();
		System.out.println(pattern + " : " + simpleDateFormat.format(now));
		
		pattern = "y-M-d hh:mm:ss(a) w W z"; // a : AM/PM, w : 년의 몇번째 주, W : 월의 몇번째 주, z : 타임존
		calendar.set(Calendar.DATE, 1);
		now = calendar.getTime();
		simpleDateFormat = new SimpleDateFormat(pattern);
		System.out.println(pattern + " : " + simpleDateFormat.format(now));
		
		pattern = "y년 MM월 dd일 EEEE (a)hh시 mm분 ss초"; 
		calendar.set(Calendar.DATE, 1);
		now = calendar.getTime();
		simpleDateFormat = new SimpleDateFormat(pattern);
		System.out.println(pattern + " : " + simpleDateFormat.format(now));
		
		pattern = "y'년' MM'월' dd'일' EEEE (a)hh'시' mm'분' ss'초'''"; // ' 를 출력하려면 ''이어야 함 
		calendar.set(Calendar.DATE, 1);
		now = calendar.getTime();
		simpleDateFormat = new SimpleDateFormat(pattern);
		System.out.println(pattern + " : " + simpleDateFormat.format(now));
		
		pattern = "y M d hh:mm:ss(E) a w W z MMM EEE MMMM EEEE";
		calendar.set(Calendar.DATE, 1);
		now = calendar.getTime();
		simpleDateFormat = new SimpleDateFormat(pattern, Locale.US);
		System.out.println(pattern + " : " + simpleDateFormat.format(now));
		
	}
}
