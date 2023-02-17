package CollectionsAndGenerics;

public class Ko extends Oya {
	int num1;

	public Ko() {
		this(9);
		System.out.println("Koクラスのコンストラクタ");
	}

	public Ko(int n) {
		super(6);
		num1 = n;
		System.out.println("Koクラスのコンストラクタの引数あり；" + num1);
	}

	void showNum1() {
		System.out.println("num1 :" + num1);
	}

}
