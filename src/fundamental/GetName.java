package fundamental;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetName {
	public static void main(String[] args) throws IOException {
		System.out.println("「私の名前は : - - - -」の形式で入力してください");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String name = str.substring(str.indexOf(":") + 1);
		System.out.println(name);
	}

}
