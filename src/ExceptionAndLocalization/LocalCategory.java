package ExceptionAndLocalization;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Locale.Category;

public class LocalCategory {
    public static void printCurrency(Locale locale, double money) {
	System.out.println(NumberFormat.getCurrencyInstance().format(money) + ", " + locale.getDisplayLanguage());
    }

    public static void main(String[] args) {
	var spain = new Locale("es", "ES");
	var money = 1.23;

	// Print with default locale
	Locale.setDefault(new Locale("en", "US"));
	printCurrency(spain, money); // $1.23, Spanish
	// Print with selected locale display
	Locale.setDefault(Category.DISPLAY, spain);
	printCurrency(spain, money); // $1.23, español
	// Print with selected locale format
	Locale.setDefault(Category.FORMAT, spain);
	printCurrency(spain, money); // 1,23 €, español
//	 Locale.setDefault(us);
    }

}
