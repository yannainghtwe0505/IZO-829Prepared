package fundamental;

public class Demo {
	{
		System.out.println("コンストラクタブロックの処理");
	}

	public Demo() {
		System.out.println("私はコンストラクタです。");
	}

	public static void main(String[] args) {
		System.out.println("ｄ1の作成");
		new Demo();
		System.out.println("ｄ2の作成");
		new Demo();
		System.out.println("終了");

	}
}
