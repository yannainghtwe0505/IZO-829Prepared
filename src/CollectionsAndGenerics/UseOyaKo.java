package CollectionsAndGenerics;

public class UseOyaKo {
	public static void main(String[] args) {
		Oya[] oarr = new Oya[4];
		oarr[0] = new Oya();
		oarr[1] = new Ko1();//新クラス型の変数
		oarr[2] = new Ko2();//新クラス型の変数
		oarr[3] = new Ko3();//新クラス型の変数

		for (int i = 0; i < oarr.length; i++) {
			Oya oya = oarr[i];
			oya.setNum(15);
			oya.showNum();
		}

	}
}
