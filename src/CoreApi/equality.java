package CoreApi;

public class equality {
	public static void main(String[] args) {
		StringBuilder one = new StringBuilder("hi");
		StringBuilder two = new StringBuilder("bi");
		StringBuilder three = one.append("a");
		System.out.println(one == two); // false
		System.out.println(one == three); // true
		System.out.println(one);
		System.out.println(three);
		System.out.println(one.equals(two));

		StringBuilder sb1 = new StringBuilder("hello");
		StringBuilder sb2 = new StringBuilder("hello");

//		String str1 = sb1.toString();
//		String str2 = sb2.toString();

		boolean isEqual = sb1.equals(sb2);
	}

}
