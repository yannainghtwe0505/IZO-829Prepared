package CollectionsAndGenerics;

public class KoAb1 extends AbClass {

	int num;
	@Override
	void setParam(int n) {
		System.out.println("引数"+n+"を設定");
		num=n;
	}
	void showParam() {
		System.out.println("num:"+num);
	}

}
