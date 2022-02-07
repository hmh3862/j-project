import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// 컴퓨터에서 날짜는 어떻게 알아낼까?
public class DateEx {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		System.out.println(today.toLocaleString()); // 권장하지 않는다.
		System.out.println(Locale.getDefault()); // Locale : 국가 언어 코드
		
		int year = today.getYear()+1900; // 년 : 1900년 이후의 년수
		int month = today.getMonth()+1; // 월 : 0~11월
		int date = today.getDate(); // 일
		int day = today.getDay(); // 요일 (0 ~ 6)
		String week = "일월화수목금토";
		System.out.println(year + "-" + month + "-" + date + "(" + day + ")");
		System.out.println(week.charAt(day));
		
		today.setDate(28);
		System.out.println(today.getDay()); // 일요일 : 0
		System.out.println(week.charAt(today.getDay()));
		
		// 원하는 모양으로 날짜 출력하기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일(E요일) hh:mm:ss.S");
		System.out.println(sdf.format(today));
		
		// 그달의 마지막 날짜
		int lastDay[] = {31,28,31,30,31,30,31,31,30,31,30,31}; // 월의 마지막 날짜!!
		lastDay[1] = (year%400==0 || year%4==0 && year%100!=0) ? 29 : 28; // 윤년일 경우 2월의 날짜를 변경한다.
		System.out.println(year +"년 " + month + "월의 마지막 날짜 : " + lastDay[month-1]);
	}
}
