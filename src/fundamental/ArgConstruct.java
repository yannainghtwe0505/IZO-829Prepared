package fundamental;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArgConstruct {

	public ArgConstruct(int first, int second) {
		boolean cond = first > second;

		if (cond) {
			System.out.println("大きい方　：　" + first);
		} else {
			System.out.println("大きい方　：　" + second);
		}

	}

	public ArgConstruct(String first, String second) {
		boolean cond = first.equals(second);

		if (cond) {
			System.out.println("文字列値は同じです。");
		} else {
			System.out.println("文字列値は違います。");
		}

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first int value ");
		String first = br.readLine().trim();
		System.out.println("Enter second int value ");
		String second = br.readLine().trim();

		new ArgConstruct(Integer.parseInt(first), Integer.parseInt(second));

		System.out.println("========================================");
		System.out.println("Enter first string value ");
		String firstLine = br.readLine();
		System.out.println("Enter second string value ");
		String secondLine = br.readLine();

		new ArgConstruct(firstLine, secondLine);

	}

}
