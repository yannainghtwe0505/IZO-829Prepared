package ExceptionAndLocalization;

import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.util.Locale;
import java.util.stream.Stream;

public class CompactNumberForamatter {
    public static void main(String[] args) {
	var formatters = Stream.of(
		NumberFormat.getCompactNumberInstance(),
		NumberFormat.getCompactNumberInstance(Locale.getDefault(), Style.SHORT),
		NumberFormat.getCompactNumberInstance(Locale.getDefault(), Style.LONG),
		NumberFormat.getCompactNumberInstance(Locale.GERMAN, Style.SHORT),
		NumberFormat.getCompactNumberInstance(Locale.GERMAN, Style.LONG), 
		NumberFormat.getNumberInstance());
//	formatters.map(s -> s.format(7_123_456)).forEach(System.out::println);
	System.out.println("-------");
	formatters.map(s -> s.format(314_900_000)).forEach(System.out::println);
	System.out.println(Locale.getDefault());
    }

}
