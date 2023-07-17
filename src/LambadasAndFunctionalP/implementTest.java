package LambadasAndFunctionalP;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class implementTest {
    public static void main(String[] args) {
	Supplier<String> methodref=String::new;
	methodref.get();
	Predicate<String>methodref2=String::isEmpty;
	System.out.println(methodref2.test(""));
//	BiFunction<Integer, Intege, R>
	BinaryOperator<Integer> methodref3=Integer::max;
	System.out.println(methodref3.apply(4, 5));
	
    }

}
 