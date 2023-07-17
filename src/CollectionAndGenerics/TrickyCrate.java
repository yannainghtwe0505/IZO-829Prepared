package CollectionAndGenerics;

public class TrickyCrate<T> {
    public <T> T tricky(T t) {
	return t;
    }
    public static String  crateName() {
	Robot r=new Robot();
	TrickyCrate<Robot> crate=new TrickyCrate<>();
	return crate.tricky("");
    }
    public static void main(String[] args) {
	System.out.println(crateName());
    }
}
class Robot{}
 	 
