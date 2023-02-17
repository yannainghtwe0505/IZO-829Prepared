package fundamental;

public class ThrowDemo {

	public static void buy(String price) throws Exception {
		try {
			if (price != null) {
				Double.parseDouble(price);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());	
			throw new Exception("価格は数値が必要です");
		}
	}

	public static void main(String[] args) throws Exception {

		try {
			buy("");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
