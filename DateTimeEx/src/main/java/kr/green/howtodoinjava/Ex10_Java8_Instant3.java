package kr.green.howtodoinjava;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;

import com.google.gson.Gson;

public class Ex10_Java8_Instant3 {
	// 현재 시간의 타임스탬프 값을 구하기
	public static void main(String[] args) {
		Instant instant = Instant.now();
		System.out.println("Current Instant : "+ instant);

		long epochSecond = instant.getEpochSecond();
		System.out.println("Current Timestamp in seconds : " + epochSecond);

		long epochMilli = instant.toEpochMilli();
		System.out.println("Current Timestamp in milli seconds : " + epochMilli);		
		
		System.out.println("getNano() : " + instant.getNano());		
		System.out.println();

		Gson gson = new Gson();

		// {"seconds":1633661849,"nanos":15688400} : 두개로 나누어져 있다. 
		System.out.println(gson.toJson(instant));
		// "Oct 8, 2021, 11:59:20 AM"
		Timestamp timestamp = Timestamp.from(instant);
		System.out.println(gson.toJson(timestamp));
		// "Oct 8, 2021, 12:01:29 PM"
		Date date = new Date(epochMilli);
		System.out.println(gson.toJson(date));
	}
}
