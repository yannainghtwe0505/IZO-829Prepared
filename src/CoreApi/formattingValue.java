package CoreApi;

public class formattingValue {
	public static void main(String[] args) {
		var name = "Kate";
		var orderId = 5;
		var pattern="My name is %s and I order %d item";

		System.out.println("Hello "+name+", order "+orderId+" is ready");
		System.out.println(String.format("Hello %s, order %d is ready",name, orderId));
		System.out.println("Hello %s, order %d is ready".formatted(name, orderId));
		System.out.println("----------");

		System.out.println(String.format(pattern,name,orderId));
		System.out.println(pattern.formatted(name,orderId));

		System.out.println("----------");
		var name2 = "James";
		var score = 90.25;
		var total = 100;
		System.out.println("%s:%n Score: %f out of %d".formatted(name2, score, total));

	}
}
