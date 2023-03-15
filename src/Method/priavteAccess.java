package Method;

public class priavteAccess {
	private String noise = "quack";
	 private void quack() {
	 System.out.print(noise); // private access is ok
	 }
}
