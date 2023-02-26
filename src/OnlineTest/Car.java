package OnlineTest;

import java.awt.Rectangle;

class Car {
	private int speed;
	private int mileage;

	public Rectangle(int speed, int mileage) {
    this.speed = speed;
    this.mileage = mileage;
    }

	public int getspeed() {
		return speed;
	}

	public int getmileage() {
		return mileage;
	}
}

public class Vehicle {
	public static void main(String[] args) {
		private int a = 60;
		private int b = 30;
		Rectangle rect = new Rectangle(a, b);
		System.out.println(rect.getspeed() + ", " + rect.getmileage());
	}
}