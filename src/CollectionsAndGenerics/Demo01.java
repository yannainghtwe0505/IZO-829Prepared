package CollectionsAndGenerics;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for (;;) {
			String a = sc.next();
			String b = sc.next();
			int num = a.compareTo(b);
			System.out.println(num);
			}

	}
}
