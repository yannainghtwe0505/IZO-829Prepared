package fundamental;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number {

	private int n1, n2;

	public Number(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	void addition() {
		System.out.println(n1 + n2);
	}

	void subtraction() {
		System.out.println(n1 - n2);
	}

	void multiplication() {
		System.out.println(n1 * n2);
	}

	void division() {
		System.out.println(n1 / n2);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first int value ");
		String first = br.readLine().trim();
		System.out.println("Enter second int value ");
		String second = br.readLine().trim();

		Number num = new Number(Integer.parseInt(first), Integer.parseInt(second));
		num.addition();
		num.subtraction();
		num.multiplication();
		num.division();

	}

}
