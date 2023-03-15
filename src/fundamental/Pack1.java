package fundamental;

import Method.protectedAccess;

public class Pack1{
	int p1, p2;

	void setP(int p1, int p2) {
		this.p1 = p1;
		this.p2 = p2;
		System.out.println("フィールドを設定しました。");
	}

	void showP() {
		System.out.println("P1 :" + p1);
		System.out.println("P2 :" + p2);
	}

	public static void main(String[] args) {
		protectedAccess pk=new protectedAccess();
		pk.number=20;

	}


}
