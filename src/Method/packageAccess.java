package Method;

public class packageAccess {
    String noise = "quack";

    void quack() {
	System.out.print(noise); // package access is ok
    }
}
