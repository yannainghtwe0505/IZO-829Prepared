package CollectionsAndGenerics;

public class KoAb2 extends AbClass {

	int num;

	@Override
	void setParam(int n) {
		num=n;
		System.out.println("KoAb2:" + n + "を設定");
	}

	void showParam() {
		System.out.println("num:" + num);
	}

}
