package BeyondClasses;

public record recordTest(int name, int age) {

    public recordTest(int name, int age, int b) {
	this(name, age + b);
	age = 70;

    }

    public static void main(String[] args) {
	var a = new recordTest(3, 6, 6);
	var b = new recordTest(3, 6, 7);
	System.out.println(a.equals(b));
	System.out.println(b.hashCode());
	System.out.println(a);
	System.out.println(a.name);
	System.out.println(a.age);

    }

    public recordTest {
	name = name + 10;
	age = age + 20;
    }

}
