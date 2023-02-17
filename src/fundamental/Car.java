package fundamental;

public class Car {

	int number;
	double gasoline;

	public Car() {
		number = 1;
		gasoline = 2.2;
	}

	public Car(int num) {
		number = num;
		gasoline = 2.2;
		System.out.println("引数付きのコンストラクタ(number)");
	}

	public Car(double gs) {
		number = 1;
		gasoline = gs;
		System.out.println("引数付きのコンストラクタ(gasoline)");

	}

	public Car(int num, double gs) {
		number = num;
		gasoline = gs;
		System.out.println("引数付きのコンストラクタ(number/gasoline)");

	}

	void setCar(int num, double gs) {
		number = num;
		gasoline = gs;
		System.out.println("ナンバーとがスリン量を変更しました");
	}

	void showCar() {
		System.out.println("number is " + number + "です");
		System.out.println("がスリンは" + gasoline + "です");
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.showCar();

		c.setCar(4, 345.0);
		c.showCar();
		System.out.println("-----------------------------");
		Car c3 = new Car(10);
		Car c4 = new Car(55.5);
		Car c5 = new Car(10, 55.5);
		c3.showCar();
		c4.showCar();
		c5.showCar();
	}

}
