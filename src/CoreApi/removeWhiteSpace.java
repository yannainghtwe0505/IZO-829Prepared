package CoreApi;

public class removeWhiteSpace {
	public static void main(String[] args) {
		char ch = '\u2000';
		System.out.println("abc".strip()); // abc
		System.out.println("\t a b c\n".strip()); // a b c
		String text = " abc\t"+ch;
		System.out.println(text.trim().length()); // 3
		System.out.println(text.trim()); // 3

		System.out.println(text.strip().length()); // 3
		System.out.println(text.strip()); // 3
		System.out.println(text.stripLeading().length()); // 5
		System.out.println(text.stripTrailing().length());// 4
	}

}
