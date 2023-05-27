package LambadasAndFunctionalP;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class implentSupplir {
	
	
	public static void main(String[] args) {
		Supplier<LocalDate> s1=LocalDate::now;
		Supplier<LocalDate> s2=()->LocalDate.now();
		LocalDate d1=s1.get();
		LocalDate d2=s2.get();
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("---------------------");
		Supplier<StringBuilder> s11=StringBuilder::new;
		Supplier<StringBuilder> s12=()->new StringBuilder();
		System.out.println(s11.get());
		System.out.println(s12.get());
		Supplier<ArrayList<String>> s3=ArrayList::new;
		ArrayList<String> a1=s3.get();
		System.out.println(s3);
		
	}
	

}
