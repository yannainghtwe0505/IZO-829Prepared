package CoreApi;

public class internPool {
	public static void main(String[] args) {
		var name = "Hello World";
		var name2 = new String("Hello World").intern();
		System.out.println(name == name2); // true


		 var first = "rat" + 1;
		 var second = "r" + "a" + "t" + "1";
		 var third = "r" + "a" + "t" + new String("1");
		 System.out.println(first == second);
		 System.out.println(first == second.intern());
		  System.out.println(first == third);
		 System.out.println(first == third.intern());
	}
}
