package LambadasAndFunctionalP;
interface Converter {
	long round(double num);
}
public class callingStaticMethod {
	public static void main(String[] args) {
		Converter methodRef = Math::round	;
		Converter lambada = x -> Math.round(x);
		System.out.println(methodRef.round(10.1));
		System.out.println(lambada.round(10.5));;
	}

}
