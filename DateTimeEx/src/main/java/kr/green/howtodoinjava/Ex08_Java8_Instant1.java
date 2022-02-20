package kr.green.howtodoinjava;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

/*
Instant class
자바8 Time API의 `Instant` 클래스는 시간을 타임스탬프로 다루기 위해서 사용합니다. 
타임스탬프는 UTC 기준으로 1970년 1월 1일 0시 0분 0초를 숫자 `0`으로 정하고 그로 부터 경과된 시간을 
양수 또는 음수로 표현합니다. 
타임스탬프는 인간에게는 직관적이지 않은 시간의 표현 방법이지만 고전적으로 기계에게는 매우 친화적인 방법으로 
현재까지 널리 사용되어 왔습니다. 
일단 시간을 표현하기 위해서 별도의 타입없이 기본 데이터 타입으로 표현이 가능한데다가, 
타임존이 UTC로 고정되어 있기 때문에 타임스탬프가 어느 타임존 기준인지를 고려할 필요가 없기 때문입니다.
 */
public class Ex08_Java8_Instant1 {
	// Timestamp 나타내기
	public static void main(String[] args) {
		// Java7 이전
		Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());
		System.out.println(timestamp1);

		Date date = new Date();
		Timestamp timestamp2 = new Timestamp(date.getTime());
		System.out.println(timestamp2);
		
		Timestamp timestamp3 = new Timestamp(Calendar.getInstance().getTimeInMillis());
		System.out.println(timestamp3);
		System.out.println();
		
		// Java8 이후
		Instant instant1 = Instant.now();
		Instant instant2 = timestamp1.toInstant();
		Instant instant3 = date.toInstant();
		System.out.println(instant1);
		System.out.println(instant2);
		System.out.println(instant3);
		System.out.println();
		
		Timestamp timestamp4 = Timestamp.from(instant1);
		System.out.println(timestamp4);
		
	}
}
