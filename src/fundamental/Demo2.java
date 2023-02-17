package fundamental;

public class Demo2 {
	public static void main(String[] args) {
		try {
			char[] str = { 'I', 'L', 'U' };
			System.out.println(str[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("正常に終了しました。");
		}

	}
}
