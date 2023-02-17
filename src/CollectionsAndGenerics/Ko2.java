package CollectionsAndGenerics;

public class Ko2 extends Oya {
	int num3;

	public void setNum(int n) {
		super.setNum(n);
		num3 = 2;
	}

	void setNumx(int n1, int n2) {
		super.setNum(n1);
		num3 = n2;
	}

	void showNum() {
		super.showNum();
		System.out.println("Ko2:num:" + num);
		System.out.println("Ko2:num3:" + num3);
	}

}
