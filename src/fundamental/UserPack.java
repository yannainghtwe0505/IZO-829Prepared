package fundamental;

import pkg2.Pack2;

public class UserPack {
	public static void main(String[] args) {
		System.out.println("Pack1のインスタントを生成");
		Pack1 p1 = new Pack1();
		p1.p1 = 20;
		p1.setP(100, 50);
		p1.showP();

		Pack2 p2 = new Pack2();
		p2.p3 = 30;
		p2.setP(200, 100);
		p2.showP();

	}

}
