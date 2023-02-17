package CollectionsAndGenerics;

public class Warehouse2<T> {

	private T item;

	public void stock(T item) {
		this.item = item;
	}

	public T leave() {
		T item = this.item;
		this.item = null;
		return item;
	}

}
