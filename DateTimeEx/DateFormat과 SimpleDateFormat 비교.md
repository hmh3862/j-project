###  DateFormat과 SimpleDateFormat 비교

#### 1. DateFormat

##### 	1-1. DateFormat.getDateInstance() 메서드

```java
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Ex01_DateFormat1 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println("toString() : " + now);
		System.out.println();
		
		DateFormat dateFormat = DateFormat.getDateInstance();
		System.out.println("기본 : " + dateFormat.format(now));
		System.out.println();
		
		DateFormat format1 = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(format1.format(now));
		DateFormat format2 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(format2.format(now));
		DateFormat format3 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(format3.format(now));
		DateFormat format4 = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(format4.format(now));
		DateFormat format5 = DateFormat.getDateInstance(DateFormat.DEFAULT);
		System.out.println(format5.format(now));
		System.out.println();
		
		Locale locale = Locale.getDefault();
		DateFormat format6 = DateFormat.getDateInstance(DateFormat.FULL, locale);
		System.out.println(locale + " : " + format6.format(now));
		
		locale = Locale.FRANCE;
		format6 = DateFormat.getDateInstance(DateFormat.FULL, locale);
		System.out.println(locale + " : " + format6.format(now));

		locale = Locale.GERMANY;
		format6 = DateFormat.getDateInstance(DateFormat.FULL, locale);
		System.out.println(locale + " : " + format6.format(now));
	}
}
```

결과

```java
toString() : Thu Oct 07 12:42:47 KST 2021

기본 : 2021. 10. 7.

FULL : 2021년 10월 7일 목요일 오후 12시 42분 47초 대한민국 표준시
LONG : 2021년 10월 7일 오후 12시 42분 47초 KST
MEDIUM : 2021. 10. 7. 오후 12:42:47
SHORT : 21. 10. 7. 오후 12:42
DEFAULT : 2021. 10. 7. 오후 12:42:47

ko_KR : 2021년 10월 7일 목요일
fr_FR : jeudi 7 octobre 2021
de_DE : Donnerstag, 7. Oktober 2021
```



##### 1-2. DateFormat.getTimeInstance() 메서드

```java
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Ex02_DateFormat2 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println("toString() : " + now);
		System.out.println();
		
		DateFormat dateFormat = DateFormat.getTimeInstance();
		System.out.println("기본 : " + dateFormat.format(now));
		System.out.println();
		
		DateFormat format1 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
		System.out.println("FULL : " + format1.format(now));
		DateFormat format2 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		System.out.println("LONG : " + format2.format(now));
		DateFormat format3 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
		System.out.println("MEDIUM : " + format3.format(now));
		DateFormat format4 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
		System.out.println("SHORT : " + format4.format(now));
		DateFormat format5 = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT);
		System.out.println("DEFAULT : " + format5.format(now));
		System.out.println();
		
		Locale locale = Locale.getDefault();
		DateFormat format6 = DateFormat.getTimeInstance(DateFormat.FULL, locale);
		System.out.println(locale + " : " + format6.format(now));
		locale = Locale.FRANCE;
		format6 = DateFormat.getTimeInstance(DateFormat.FULL, locale);
		System.out.println(locale + " : " + format6.format(now));

		locale = Locale.GERMANY;
		format6 = DateFormat.getTimeInstance(DateFormat.FULL, locale);
		System.out.println(locale + " : " + format6.format(now));
	}
}
```

결과

```java
toString() : Thu Oct 07 12:44:01 KST 2021

기본 : 오후 12:44:01

FULL : 2021년 10월 7일 목요일 오후 12시 44분 1초 대한민국 표준시
LONG : 2021년 10월 7일 오후 12시 44분 1초 KST
MEDIUM : 2021. 10. 7. 오후 12:44:01
SHORT : 21. 10. 7. 오후 12:44
DEFAULT : 2021. 10. 7. 오후 12:44:01

ko_KR : 오후 12시 44분 1초 대한민국 표준시
fr_FR : 12:44:01 heure normale de la Corée
de_DE : 12:44:01 Koreanische Normalzeit
```



##### 1-3. DateFormat.getDateTimeInstance() 메서드

```java
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Ex03_DateFormat3 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println("toString() : " + now);
		System.out.println();
		
		DateFormat dateFormat = DateFormat.getDateTimeInstance();
		System.out.println("기본 : " + dateFormat.format(now));
		System.out.println();
		
		DateFormat format1 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
		System.out.println("FULL : " + format1.format(now));
		DateFormat format2 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		System.out.println("LONG : " + format2.format(now));
		DateFormat format3 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
		System.out.println("MEDIUM : " + format3.format(now));
		DateFormat format4 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
		System.out.println("SHORT : " + format4.format(now));
		DateFormat format5 = DateFormat.getDateTimeInstance(DateFormat.DEFAULT, DateFormat.DEFAULT);
		System.out.println("DEFAULT : " + format5.format(now));
		System.out.println();
		
		Locale locale = Locale.getDefault();
		DateFormat format6 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		System.out.println(locale + " : " + format6.format(now));
		
		locale = Locale.FRANCE;
		format6 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		System.out.println(locale + " : " + format6.format(now));

		locale = Locale.GERMANY;
		format6 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		System.out.println(locale + " : " + format6.format(now));

	}
}
```

결과

```java
toString() : Thu Oct 07 12:46:15 KST 2021

기본 : 2021. 10. 7. 오후 12:46:15

FULL : 2021년 10월 7일 목요일 오후 12시 46분 15초 대한민국 표준시
LONG : 2021년 10월 7일 오후 12시 46분 15초 KST
MEDIUM : 2021. 10. 7. 오후 12:46:15
SHORT : 21. 10. 7. 오후 12:46
DEFAULT : 2021. 10. 7. 오후 12:46:15

ko_KR : 2021년 10월 7일 오후 12시 46분 15초 KST
fr_FR : 7 octobre 2021 à 12:46:15 KST
de_DE : 7. Oktober 2021 um 12:46:15 KST
```



#### 2. SimpleDateFormat 

사용자가 원하는 형식의 날짜/시간 출력 모양을 지정할때 사용한다.

```java
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Ex04_SimpleDateFormat1 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println("toString() : " + now);
		System.out.println();
		
		DateFormat dateFormat = new SimpleDateFormat();
		System.out.println("기본 : " + dateFormat.format(now));
		System.out.println();
		
		String pattern = "yyyy-MMM-dd(EEEE) hh:mm:ss.S a";
		Locale locale = Locale.getDefault();
		dateFormat = new SimpleDateFormat(pattern, locale);
		System.out.println(locale + " : " + dateFormat.format(now));
		
		locale = Locale.FRANCE;
		dateFormat = new SimpleDateFormat(pattern, locale);
		System.out.println(locale + " : " + dateFormat.format(now));

		locale = Locale.GERMANY;
		dateFormat = new SimpleDateFormat(pattern, locale);
		System.out.println(locale + " : " + dateFormat.format(now));
	}
}
```

결과

```java
toString() : Thu Oct 07 12:54:07 KST 2021

기본 : 21. 10. 7. 오후 12:54

ko_KR : 2021-10월-07(목요일) 12:54:07.826 오후
fr_FR : 2021-oct.-07(jeudi) 12:54:07.826 PM
de_DE : 2021-Okt.-07(Donnerstag) 12:54:07.826 nachm.
```



##### 	Date Format Pattern Syntax

| Symbol | Meaning              | Presentation  | Example               |
| ------ | -------------------- | ------------- | --------------------- |
| G      | era designator       | Text          | AD                    |
| y      | year                 | Number        | 2009                  |
| M      | month in year        | Text & Number | July & 07             |
| d      | day in month         | Number        | 10                    |
| h      | hour in am/pm (1-12) | Number        | 12                    |
| H      | hour in day (0-23)   | Number        | 0                     |
| m      | minute in hour       | Number        | 30                    |
| s      | second in minute     | Number        | 55                    |
| S      | millisecond          | Number        | 978                   |
| E      | day in week          | Text          | Tuesday               |
| D      | day in year          | Number        | 189                   |
| F      | day of week in month | Number        | 2 (2nd Wed in July)   |
| w      | week in year         | Number        | 27                    |
| W      | week in month        | Number        | 2                     |
| a      | am/pm marker         | Text          | PM                    |
| k      | hour in day (1-24)   | Number        | 24                    |
| K      | hour in am/pm (0-11) | Number        | 0                     |
| z      | time zone            | Text          | Pacific Standard Time |
| '      | escape for text      | Delimiter     | (none)                |
| '      | single quote         | Literal       | '                     |

길이에 따른 표현

| Presentation  | Number of Symbols                    | Result                 |
| ------------- | ------------------------------------ | ---------------------- |
| Text          | 1 - 3                                | 약어로 표시            |
| Text          | >= 4                                 | 전체 표시              |
| Number        | minimum number of digits is required | 앞의 자리를 0으로 채움 |
| Text & Number | 1 - 2                                | 숫자로                 |
| Text & Number | 3                                    | 문자열로               |



````java
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
````

결과

```java
toString() : Thu Oct 07 14:46:01 KST 2021

G y yy yyyy : AD 2021 21 2021
M MM MMM : 10 10 10월
d dd ddd : 7 07 007
D DD DDD : 280 280 280
E EE EEEE : 목 목 목요일
h hh H HH k kk K KK KKK : 2 02 14 14 14 14 2 02 002
m s S mm ss SSS : 46 1 492 46 01 492
y-M-d F : 2021-10-1 1
y-M-d F : 2021-10-20 3
y-M-d F : 2021-10-30 5
y-M-d hh:mm:ss(a) w W z : 2021-10-1 02:46:01(오후) 40 1 KST
y년 MM월 dd일 EEEE (a)hh시 mm분 ss초 : 2021년 10월 01일 금요일 (오후)02시 46분 01초
y'년' MM'월' dd'일' EEEE (a)hh'시' mm'분' ss'초''' : 2021년 10월 01일 금요일 (오후)02시 46분 01초'
y M d hh:mm:ss(E) a w W z MMM EEE MMMM EEEE : 2021 10 1 02:53:12(Fri) PM 40 1 KST Oct Fri October Friday
```



#### 날짜 형식 기호 변경

```java
package kr.manamana.dateformat;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Ex06_DateFormatSymbols {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println("toString() : " + now);
		System.out.println();

		DateFormatSymbols symbols = new DateFormatSymbols(new Locale("en", "US"));
		String[] defaultDays = symbols.getShortWeekdays();

		for (String defaultDay : defaultDays) {
			System.out.print(defaultDay + " ");
		}
		System.out.println();

		defaultDays = symbols.getWeekdays();
		for (String defaultDay : defaultDays) {
			System.out.print(defaultDay + " ");
		}
		System.out.println("\n");
		
		symbols = new DateFormatSymbols(Locale.getDefault());
		defaultDays = symbols.getShortWeekdays();

		for (String defaultDay : defaultDays) {
			System.out.print(defaultDay + " ");
		}
		System.out.println();

		symbols = new DateFormatSymbols(Locale.getDefault());
		defaultDays = symbols.getWeekdays();
		
		for (String defaultDay : defaultDays) {
			System.out.print(defaultDay + " ");
		}
		System.out.println("\n");

		String[] capitalDays = { "", "SUN(일)", "MON(월)", "TUE(화)", "WED(수)", "THU(목)", "FRI(금)", "SAT(토)" };
		symbols.setShortWeekdays(capitalDays);
		defaultDays = symbols.getShortWeekdays();
		
		for (String defaultDay : defaultDays) {
			System.out.print(defaultDay + " ");
		}
		System.out.println();

		SimpleDateFormat formatter = new SimpleDateFormat("E", symbols);
		String result = formatter.format(now);
		System.out.println(" Today's day of the week: " + result);
	}
}
```

결과

```java
 toString() : Thu Oct 07 15:20:19 KST 2021

 Sun Mon Tue Wed Thu Fri Sat 
 Sunday Monday Tuesday Wednesday Thursday Friday Saturday 

 일 월 화 수 목 금 토 
 일요일 월요일 화요일 수요일 목요일 금요일 토요일 

 SUN(일) MON(월) TUE(화) WED(수) THU(목) FRI(금) SAT(토) 
 Today's day of the week: THU(목)
```

