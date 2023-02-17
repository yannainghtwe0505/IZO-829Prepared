package CollectionsAndGenerics;

public class Plane implements IMovable {

	int num;
	double gas;

	@Override
	public void setParam(int n, double g) {

		num = n;
		gas = g;
		System.out.println("num :" + num + ",飛行機のgas :" + gas);
	}

	@Override
	public void showParam() {
		System.out.println(num + "便の飛行機です");
		System.out.println(gas + "です");

	}

}
