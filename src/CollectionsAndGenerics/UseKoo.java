package CollectionsAndGenerics;

public class UseKoo {

	public static void main(String[] args) {
		
			AbClass abarr[]=new AbClass[2];//配列のメモリ確保!=実態の作成
			abarr[0]=new KoAb1();
			abarr[1]=new KoAb2();
			for (int i = 0; i < abarr.length; i++) {
				AbClass abClass = abarr[i];
				abClass.setParam(55);
				abClass.showParam();
				
			}
	}
}
