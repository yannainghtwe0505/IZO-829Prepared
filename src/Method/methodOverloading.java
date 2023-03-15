package Method;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

class Kiwi {
    public static void fly(int numMiles) {
	System.out.println("autoboxing int");
    }

    public static void fly(Integer numMiles) {
	System.out.println("autoboxing Integer");
    }

    public static void walk(int[] ints) {// test close this
	System.out.println("primitive List");
    }

    public static void walk(Integer[] integers) {
	System.out.println("Wrapper List");
    }
}

public class methodOverloading {
    public static void main(String[] args) {
	print("abc");
	print(Arrays.asList(3));
	print(LocalDate.of(2019, Month.JULY, 4));
	System.out.println("Auto Box");
	Kiwi.fly(12);
	System.out.println("Arrays");
	Kiwi.walk(new int[] { 1, 2, 3 });
    }

    public static void print(CharSequence c) {
	System.out.print("C");
    }

    public static void print(List<Integer> i) {
	System.out.print("I");
    }

    public static void print(Object o) {
	System.out.print("O");
    }
}