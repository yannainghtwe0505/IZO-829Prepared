package fundamental;

public class Booking2 {

	public static void main(String[] args) {
		int age2[] = { 1, 2, 3, 4, 5, 6, 2, 4, 5, 2 };
		for (int i = 0; i < age2.length - 1; i++) {
			for (int j = i + 1; j < age2.length; j++) {
				if (age2[i] == age2[j]) {
					System.out.println("重複データです！i:" + i + ",j:" + j + ",age2[j]" + age2[j]);
					// break;
				}

			}
		}
	}

}
