package CollectionsAndGenerics;

public class UseKo {

	public static void main(String[] args) {

		Ko k1 = new Ko();
		k1.num = 10;
		k1.num1 = 90;

		k1.showNum();
		k1.showNum1();
		System.out.println("===================");
		
		Ko k2=new Ko(200);
		k2.showNum1();
		
	}

}
