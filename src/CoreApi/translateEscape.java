package CoreApi;

public class translateEscape {
	public static void main(String[] args) {
		System.out.println("s\tb");
		System.out.println("s\"b");
		var text="s\\\"b";
		System.out.println(text.translateEscapes());
	}

}
