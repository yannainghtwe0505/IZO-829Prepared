package Method;

public class returnType {
	public static void main(String[] args) {
		System.out.println(hike8(1));
		hike2();

	}
	static String   hike8(int a) {
		if (1 < 2) return "orange";
		return "apple"; // COMPILER WARNING
		}
	public static void hike2() {
		System.out.println("I love you ");
		return; }
}
