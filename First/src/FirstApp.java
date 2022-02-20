import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class FirstApp {
	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		System.out.println("반갑다 이클립스!!");
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("현재 : " + sdf.format(new Date()));
		System.out.println("현재 : " + LocalDateTime.now());
		System.out.println("현재 : " + LocalDate.now());
		System.out.println("현재 : " + LocalTime.now());
	}
}
