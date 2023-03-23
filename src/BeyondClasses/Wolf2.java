package BeyondClasses;

non-sealed class test1 extends Wolf2 {
}

class test2 extends test1 {
}

public sealed class Wolf2 permits test1 {
    public static void main(String[] args) {
	var a = new Wolf2();
	var b = new test1();
	var c = new test2();

	System.out.println(b instanceof Wolf2 t);
    }

}
