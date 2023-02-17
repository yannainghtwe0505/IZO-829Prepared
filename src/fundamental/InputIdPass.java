package fundamental;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputIdPass {

	public static void main(String[] args) throws IOException {
		System.out.println("Please enter username ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String userName = br.readLine();
		System.out.println("Please enter password");
		String password = br.readLine();
		if (userName.toLowerCase().equals("yannainghtwe") && password.toLowerCase().equals("12345678")) {
			System.out.println("両方一致しました");
		} else {
			System.out.println("username と password が違います。");
		}
	}

}
