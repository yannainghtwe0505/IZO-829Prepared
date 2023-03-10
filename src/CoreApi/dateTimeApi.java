package CoreApi;

import java.time.*;

public class dateTimeApi {
	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());

		LocalDate l=LocalDate.now();
		var date = LocalDate.of(2022, Month.JANUARY, 20);
		 System.out.println(date); // 2022–01–20
		 date = date.plusDays(2);
		 System.out.println(date); // 2022–01–22
//		 date = date.plusWeeks(1);
		 System.out.println(date); // 2022–01–29
		 date = date.plusMonths(1);
		 System.out.println(date); // 2022–02–28
		 date = date.plusYears(5);
		 System.out.println(date);
		 System.out.println("============================");
		 localDatTime();


	}
	public static void localDatTime() {
		 var date = LocalDate.of(2024, Month.JANUARY, 20);
		 var time = LocalTime.of(5, 15);
		 var dateTime = LocalDateTime.of(date, time);
		 System.out.println(dateTime); // 2024–01–20T05:15
		 dateTime = dateTime.minusDays(1);
		 System.out.println(dateTime); // 2024–01–19T05:15
		 dateTime = dateTime.minusHours(10);
		 System.out.println(dateTime); // 2024–01–18T19:15
		 dateTime = dateTime.minusSeconds(30);
		 System.out.println(dateTime); // 2024–01–18T19:14:30
	}

}
