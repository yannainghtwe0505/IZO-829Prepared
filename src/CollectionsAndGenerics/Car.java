package CollectionsAndGenerics;

public class Car implements IMovable {

	int num;
	double gas;

	@Override
	public void setParam(int n, double g) {

		num = n;
		gas = g;
		System.out.println("num :" + num + ",gas :" + gas);
	}

	@Override
	public void showParam() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
