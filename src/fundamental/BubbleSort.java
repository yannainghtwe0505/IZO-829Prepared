package fundamental;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int age[] = { 1, 2, 36, 363, 56, 95, 12, 32, 1232, 3263 };

		for (int i = 0; i < age.length; i++) {
			for (int j = i + 1; j < age.length; j++) {
				if (age[i] > age[j]) {
					int temp = age[i];
					age[i] = age[j];
					age[j] = temp;
				}

			}
		}
		System.out.println(Arrays.toString(age));
		int age2[] = { 1, 2, 36, 363, 56, 95, 12, 32, 1232, 3263 };
		Arrays.sort(age2);
		System.out.println(Arrays.toString(age2));

	}

}
