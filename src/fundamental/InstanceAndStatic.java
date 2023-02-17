package fundamental;

public class InstanceAndStatic {
	static int snum;
	int inum;

	static void sShow() {
		InstanceAndStatic is = new InstanceAndStatic();
		is.inum = 40;
		System.out.println("クラス変数の入力" + snum);
		System.out.println("クラス変数の入力" + is.inum);
	}

	void show() {
		System.out.println("クラス変数の入力" + snum);
		System.out.println("クラス変数の入力" + inum);
	}

	void setValue() {
		snum = 20;
		inum = 30;
	}

	public static void main(String[] args) {
		InstanceAndStatic is = new InstanceAndStatic();
		is.setValue();
		is.show();
		InstanceAndStatic.sShow();

	}
}
