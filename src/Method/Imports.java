package Method;

//import static Imports2.name;
public class Imports {
    private static final int a;
    static {
	a = 39;
    }

    static void execute(Object num) {
	System.out.print("4-");
    }

    public static void main(String[] args) {
// Arrays.asList("one"); // DOES NOT COMPILE
	Imports2.name = "b";
//	name="";
	var a = 9 * (long) 9;
	execute(900.3F);

    }

}
