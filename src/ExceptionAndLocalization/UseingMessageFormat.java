package ExceptionAndLocalization;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public class UseingMessageFormat {
    public static void main(String[] args) {
	var rb=ResourceBundle.getBundle("Zoo");
	String format = rb.getString("helloByName");
	System.out.print(MessageFormat.format(format, "Tammy", "Henry"));
    }

}
