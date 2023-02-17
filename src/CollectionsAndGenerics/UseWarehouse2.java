package CollectionsAndGenerics;

import fundamental.Car;

public class UseWarehouse2 {

	public static void main(String[] args) {

		/*Warehouse2<データ＞で指定すること*/
		Warehouse2<String> computerWh = new Warehouse2<>();
		computerWh.stock("computer");

		/*同じクラスで違い型を使う*/
		Warehouse2<Car> carWh = new Warehouse2<>();
		Car c1 = new Car();
		carWh.stock(c1);

		/*型変換なしで取得できる*/
		String str = computerWh.leave();
		Car c2 = carWh.leave();

	}

}
