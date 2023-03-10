package CoreApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class periodApi {
	public static void main(String[] args) {
		var start = LocalDate.of(2022, Month.JANUARY, 1);
		var end = LocalDate.of(2022, Month.MARCH, 30);
		performAnimalEnrichment(start, end);
		var period = Period.ofMonths(1); // create a period
		performAnimalEnrichment(start, end, period);
		var wrong = Period.ofYears(1).ofWeeks(1);
		System.out.println("-----------------");

		System.out.println(wrong);
		var wrong2 = Period.ofYears(1);
		wrong2 = Period.ofWeeks(1);
		System.out.println(wrong2);
		System.out.println(Period.of(3,3,3));

		periodWithLocalTime();


	}

	private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
		System.out.println("Example withoud period");
		var upTo = start;
		while (upTo.isBefore(end)) { // check if still before end
		System.out.println("give new toy: " + upTo);
		upTo = upTo.plusMonths(1); // add a month
	} }
	private static void performAnimalEnrichment(LocalDate start, LocalDate end,
		Period period) { // uses the generic period
		System.out.println("With period");
		var upTo = start;
		while (upTo.isBefore(end)) {
		System.out.println("give new toy: " + upTo);
		upTo = upTo.plus(period); // adds the period
		} }

	private static void  periodWithLocalTime() {
		System.out.println("----------Cannot use with localTime-----------");
		var date = LocalDate.of(2022, 1, 20);
		var time = LocalTime.of(6, 15);
		var dateTime = LocalDateTime.of(date, time);
		var period = Period.ofMonths(1);
		System.out.println(date.plus(period)); // 2022–02–20
		System.out.println(dateTime.plus(period)); // 2022–02–20T06:15
		System.out.println(time.plus(period));
	}

}
