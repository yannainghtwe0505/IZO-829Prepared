package CollectionsAndGenerics;

public class KoFormula extends OyaCar {
	//int speed,定義済みの状態
	public void setSpeed(int speed) {
		if (speed < 200) {
			this.speed = speed;
		} else {
			System.out.println("速すぎます");
		}
	}

}
