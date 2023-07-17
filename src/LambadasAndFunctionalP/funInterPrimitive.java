package LambadasAndFunctionalP;

import java.util.function.BooleanSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntFunction;

public class funInterPrimitive {
    public static void main(String[] args) {
	BooleanSupplier b1=()->true;
	BooleanSupplier b2=()->Math.random()>5;
	System.out.println(b1.getAsBoolean());
	
	var d = 1.0;

	ToIntFunction<Double> f1 = x -> 1;

	f1.applyAsInt(d);
    }
}
