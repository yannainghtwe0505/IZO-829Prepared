package LambadasAndFunctionalP;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class implementUniaryAndBinaryOperator {
    public static void main(String[] args) {
	UnaryOperator<String> u1=String::toUpperCase;
	UnaryOperator<String > u2=(s)->s.toUpperCase();
	System.out.println(u1.apply("yannaing"));
	System.out.println(u2.apply("yannainghtwe"));
	System.out.println("------------------");
	BinaryOperator<String> b1=String::concat;
	BinaryOperator<String> b2=(s1,s2)->s1.concat(s2);
	System.out.println(b1.apply("hello1", "world"));
	System.out.println(b2.apply("hello1", " world"));
    }

}
