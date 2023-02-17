package CollectionsAndGenerics;

public class Travel {

	public static void main(String[] args) {

		IMovable ims[] = new IMovable[2];
		ims[0] = new Car();
		ims[1] = new Plane();

		for (int i = 0; i < ims.length; i++) {
			IMovable iMovable = ims[i];
			iMovable.setParam(777, 50.3);
			iMovable.showParam();

		}
	}

}
