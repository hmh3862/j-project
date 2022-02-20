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
