package Method;

public class tempAccessModifier {

	public static void main(String[] args) {
		priavteAccess duck=new priavteAccess();
		//private access
		duck.quack(); // DOES NOT COMPILE
		System.out.print(duck.noise);
		//package access same package
		packageAccess pk=new packageAccess();
		pk.quack();
		System.out.println(pk.noise);
	}
}
