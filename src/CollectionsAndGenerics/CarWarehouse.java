package CollectionsAndGenerics;

import fundamental.Car;

public class CarWarehouse {
	private Car item;

	//車(文字列）を格納
	public void stock(Car item) {
		this.item = item;
	}

	/*格納した車を返す*/
	public Car leave() {
		Car item = this.item;
		this.item = null;
		return item;

	}

}
