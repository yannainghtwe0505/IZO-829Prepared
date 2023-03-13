package CoreApi;

public class startEnd {
	public static void main(String[] args) {
		System.out.println("abc".startsWith("ab")); // true
		System.out.println("abc".startsWith("A")); // false
		System.out.println("abc".endsWith("c")); // true
		System.out.println("abc".endsWith("a")); // false
		System.out.println("abc".contains("b")); // true
		System.out.println("abc".contains("B")); // false
	}

}
