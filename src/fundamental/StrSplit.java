package fundamental;

public class StrSplit {

	public static void main(String[] args) {
		String text = "maybe,milk,yougurt";
		String drink[] = text.split(",");
		for (int i = 0; i < drink.length; i++) {
			System.out.println(drink[i]);

		}
	}

}
