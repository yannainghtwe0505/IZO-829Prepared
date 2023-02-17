package CollectionsAndGenerics;

public class Warehouse {
	private Object item;

	//	物を格納
	public void stock(Object item) {
		this.item = item;
	}

	// 物を取り出す
	public Object leave() {
		Object item = this.item;
		this.item = null;
		return item;
	}

}
