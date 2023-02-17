package fundamental;

public class Vehicle {
	int speed;
	double gasoline;

	void setSpeed(int sp) {
		speed = sp;
	}

	void showSpeed() {
		System.out.println("speed :" + speed);
	}

	void setCar(int sp) {
		speed = sp;
		gasoline = 0.0;
	}

	void setCar(double gs) {
		speed = 0;
		gasoline = gs;
	}

	void setCar(int sp, double gs) {
		speed = sp;
		gasoline = gs;
	}

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.setSpeed(20);
		v.showSpeed();

		Vehicle v2 = new Vehicle();
		v2.setSpeed(200);
		v2.showSpeed();
		v.showSpeed();

	}

}
