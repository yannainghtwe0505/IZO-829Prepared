package fundamental;

public class Array {

	public static void main(String[] args) {

		// 初期化
		int age[] = new int[10];
		System.out.println("age length is " + age.length);
		for (int i = 0; i < age.length; i++) {
			age[i] = i;
			System.out.println("i:" + i + ",age[" + i + "]:" + age[i] + " ");

		}

	}

}
