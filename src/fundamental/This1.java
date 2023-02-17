package fundamental;

public class This1 {
	int val;

	public This1() {
		val = 20;
		System.out.println("引数無しのコンストラクタ実行");
	}

	public This1(int val) {
		this();
		this.val = val;
		System.out.println("引数無しのコンストラクタでvalの値変更　：" + val);
	}

	public This1(int i1, int i2) {
		this(i1);
	}

	void showVal() {
		System.out.println("valの値　：" + val);
	}

	void setVal(int val) {
		this.val = val;
		showVal();
	}

	void setVal2(int val) {
		this.val = val;
		showVal();
	}

	public static void main(String[] args) {
		This1 t1 = new This1();
		System.out.println("Set val");
		t1.setVal(100);
		System.out.println("Set val2");
		t1.setVal2(40);
		System.out.println("****************");
		new This1(100);
		System.out.println("****************");
		new This1(300, 300);

	}

}
