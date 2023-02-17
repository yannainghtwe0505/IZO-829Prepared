package fundamental;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SplitString {

	public static void main(String[] args) throws IOException {

		System.out.println("文書を入力してください。読点を入力しるところで分割されます。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String stArr[] = str.split(",");
		for (int i = 0; i < stArr.length; i++) {
			String string = stArr[i];
			System.out.println(string);

		}

	}

}
