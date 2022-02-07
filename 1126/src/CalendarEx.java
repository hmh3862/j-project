import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
// Date보다는 성능이 향상된 Calendar클래스
public class CalendarEx {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// 달력객체
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK); //  1(일) ~ 7(토)
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		
		System.out.println(year + "년 " + month + "월 " + date + "일(" + week + ")");
		System.out.println(lastDay);
		
		// 변경
		cal.set(Calendar.DATE, 28); // set(필드, 값)
		week = cal.get(Calendar.DAY_OF_WEEK); //
		System.out.println("요일 : " + week);
		
		cal.set(2022, 8, 36); // set(년,월,일)
		
		month = cal.get(Calendar.MONTH)+1;
		date = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(month + "월 " + date + "일");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일(E요일) hh:mm:ss.S");
		System.out.println(sdf.format(cal.getTime())); // getTime() : Calendar를 Date로 변환
		
		cal.setTime(new Date(1,0,1)); // setTime() : Date를 Calendar로 변환
		System.out.println(sdf.format(cal.getTime())); // getTime() : Calendar를 Date로 변환
		
		
	}
}
