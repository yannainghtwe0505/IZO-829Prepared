package CollectionsAndGenerics;

public class UseKoFormula {

	public static void main(String[] args) {

		OyaCar oc = new OyaCar();
		oc.setSpeed(100);
		oc.setSpeed(8);
		System.out.println("oc.speed:" + oc.speed);

		KoFormula kf = new KoFormula();
		kf.setSpeed(80);
		kf.setSpeed(200);
		System.out.println("kf.speed:" + kf.speed);
	}

}
