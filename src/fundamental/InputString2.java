package fundamental;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputString2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("あなたの好きな文字は何ですか？A？¥nB?¥nC?¥nD?");
		String str = br.readLine();
		switch (str) {
		case "A":
			System.out.println("あなたの好きなお文字は" + str + "です。");
			break;
		case "B":
			System.out.println("あなたの好きなお文字は" + str + "です。");
			break;
		case "C":
			System.out.println("あなたの好きなお文字は" + str + "です。");
			break;
		case "D":
			System.out.println("あなたの好きなお文字は" + str + "です。");
			break;
		default:
			System.out.println("A からDを入力してください。");
			break;
		}

	}

}
