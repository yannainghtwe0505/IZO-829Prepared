package fundamental;

public class StrEqual {

	public static void main(String[] args) {

		String s1 = "ABC";
		String s2 = "abC";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contentEquals(s2));

	}

}
