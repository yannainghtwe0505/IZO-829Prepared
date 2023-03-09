package CoreApi;

public class equality {
	public static void main(String[] args) {
		var one = new StringBuilder();
		var two = new StringBuilder();
		var three = one.append("a");
		System.out.println(one == two); // false
		System.out.println(one == three); // true
		System.out.println(one);
		System.out.println(three);
		System.out.println(one.equals(two));
	}

}
