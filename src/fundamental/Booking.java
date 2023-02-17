package fundamental;

public class Booking {
	public static void main(String[] args) {
		int age[] = { 1, 2, 3, 4, 5, 6, 5 };
		System.out.println("age.length:" + age.length + "\nage.length-1:" + (age.length - 1));
		for (int i = 0; i < age.length - 1; i++) {
			for (int j = i + 1; j < age.length; j++) {
				// System.out.println("i:" + i + ",j:" + j);
				if (age[i] == age[j]) {
					System.out.println("重複です！i:" + i + ",j:" + j);
					break;
				}
			}
		}
	}

}
