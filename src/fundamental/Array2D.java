package fundamental;

public class Array2D {

	public static void main(String[] args) {
		int[][] age = { { 1, 2 }, { 3, 4, 8, 9 }, { 5, 6, 7, 8 }, { 0 } };
		for (int i = 0; i < age.length; i++) {
			// System.out.println("age[" + i + "].length:" + age[i].length);
			for (int j = 0; j < age[i].length; j++) {
				System.out.println("age[" + i + "][" + j + "]:" + age[i][j]);
			}
		}
		// System.out.println("age[2][3];" + age[2][3]);

	}

}
