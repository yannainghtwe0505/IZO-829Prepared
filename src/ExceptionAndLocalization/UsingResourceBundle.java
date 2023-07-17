package ExceptionAndLocalization;

import java.util.Locale;
import java.util.ResourceBundle;

public class UsingResourceBundle {
    public static void printWelcomeMessage(Locale locale) {
//	var us = new Locale("en", "US");
//	ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
//	rb.keySet().stream().map(k -> k + ": " + rb.getString(k)).forEach(System.out::println);
	 var rb = ResourceBundle.getBundle("Zoom", locale);
	 System.out.println(rb.getString("hello")
	 + ", " + rb.getString("open"));
    }

    public static void main(String[] args) {
	Locale.setDefault(new Locale("en","US"));
	var us = new Locale("en", "US");
	var france = new Locale("fr", "FR");
	printWelcomeMessage(us); // Hello, The zoo is open
	printWelcomeMessage(france); // Bonjour, Le zoo est ouvert

    }

}
