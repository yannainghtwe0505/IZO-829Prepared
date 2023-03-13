package CoreApi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class builderTest {
	public static void main(String[] args) {
		var string = "12345";
		var builder = new StringBuilder("12345");
		builder.charAt(4);
		builder.replace(2, 4, "6").charAt(3);
//		System.out.println(builder);
		string.replace("123", "1").charAt(2);
//		System.out.println();
//		System.out.println(builder);
		int a=3;
//		int b=Math.floor(a);
		StringBuilder sb=new StringBuilder();
//		sb.co
		var base = "ewe\nsheep\\t";
		System.out.println(base);
		System.out.println(base.length());

		escapeTest();
	}
	public void chronoTest() {
		var date = LocalDate.of(2022, Month.MARCH, 13);
		var time = LocalTime.of(1, 30);
		var zone = ZoneId.of("US/Eastern");
		var dateTime1 = ZonedDateTime.of(date, time, zone);
		var dateTime2 = dateTime1.plus(1, ChronoUnit.HOURS);
	}
	public void roar(String roar1, StringBuilder roar2) {
		roar1.concat("!!!");
		roar2.append("!!!");
		}
	public static void escapeTest() {
		var base = "ewe\nsheep\\t";
		int length = base.length();
		int indent = base.indent(2).length();
		int translate = base.translateEscapes().length();
		var formatted = "%s %s %s".formatted(length, indent, translate);
		System.out.format(formatted);
		System.out.println(":"+ base.indent(2)+":");
	}

}
