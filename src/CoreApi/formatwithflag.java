package CoreApi;

public class formatwithflag {
	public static void main(String[] args) {
		var pi = 3.14159265359;
		System.out.format("[%f]",pi); // [3.141593]
		System.out.format("[%12.8f]",pi); // [ 3.14159265]
		System.out.format("[%012f]",pi); // [00003.141593]
		System.out.format("[%012.2f]",pi); // [ 3.14]
		System.out.format("[%.3f]",pi); // [3.142]
	}

}
