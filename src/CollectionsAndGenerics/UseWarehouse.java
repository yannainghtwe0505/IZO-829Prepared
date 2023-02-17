package CollectionsAndGenerics;

import fundamental.Car;

public class UseWarehouse {

	public static void main(String[] args) {
		/*comput warehouse	を収納*/
		Warehouse computerWh = new Warehouse();
		computerWh.stock("computer");

		/*car warehouse　を収納*/
		Warehouse carWh = new Warehouse();
		Car c1 = new Car();
		computerWh.stock(c1);

		//収納したものを取り出す
		String cpu = (String) computerWh.leave();
		Car c2 = (Car) carWh.leave();

		//正しいなくてもエラーにならない
		Car c3 = (Car) computerWh.leave();

		ComputerWarehouse comWh = new ComputerWarehouse();
		comWh.stock("Computer");

		CarWarehouse cwh = new CarWarehouse();
		Car c4 = new Car();
		cwh.stock(c4);

		Car c5 = (Car) computerWh.leave();
		Car c6 = (Car) cwh.leave();

	}

}
