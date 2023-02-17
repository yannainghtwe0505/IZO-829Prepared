package CollectionsAndGenerics;

public class Ko3 extends Oya {

	int num4;

	public void setNum(int n) {
		super.setNum(n);
		num4 = 4;
	}

	void setNumx(int n1, int n2) {
		super.setNum(n1);
		num4 = n2;
	}

	void showNum() {
		super.showNum();
		System.out.println("Ko3:num:" + num);
		System.out.println("Ko3:num4:" + num4);
	}
}
