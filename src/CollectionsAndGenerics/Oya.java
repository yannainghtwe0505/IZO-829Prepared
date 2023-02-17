package CollectionsAndGenerics;

public class Oya {

	int num;

	public Oya() {
		System.out.println("Oyaクラスのコンストラクタ");
	}

	public Oya(int n) {
		num = n;
		System.out.println("Oyaクラスのコンストラクタの引数あり：" + num);
	}

	public void setNum(int num) {
		this.num = num;
	}

	void showNum() {
		System.out.println("num1 :" + num);
	}

}
