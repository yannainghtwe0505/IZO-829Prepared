package CoreApi;

public class equalAndIngorecase {
	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {1,2,3};
		System.out.println(a.equals(b));

		System.out.println("abc".startsWith("ab")); // true
		System.out.println("abc".startsWith("A")); // false
		System.out.println("abc".endsWith("c")); // true
		System.out.println("abc".endsWith("a")); // false
		System.out.println("abc".contains("ab")); // true
		System.out.println("abc".contains("B")); // false


		System.out.println("abcabc".replace('a', 'A')); // AbcAbc
		System.out.println("abcabc".replace("a", "AA")); // AbcAbc

		char ch = '\u2000';
		System.out.println();
		System.out.println("abc".strip()+"*"); // abc
		System.out.println("\t a b c\n".strip()+"*"); // a b c
		System.out.println("------------------------------");
		String text = " abc\t ";
		System.out.println(text+"*");
		System.out.println(text.trim().length()+"*"); // 3
		System.out.println(text.strip().length()+"*"); // 3
		System.out.println(text.stripLeading().length()+"*"); // 5
		System.out.println(text.stripTrailing().length()+"*");// 4
		System.out.println("************");
		String t=" hello"+ch;
		System.out.println(t.strip().length());
		System.out.println(t.trim().length());

	}

}
