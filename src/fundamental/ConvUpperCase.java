package fundamental;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvUpperCase {
	public static void main(String[] args) throws IOException {
		System.out.println("小文字の文例を入力 ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println("大文字　：" + str.toUpperCase());
	}

}
