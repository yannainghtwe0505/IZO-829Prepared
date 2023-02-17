package CollectionsAndGenerics;

public class OyaCar {

	int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed < 100) {
			this.speed = speed;
		} else {
			System.out.println("速すぎます");
		}
	}

}
