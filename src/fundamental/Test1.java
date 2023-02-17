package fundamental;

public class Test1 {

	public static void main(String[] args) {
		String str = "abcdefghaa";
		int id1 = str.indexOf("a");
		int id2 = str.lastIndexOf("a");
		int id3 = str.lastIndexOf("a", 8);
		int id4 = str.indexOf("a", 1);
		System.out.println(" index of a" + id1 + ",last index of a" + id2);
		System.out.println(id3 + "," + id4);

	}
}
