package fundamental;

public class StringLength {

	public static void main(String[] args) {

		String str = "abcdefg";
		int length = str.length();
		System.out.println(length);
		char chars[] = { 'a', 'b', 'c' };
		String s = new String(chars);
		int len = s.length();
		System.out.println(len);
		System.out.println(s.charAt(1));
		System.out.println(str.charAt(3));
	}

}
