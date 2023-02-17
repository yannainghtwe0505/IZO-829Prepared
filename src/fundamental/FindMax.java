package fundamental;

public class FindMax {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int age[] = { 12, 4, 6, 3, 76, 5, 8 };
		int max = age[0];
		for (int i = 0; i < age.length; i++) {
			if (max < age[i]) {
				max = age[i];
			}
		}
		System.out.println("Max is " + max);

	}

}
