package LambadasAndFunctionalP;

import java.util.function.Consumer;

public class ValidLambadaVariables {
    static int a=30;
    int b=40;
    public static void main(String[] args) {
	
    }
    public void test(int c) {
	a=50;
	b=40;
	
	int d=50;

	Consumer<Integer> consumer=s->{s=40;System.out.println(a+b+c+d);};
    }
}
