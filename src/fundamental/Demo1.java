package fundamental;

public class Demo1 {
	public static void main(String[] args) {
		try {
			int num1 = 10;
			int num2 = 0;
			int result = num1 / num2;
			System.out.println("計算を実行");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("正常に終了しました。");
	}

}
