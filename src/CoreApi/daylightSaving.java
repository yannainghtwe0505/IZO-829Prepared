package CoreApi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class daylightSaving {
	public static void main(String[] args) {
		var date = LocalDate.of(2022, Month.MARCH, 13);
		var time = LocalTime.of(1, 30);
		var zone = ZoneId.of("US/Eastern");
		var dateTime = ZonedDateTime.of(date, time, zone);
		System.out.println(dateTime); // 2022–03-13T01:30-05:00[US/Eastern]
		System.out.println(dateTime.getHour()); // 1
		System.out.println(dateTime.getOffset()); // -05:00
		dateTime = dateTime.plusHours(1);
		System.out.println(dateTime); // 2022–03-13T03:30-04:00[US/Eastern]
		System.out.println(dateTime.getHour()); // 3
		System.out.println(dateTime.getOffset()); // -04:00
		System.out.println("-----------------------------------------");
		usdaylightSaving();
	}
	public static void usdaylightSaving() {
		var date = LocalDate.of(2022, Month.NOVEMBER, 6);
		var time = LocalTime.of(1, 30);
		var zone = ZoneId.of("US/Eastern");
		var dateTime = ZonedDateTime.of(date, time, zone);
		System.out.println(dateTime); // 2022-11-06T01:30-04:00[US/Eastern]
		dateTime = dateTime.plusHours(1);
		System.out.println(dateTime); // 2022-11-06T01:30-05:00[US/Eastern]
		dateTime = dateTime.plusHours(1);
		System.out.println(dateTime); // 2022-11-06T02:30-05:00[US/Eastern]
//		var date = LocalDate.of(2022, Month.MARCH, 13);
//		var time = LocalTime.of(2, 30);
//		var zone = ZoneId.of("US/Eastern");
//		var dateTime = ZonedDateTime.of(date, time, zone);
//		System.out.println(dateTime); // 2022–03–13T03:30–04:00[US/Eastern]
	}

}
