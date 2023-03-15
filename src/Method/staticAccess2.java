package Method;

public class staticAccess2 {
    static String name = "bu";

    public static void main(String[] args) {
	// Calling the static method from another static method
	staticMethod();
	staticAccess2 st = new staticAccess2();
	st = null;
	System.out.println(st.name);

	// Creating an instance of Example class
	staticAccess2 example = new staticAccess2();
	// Calling the instance method which in turn calls the static method
	example.instanceMethod();
    }

    public static void staticMethod() {
	System.out.println("This is a static method.");
    }

    // Instance method
    public void instanceMethod() {
	System.out.println("This is an instance method.");
	// Calling the static method from instance method
	staticMethod();
    }
}
