package ExceptionAndLocalization;

import java.util.Properties;

public class ZooOptions {
    public static void main(String[] args) {
	 var props = new Properties();
	 props.setProperty("name", "Our zoo");
	 props.setProperty("open", "10am");

	 System.out.println(props.get("open"));
	 System.out.println(props.getProperty("camel")); // null
	 System.out.println(props.getProperty("camel", "Bob")); // Bo
	 }

}
