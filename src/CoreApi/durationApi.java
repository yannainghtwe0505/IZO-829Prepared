package CoreApi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class durationApi {
	public static void main(String[] args) {
//		LocalTime time = LocalTime.of(3,2,5);
//		System.out.println(time); // 03:12:45
//		LocalTime truncated = time.truncatedTo(ChronoUnit.MINUTES);
//		System.out.println(truncated); // 03:12

		var date = LocalDate.of(2022, 1, 20);
		var time = LocalTime.of(6, 15);
		var dateTime = LocalDateTime.of(date, time);
	    var duration = Duration.ofHours(23);
		System.out.println(dateTime.plus(duration)); // 2022–01–20T12:15
		System.out.println(time.plus(duration)); // 12:15
//		System.out.println(date.plus(duration)); //UnsupportedTemporalTypeException
	}

}
