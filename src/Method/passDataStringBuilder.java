package Method;

public class passDataStringBuilder {
//    public class Dog {
    public static void main(String[] args) {
	var name = new StringBuilder("Webby");
	speak(name);
	System.out.println(name); // WebbyGeorgette
	var s1 = new StringBuilder("s1");
	var s2 = new StringBuilder("s2");
	var s3 = work(s1, s2);
	System.out.println("s1 = " + s1);
	System.out.println("s2 = " + s2);
	System.out.println("s3 = " + s3);
    }

    public static void speak(StringBuilder s) {
	s.append("Georgette");
    }

    public static StringBuilder work(StringBuilder a, StringBuilder b) {
	a = new StringBuilder("a");
	b.append("b");
	return a;
    }

}
