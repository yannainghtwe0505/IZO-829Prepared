package fundamental;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckInputStr {

	public static void main(String[] args) throws IOException {

		System.out.println("6文字以上の文字例を入力してください");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		if (str.length() < 6) {
			System.out.println("長さが足りない");
			str = br.readLine();
		} else {
			System.out.println("正しい");
		}
	}

}
