package CollectionsAndGenerics;

public class ComputerWarehouse {

	private String item;

	//車(文字列）を格納
	public void stock(String item) {
		this.item = item;
	}

	/*格納した車を返す*/
	public String leave() {
		String item = this.item;
		this.item = null;
		return item;

	}

}
