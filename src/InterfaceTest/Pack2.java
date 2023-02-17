package pkg2;

public class Pack2 {

	public int p3, p4;

	public void setP(int p1, int p2) {
		this.p3 = p1;
		this.p4 = p2;
		System.out.println("フィールドを設定しました。");
	}

	public void showP() {
		System.out.println("P1 :" + p3);
		System.out.println("P2 :" + p4);
	}

	public static void main(String[] args) {

	}
}
