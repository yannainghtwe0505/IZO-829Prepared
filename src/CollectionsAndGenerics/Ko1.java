package CollectionsAndGenerics;

public class Ko1 extends Oya {

	//独自ていぎする
	int num2;

	void addNum(int adnum) {
		num += adnum;
	}

	void showNum2() {
		System.out.println("Ko1:num:" + num);
		System.out.println("Ko1:num2:" + num2);
	}

	void showNum() {
		showNum2();
	}

	void setNumx(int n1, int n2) {
		super.setNum(n1);
		num2 = n2;
	}
}
